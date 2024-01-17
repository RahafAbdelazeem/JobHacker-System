package com.example.servletjsp;
import java.io.*;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "Servlet", value = "/factorial-servlet")
class factorialservlet extends HttpServlet {
    private String factorialstable;
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("< head>");
        out.println("<title> factorialstable</title>");
        out.println("<body>");
        out.println("<h1>" + factorialstable + "</h1>");
        out.println("<table>");
        out.println("<tr><td>number</th><th>factorial</th></tr>");
        for ( int i =0;i<=10;i++) {
            long factorialnum = factorialcalaulation(i);
            out.println("<tr><td> " + i + "</td><td>" + factorialnum + "</td></th>");
            out.println("</body");
            out.println("/html");

        }
    }

    public long factorialcalaulation(int number) {
        if (number==0)
            return 1;
        else
            return number*factorialcalaulation(number-1);

    }
}

