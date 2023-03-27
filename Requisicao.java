package com.example.helloword;

import java.io.*;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "Cabecalhos", value = "/cabecalhos")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Olá mundo!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        String a = request.getHeader("host");
        String b = request.getHeader("user-agent");
        String c = request.getHeader("accept-encoding");
        String d = request.getHeader("accept-language");


        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");

        out.println("<h1>user agente" + a + "</h1>");
        out.println("<h1>user agente" + b + "</h1>");
        out.println("<h1>user agente" + c + "</h1>");
        out.println("<h1>user agente" + d + "</h1>");


        out.println("</body></html>");
    }

    public void destroy() {
    }
}
