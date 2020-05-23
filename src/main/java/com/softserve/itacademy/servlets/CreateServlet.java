package com.softserve.itacademy.servlets;

import com.softserve.itacademy.service.AddressBookService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static com.softserve.itacademy.service.AddressBookService.getInstance;


public class CreateServlet extends HttpServlet {
    private AddressBookService addressBookService = getInstance();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/create.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String firstName = req.getParameter("firstName");
        String lastName = req.getParameter("lastName");
        String address = req.getParameter("address");
        boolean exist = addressBookService.create(firstName, lastName, address);
        String error = exist ? "An error occurred! Please try again. Person already exist!" : "";
        req.setAttribute("error", error);
        req.getRequestDispatcher("/welcome.jsp").forward(req, resp);
    }
}
