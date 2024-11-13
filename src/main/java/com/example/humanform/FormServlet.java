package com.example.humanform;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/formServ")
public class FormServlet extends HttpServlet
{
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");
        String name = request.getParameter("name");
        String phone = request.getParameter("phone");
        String email = request.getParameter("email");
        String age = request.getParameter("age");
        try (PrintWriter out = response.getWriter())
        {
            out.println("<!DOCTYPE html>");
            out.println("<html lang='uk'>");
            out.println("<head><meta charset='UTF-8'><title>User Info</title></head>");
            out.println("<body>");
            out.println("<h1>Enter info: </h1>");
            out.println("<p><strong>SNP: </strong> " + name + "</p>");
            out.println("<p><strong>Phone: </strong> " + phone + "</p>");
            out.println("<p><strong>Email: </strong> " + email + "</p>");
            out.println("<p><strong>Age: </strong> " + age + "</p>");
            out.println("</body></html>");
        }
    }
}
