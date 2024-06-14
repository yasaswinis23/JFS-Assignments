import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();
        
        SpringApplication app = new SpringApplicationBuilder()
                .sources(AppConfig.class)
                .web(WebApplicationType.SERVLET)
                .build();
        app.run(args);
    }
}
