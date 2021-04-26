package com.faas.spi;

public class AnimalPrinter implements Printer{
    @Override
    public void print() {
        System.out.println("Dog");
    }
}
