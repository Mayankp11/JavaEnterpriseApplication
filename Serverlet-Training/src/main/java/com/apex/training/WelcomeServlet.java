package com.apex.training;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class WelcomeServlet extends GenericServlet {
	
	@Override
	public void init() throws ServletException {
		System.out.println("Method Init()");
		super.init();
	}

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");		//we set the contentType to tell the server that its a html type
		PrintWriter writer = response.getWriter();  //PrintWriter is like a string buffer
		writer.append("<Html>");
		writer.append("<body>");
		writer.append("<h1>Welcome 1</h1>");
		writer.append("</body>");
		writer.append("</Html>");
		writer.close();				//we should always add this as a good practice
	}
	
	@Override
	public void destroy() {
		System.out.println("Method destroy()");
		super.destroy();
	}
	
	

}
