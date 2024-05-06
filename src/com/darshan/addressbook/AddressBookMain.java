package com.darshan.addressbook;

import java.util.Scanner;
public class AddressBookMain {
    Scanner scanner = new Scanner(System.in);
    ContactsModule contactsModule = new ContactsModule();

    public void createContacts()
    {
        System.out.println("Enter the First Name:");
        contactsModule.setfName(scanner.next());

        System.out.println("Enter the Last Name:");
        contactsModule.setlName(scanner.next());

        System.out.println("Enter the Address :");
        contactsModule.setAddress(scanner.next());

        System.out.println("Enter the City:");
        contactsModule.setCity(scanner.next());

        System.out.println("Enter the State :");
        contactsModule.setState(scanner.next());

        System.out.println("Enter the ZipCode :");
        contactsModule.setZipCode(scanner.next());

        System.out.println("Enter the Phone Number :");
        contactsModule.setPhoneNo(scanner.next());

        System.out.println("Enter the Email Id :");
        contactsModule.setEmail(scanner.next());
    }

    public void displayContacts()
    {
        System.out.println(" First Name :"+contactsModule.getfName());
        System.out.println("Last Name :"+contactsModule.getlName());
        System.out.println("Address :"+contactsModule.getAddress());
        System.out.println("City :"+contactsModule.getCity());
        System.out.println("State :"+contactsModule.getState());
        System.out.println("ZipCode :"+contactsModule.getZipCode());
        System.out.println("Phone Number :"+contactsModule.getPhoneNo());
        System.out.println("Email id :"+contactsModule.getEmail());
    }

    public static void main(String []args)
    {
        AddressBookMain addressBookMain = new AddressBookMain();

        System.out.println("Welcome to Address Book Developed by Darshan.");
        addressBookMain.createContacts();
        addressBookMain.displayContacts();
    }
}
