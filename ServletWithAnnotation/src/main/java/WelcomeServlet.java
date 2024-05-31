import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/welcome")
public class WelcomeServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html");		//we set the contentType to tell the server that its a html type
		PrintWriter writer = resp.getWriter();  //PrintWriter is like a string buffer
		writer.append("<Html>");
		writer.append("<body>");
		writer.append("<h1>Welcome with Annotation</h1>");
		writer.append("</body>");
		writer.append("</Html>");
		writer.close();				
	}
}
