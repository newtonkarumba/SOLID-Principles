package com.company;

import java.util.Scanner;

public class scannerExample {
    public String name;
    public Scanner scanner;

    public static void main(String[] args) {
        scannerExample se = new scannerExample();
        se.printname();
    }

    public scannerExample() {
        this.scanner = new Scanner(System.in);

    }

    public void printname(){
        System.out.println("Please enter your name ");
        name = scanner.nextLine();
        System.out.println("My name is= " + name);
    }
}
