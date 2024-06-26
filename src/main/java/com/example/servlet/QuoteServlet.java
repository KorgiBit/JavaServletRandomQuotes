package com.example.servlet;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class QuoteServlet extends HttpServlet {

    private static final String[] QUOTES = {
            "The only limit to our realization of tomorrow is our doubts of today.",
            "The purpose of our lives is to be happy.",
            "Life is what happens when you're busy making other plans."
    };

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/plain");
        PrintWriter out = resp.getWriter();
        String randomQuote = QUOTES[new Random().nextInt(QUOTES.length)];
        out.println(randomQuote);
        out.close();
    }
}
