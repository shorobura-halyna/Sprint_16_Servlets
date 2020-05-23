package com.softserve.itacademy.servlets;

import com.softserve.itacademy.service.AddressBookService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static com.softserve.itacademy.service.AddressBookService.getInstance;

public class ReadAllServlet extends HttpServlet {
    private AddressBookService addressBookService = getInstance();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String sortOrder = req.getParameter("sort");
        req.setAttribute("records", addressBookService.findAll(sortOrder));
        req.getRequestDispatcher("/readAll.jsp").forward(req, resp);
    }
}
