package com.softserve.itacademy.dto;

import com.softserve.itacademy.repository.AddressBook;

public class NameAddressPairDto {
    private int id;
    private AddressBook.NameAddressPair nameAddressPair;

    public NameAddressPairDto(int id, AddressBook.NameAddressPair nameAddressPair) {
        this.id = id;
        this.nameAddressPair = nameAddressPair;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public AddressBook.NameAddressPair getNameAddressPair() {
        return nameAddressPair;
    }

    public void setNameAddressPair(AddressBook.NameAddressPair nameAddressPair) {
        this.nameAddressPair = nameAddressPair;
    }
}
