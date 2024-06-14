import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/VisitCounterServlet")
public class VisitCounterServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    // Static variable to maintain visit count across servlet instances
    private static int visitCount = 0;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Increment the visit count
        visitCount++;
        
        // Set the visit count as a request attribute
        request.setAttribute("visitCount", visitCount);
        
        // Forward the request to the JSP page
        request.getRequestDispatcher("/visitCounter.jsp").forward(request, response);
    }
}

