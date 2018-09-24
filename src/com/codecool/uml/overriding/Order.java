package com.codecool.uml.overriding;

public class Order implements Orderable {

    @Override
    public boolean checkout() {
        return false;
    }

    @Override
    public boolean pay() {
        return false;
    }
}
