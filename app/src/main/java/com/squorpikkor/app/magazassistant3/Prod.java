package com.squorpikkor.app.magazassistant3;

public class Prod {

    private String prod_name;
    private double prod_price;  //Может сделать интом
    private int prod_count;

    //region GETTERS & SETTERS
    public String getProd_name() {
        return prod_name;
    }

    public void setProd_name(String prod_name) {
        this.prod_name = prod_name;
    }

    public double getProd_price() {
        return prod_price;
    }

    public void setProd_price(double prod_price) {
        this.prod_price = prod_price;
    }

    public int getProd_count() {
        return prod_count;
    }

    public void setProd_count(int prod_count) {
        this.prod_count = prod_count;
    }
    //endregion


    //Конструктор для проверки заполнения листов. В финале применяться не будет
    public Prod(String prod_name, double prod_price, int prod_count) {
        this.prod_name = prod_name;
        this.prod_price = prod_price;
        this.prod_count = prod_count;
    }

    public Prod() {
    }
}
