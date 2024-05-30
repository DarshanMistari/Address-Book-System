package com.darshan.addressbook;

import java.util.ArrayList;
import static java.lang.System.exit;
import java.util.Scanner;

public class AddressBook {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Contacts> contactsList = new ArrayList<>();
    public void createContacts()
    {
        Contacts contacts = new Contacts();
        System.out.println("Enter the First Name:");
        contacts.setFirstName(scanner.next());

        System.out.println("Enter the Last Name:");
        contacts.setLastName(scanner.next());

        System.out.println("Enter the Address :");
        contacts.setAddress(scanner.next());

        System.out.println("Enter the City:");
        contacts.setCity(scanner.next());

        System.out.println("Enter the State :");
        contacts.setState(scanner.next());

        System.out.println("Enter the ZipCode :");
        contacts.setZipCode(scanner.next());

        System.out.println("Enter the Phone Number :");
        contacts.setPhoneNo(scanner.next());

        System.out.println("Enter the Email Id :");
        contacts.setEmail(scanner.next());

        System.out.println("Contact is Successfully Added.");
        contactsList.add(contacts);
    }

    public void displayContact()
    {
        if(contactsList.isEmpty())
        {
            System.out.println("Contact List is Empty.");
        }
        else
        {
            for(int i=0; i< contactsList.size(); i++)
            {
                Contacts contacts  = contactsList.get(i);
                System.out.println(contacts.toString());
            }
        }
    }

    public void editContact()
    {
        Contacts contacts = checkContactExists();
        if(contacts != null)
        {
            System.out.println("Enter the Last Name:");
            contacts.setLastName(scanner.next());

            System.out.println("Enter the Address :");
            contacts.setAddress(scanner.next());

            System.out.println("Enter the City:");
            contacts.setCity(scanner.next());

            System.out.println("Enter the State :");
            contacts.setState(scanner.next());

            System.out.println("Enter the ZipCode :");
            contacts.setZipCode(scanner.next());

            System.out.println("Enter the Phone Number :");
            contacts.setPhoneNo(scanner.next());

            System.out.println("Enter the Email Id :");
            contacts.setEmail(scanner.next());

            System.out.println("Contacts  is Successfully Edit.");
        }
    }

    public void deleteContact()
    {
        Contacts contacts = checkContactExists();

        if(contacts != null)
        {
            contactsList.remove(contacts);
            System.out.println("Contacts is Deleted Successfully.");
        }
    }

    public Contacts checkContactExists()
    {
        if(contactsList.isEmpty())
        {
            System.out.println("Contact List is Empty.");
            return null;
        }
        else
        {
            System.out.println("Enter the First Name of the Contacts :");
            String fName = scanner.next();
            boolean found = false;

            for(int i=0; i< contactsList.size(); i++)
            {
                Contacts contacts = contactsList.get(i);

                if(fName.equals(contacts.getFirstName()))
                {
                    found = true;

                    System.out.println("Contact is Found.");
                    return contacts;
                }
            }
            if(!found)
            {
                System.out.println("Given FirstName Of Contact is not Found.");
            }
        }
        return null;
    }

    public static void main(String []args) {
        AddressBook addressBook = new AddressBook();

        System.out.println("Welcome to Address Book Developed by Darshan.");

        int userChoice;
        do
        {
            System.out.println("***** AddressBook *****");
            System.out.println("1.AddContact  \n.DisplayContact \n3.EditContact \n4.DeleteContact \n5.Exit");
            System.out.println("Enter the User Choice :");
            userChoice = addressBook.scanner.nextInt();

            switch (userChoice)
            {
                case 1:
                    addressBook.createContacts();
                    break;
                case 2:
                    addressBook.displayContact();
                    break;
                case 3:
                    addressBook.editContact();
                    break;
                case 4:
                    addressBook.deleteContact();
                    break;
                case 5:
                    exit(0);
                    break;
            }
        }while (userChoice <= 4);
    }
}
