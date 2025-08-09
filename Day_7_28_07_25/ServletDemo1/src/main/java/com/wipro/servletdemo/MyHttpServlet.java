package com.wipro.servletdemo;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/myServlet")
public class MyHttpServlet extends HttpServlet{
	
	@Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       
        System.out.println("MyHttpServlet!");
        PrintWriter out =resp.getWriter();

        out.println("<h1>MyHttpServlet</h1>");
    }
	
	

}
