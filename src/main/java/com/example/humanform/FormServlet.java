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
        String gender = request.getParameter("gender");
        String newsletter = request.getParameter("newsletter") != null ? "Yes" : "No";
        try (PrintWriter out = response.getWriter())
        {
            if (isValidInput(name, phone, email, age, gender))
            {
                out.println("<!DOCTYPE html>");
                out.println("<html lang='uk'>");
                out.println("<head><meta charset='UTF-8'><title>User Info</title></head>");
                out.println("<body>");
                out.println("<h1>Entered Info: </h1>");
                out.println("<p><strong>SNP: </strong> " + name + "</p>");
                out.println("<p><strong>Phone: </strong> " + phone + "</p>");
                out.println("<p><strong>Email: </strong> " + email + "</p>");
                out.println("<p><strong>Age: </strong> " + age + "</p>");
                out.println("<p><strong>Gender: </strong> " + gender + "</p>");
                out.println("<p><strong>Subscribed to Newsletter: </strong> " + newsletter + "</p>");
                out.println("</body></html>");
            }
            else
            {
                out.println("<!DOCTYPE html>");
                out.println("<html lang='uk'>");
                out.println("<head><meta charset='UTF-8'><title>Error</title></head>");
                out.println("<body>");
                out.println("<h1>Error</h1>");
                out.println("<p>Incorrect.</p>");
                out.println("</body></html>");
            }
        }
    }
    private boolean isValidInput(String name, String phone, String email, String age, String gender)
    {
        return name != null && !name.isEmpty() &&
                phone != null && phone.matches("\\+?\\d+") &&
                email != null && email.contains("@") &&
                age != null && age.matches("\\d+") &&
                (gender != null && (gender.equals("Male") || gender.equals("Female") || gender.equals("Other")));
    }
}
