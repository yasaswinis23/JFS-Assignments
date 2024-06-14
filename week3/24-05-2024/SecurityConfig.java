import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    // Authentication - in-memory user credentials
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
            .withUser("user1").password("{noop}password1").roles("USER")
            .and()
            .withUser("admin1").password("{noop}password1").roles("ADMIN");
    }

    // Authorization - define access control rules
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
            .antMatchers("/admin/**").hasRole("ADMIN") // Admin pages restricted to ADMIN role
            .antMatchers("/user/**").hasAnyRole("USER", "ADMIN") // User pages accessible to USER and ADMIN roles
            .antMatchers("/").permitAll() // Allow everyone to access the home page
            .and()
            .formLogin(); // Enable form based authentication
    }
}
