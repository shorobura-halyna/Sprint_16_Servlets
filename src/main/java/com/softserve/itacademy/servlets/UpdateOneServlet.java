package com.softserve.itacademy.servlets;

import com.softserve.itacademy.service.AddressBookService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static com.softserve.itacademy.repository.AddressBook.NameAddressPair;
import static com.softserve.itacademy.service.AddressBookService.getInstance;

public class UpdateOneServlet extends HttpServlet {
    private AddressBookService addressBookService = getInstance();

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String firstName = req.getParameter("firstName");
        String lastName = req.getParameter("lastName");
        String address = req.getParameter("address");
        boolean exist = addressBookService.update(firstName, lastName, address);
        String error = exist ? "Person with name " + firstName + " " + lastName + " not found in Address Book!" : "";
        req.setAttribute("error", error);
        resp.sendRedirect("/records/list");
    }

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String firstName = req.getParameter("firstName");
        String lastName = req.getParameter("lastName");
        NameAddressPair record = addressBookService.read(firstName, lastName);
        req.setAttribute("record", record);
        req.getRequestDispatcher("/update.jsp").forward(req, resp);
    }
}
