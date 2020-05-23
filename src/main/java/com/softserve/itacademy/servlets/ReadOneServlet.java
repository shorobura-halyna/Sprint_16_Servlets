package com.softserve.itacademy.servlets;

import com.softserve.itacademy.service.AddressBookService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static com.softserve.itacademy.repository.AddressBook.NameAddressPair;
import static com.softserve.itacademy.service.AddressBookService.getInstance;

public class ReadOneServlet extends HttpServlet {
    private AddressBookService addressBookService = getInstance();

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String firstName = req.getParameter("firstName");
        String lastName = req.getParameter("lastName");
        NameAddressPair record = addressBookService.read(firstName, lastName);
        req.setAttribute("record", record);
        req.getRequestDispatcher("/readOne.jsp").forward(req, resp);
    }
}
