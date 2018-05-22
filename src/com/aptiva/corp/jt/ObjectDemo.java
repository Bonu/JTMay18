package com.aptiva.corp.jt;

public class ObjectDemo {

    public static void main(String[] args) {

        Customer customer1 = new Customer(1, "Rama", "Ayodhya", "000000000");
        customer1 = new Customer(1, "Rama", "Ayodhya", "000000000");
        Transaction transaction1 = new Transaction(1,1000,"Verificaiton", "Customer1", "Customer2");
        System.out.println(transaction1);
        transaction1.performTransaction("xccx");
        System.out.println(transaction1);

    }
}

class Transaction {

    int id;
    long amount;
    String status;
    String fromCustomer;
    String toCustomer;

    public Transaction(int id, long amount, String status, String fromCustomer, String toCustomer) {
        this.id = id;
        this.amount = amount;
        this.status = status;
        this.fromCustomer = fromCustomer;
        this.toCustomer = toCustomer;
    }

    public void performTransaction(String xyz) {
        // do transaction
        this.status = "Transaction Done";
        this.amount = 0;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "id=" + id +
                ", amount=" + amount +
                ", status='" + status + '\'' +
                ", fromCustomer='" + fromCustomer + '\'' +
                ", toCustomer='" + toCustomer + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getFromCustomer() {
        return fromCustomer;
    }

    public void setFromCustomer(String fromCustomer) {
        this.fromCustomer = fromCustomer;
    }

    public String getToCustomer() {
        return toCustomer;
    }

    public void setToCustomer(String toCustomer) {
        this.toCustomer = toCustomer;
    }
}


class Customer {

    // ----- Properties or variables-----
    private int id;
    private String name;
    private String streetAddress;
    private String telephoneNumber;

    // Constructors

    public Customer() {

    }

    public Customer(int id, String name, String streetAddress, String telephoneNumber) {
        this.id = id;
        this.name = name;
        this.streetAddress = streetAddress;
        this.telephoneNumber = telephoneNumber;
    }

    public Customer(int id, String name, String streetAddress) {
        this.id = id;
        this.name = name;
        this.streetAddress = streetAddress;
    }

    public Customer(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // ----- Behaviours or actions or methods -----

    public String getName() {
        return this.name;
    }

    public String getTelephoneNumberByName() {
        return this.telephoneNumber;
    }


    public void updateStreetAddress(String telephoneNumber ) {
        this.telephoneNumber = telephoneNumber;
    }

    // ---- Getter and Setters -------------------

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }
}