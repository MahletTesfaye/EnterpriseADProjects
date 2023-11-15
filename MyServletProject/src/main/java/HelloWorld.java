
import java.io.*;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/hello")
public class HelloWorld extends HttpServlet {
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException{
	
		PrintWriter pw = res.getWriter();
		pw.println("Hello World");

		String userName = req.getParameter("username");
		pw.println("Hello," + userName);
		
		int age = Integer.parseInt(req.getParameter("age"));
		pw.printf("I am %d years old!", age);
	}
}
