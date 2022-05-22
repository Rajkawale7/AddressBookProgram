package com.bridgelabz;
import java.util.Scanner;
public class AddressBookSystem {
        //Declaring variables
        private String firstName;
        private String lastName;
        private long phoneNumber;
        private String emailId;
        private String address;
        private String city;
        private String state;
        private int zip;

    //creating an object of scanner class to get the input from console
    static Scanner input = new Scanner(System.in);

    //Getting and setting the value by using Getter and setter methods
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public long getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(long phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public String getEmailId() {
        return emailId;
    }
    public void setEmailId(String emailId){
        this.emailId = emailId;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city){
        this.city = city;
    }
    public String getState() {
        return state;
    }
    public  void setState(String state){
        this.state = state;
    }
    public int getZip() {
        return zip;
    }
    public void setZips(int zip) {
        this.zip = zip;
    }

    public static void main(String [] args){
        System.out.println("*** Contact Details ***");

        //Creating object of AddressBookSystem class
        AddressBookSystem contacts = new AddressBookSystem();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter First name: ");
        contacts.setFirstName(scanner.next());

        System.out.println("Enter Last name: ");
        contacts.setLastName(scanner.next());

        System.out.println("Enter Mobile Number: ");
        contacts.setPhoneNumber(scanner.nextLong());

        System.out.println("Enter  Email id: ");
        contacts.setEmailId(scanner.next());

        System.out.println("Enter Address: ");
        contacts.setAddress(scanner.next());

        System.out.println("Enter City: ");
        contacts.setCity(scanner.next());

        System.out.println("Enter State : ");
        contacts.setState(scanner.next());

        System.out.println("Enter Zip: ");
        contacts.setZips(scanner.nextInt());

        //Printing the details of person's contact
        System.out.println("*** Displaying Contact Details ***");
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
