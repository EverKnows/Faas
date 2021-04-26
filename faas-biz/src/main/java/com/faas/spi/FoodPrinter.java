package com.faas.spi;

public class FoodPrinter implements Printer{
    @Override
    public void print() {
        System.out.println("Bones");
    }
}
