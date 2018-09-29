package com.squorpikkor.app.magazassistant3;

import java.util.ArrayList;

public class Customer {
    private String customerName;
    private ArrayList<Prod> prodsList;

    public Customer(String customerName, ArrayList<Prod> prodsList) {
        this.customerName = customerName;
        this.prodsList = prodsList;
    }

    //region Getters & Setters
    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public ArrayList<Prod> getProdsList() {
        return prodsList;
    }

    public void setProdsList(ArrayList<Prod> prodsList) {
        this.prodsList = prodsList;
    }
    //endregion

    //TODO убрать затычку
    public double totalPrice() {
        //сумма цен продлиста
        return 777;//затычка
    }
}
