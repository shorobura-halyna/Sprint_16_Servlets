package com.softserve.itacademy.service;

import com.softserve.itacademy.dto.NameAddressPairDto;
import com.softserve.itacademy.repository.AddressBook;

import java.util.ArrayList;
import java.util.List;

import static com.softserve.itacademy.repository.SortOrder.ASC;
import static com.softserve.itacademy.repository.SortOrder.DESC;

public class AddressBookService {

    private AddressBook addressBook = AddressBook.getInstance();

    public List<NameAddressPairDto> findAll(String sortOrder) {
        if ("asc".equals(sortOrder)) {
            addressBook.sortedBy(ASC);
        } else if ("desc".equals(sortOrder)) {
            addressBook.sortedBy(DESC);
        }
        List<NameAddressPairDto> nameAddressPairs = new ArrayList<>();
        AddressBook.AddressBookIterator iterator = addressBook.iterator();
        int counter = 1;
        while (iterator.hasNext()) {
            AddressBook.NameAddressPair record = iterator.next();
            nameAddressPairs.add(new NameAddressPairDto(counter, record));
            counter++;
        }

        return nameAddressPairs;
    }

    public AddressBook.NameAddressPair read(String firstName, String lastName) {
        return addressBook.read(firstName, lastName);
    }

    public boolean create(String firstName, String lastName, String address) {
        return addressBook.create(firstName, lastName, address);
    }

    public boolean delete(String firstName, String lastName) {
        return addressBook.delete(firstName, lastName);
    }

    public boolean update(String firstName, String lastName, String address) {
        return addressBook.update(firstName, lastName, address);
    }

    private AddressBookService() {
    }

    private static AddressBookService addressBookServiceInstance = null;

    public static AddressBookService getInstance() {
        if (addressBookServiceInstance == null) {
            addressBookServiceInstance = new AddressBookService();
        }
        return addressBookServiceInstance;
    }

}
