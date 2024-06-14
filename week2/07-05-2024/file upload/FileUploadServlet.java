
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;

import java.io.File;
import java.io.IOException;

@WebServlet("/FileUploadServlet")
@MultipartConfig
public class FileUploadServlet extends HttpServlet {
    private static final String UPLOAD_DIRECTORY = "uploads";

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String applicationPath = request.getServletContext().getRealPath("");
        String uploadFilePath = applicationPath + File.separator + UPLOAD_DIRECTORY;

        File uploadDirectory = new File(uploadFilePath);
        if (!uploadDirectory.exists()) {
            uploadDirectory.mkdir();
        }

        for (Part part : request.getParts()) {
            String fileName = part.getSubmittedFileName();
            part.write(uploadFilePath + File.separator + fileName);
        }

        request.setAttribute("message", "File uploaded successfully!");
        request.getRequestDispatcher("uploadResult.jsp").forward(request, response);
    }
}
