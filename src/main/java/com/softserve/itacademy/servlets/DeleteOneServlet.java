package com.softserve.itacademy.servlets;

import com.softserve.itacademy.service.AddressBookService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static com.softserve.itacademy.service.AddressBookService.getInstance;

public class DeleteOneServlet extends HttpServlet {
    private AddressBookService addressBookService = getInstance();

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String firstName = req.getParameter("firstName");
        String lastName = req.getParameter("lastName");
        addressBookService.delete(firstName, lastName);
        resp.sendRedirect("/records/list");
    }
}
