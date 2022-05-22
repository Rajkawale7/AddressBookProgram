package com.bridgelabz;

public class AddressBookSystem {
        private String firstName;
        private String lastName;
        private long phoneNumber;
        private String emailId;
        private String address;
        private String city;
        private String state;
        private int zip;

    public AddressBookSystem (String firstName, String lastName, long phoneNumber,
                              String emailId, String address, String city, String state, int zip) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.emailId = emailId;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;

    }

    public static void main(String [] args){
        System.out.println("*** Welcome to the Address Book Program ***");
        AddressBookSystem contacts = new AddressBookSystem("Raj", "Kawale", 904933104, "Rajkawale712@gmail.com",
                "xyz", "Nagpur","Maharashtra", 441614 );
        System.out.println("FirstName : "+contacts.firstName);
        System.out.println("LastName : " +contacts.lastName);
        System.out.println("PhoneNumber : "+contacts.phoneNumber);
        System.out.println("EmailId : " +contacts.emailId);
        System.out.println("Address : "+contacts.address);
        System.out.println("City : " +contacts.city);
        System.out.println("State : " +contacts.state);
        System.out.println("Zip : "+contacts.zip);
    }
}
