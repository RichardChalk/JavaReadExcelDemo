package com.example;

public class Customer {
  private int customerID;
  private String firstName;
  private String lastName;
  private String phoneNumber;
  private String address;
  private String payingCustomer;
  private String doNotContact;
  private String notUsefulColumn; // Antagande att detta är en boolesk värde

  // Empty Konstruktor
  // public Customer() {
  // }

  // Konstruktor
  public Customer(int customerID, String firstName, String lastName,
      String phoneNumber, String address, String payingCustomer,
      String doNotContact) {
    this.customerID = customerID;
    this.firstName = firstName;
    this.lastName = lastName;
    this.phoneNumber = phoneNumber;
    this.address = address;
    this.payingCustomer = payingCustomer;
    this.doNotContact = doNotContact;
  }

  // Getters och Setters
  public int getCustomerID() {
    return customerID;
  }

  public void setCustomerID(int customerID) {
    this.customerID = customerID;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String customerID) {
    this.firstName = firstName;
  }

  // ... Liknande metoder för andra fält ...

  // toString-metod för att skriva ut objektet lätt
  // @Override
  // public String toString() {
  // return "Customer{" +
  // "customerID=" + customerID +
  // ", firstName='" + firstName + '\'' +
  // ", lastName='" + lastName + '\'' +
  // ", phoneNumber='" + phoneNumber + '\'' +
  // ", address='" + address + '\'' +
  // ", payingCustomer='" + payingCustomer + '\'' +
  // ", doNotContact='" + doNotContact + '\'' +
  // ", notUsefulColumn=" + notUsefulColumn +
  // '}';
  // }
}
