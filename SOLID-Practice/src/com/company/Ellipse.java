package com.company;

import java.util.Scanner;

public class Ellipse extends Shape {
    public static final double pie = 3.14;
    private int a;
    private int b;
    private Scanner sc;


    public Ellipse() {
        Scanner sc = new Scanner(System.in);
    }

    public void  Prompt(int a, int b){

        System.out.println("Please enter the measurement for a");
        this.a=sc.nextInt();
        System.out.println("Please enter the measurement for b");
        this.b=sc.nextInt();

    }


    @Override
    void getArea() {
        Prompt(a,b);
        area =  4 * a * b * pie;
        System.out.println(areaMessage + area);
    }

    @Override
    void getVolume() {
        Prompt(a,b);
        volume = (4/3)*(a * b * pie);
        System.out.println(volumeMessage + volume);
    }

    public void Formulate() {
        System.out.println("This is an Ellipse. what would you like to do... ");
        System.out.println("1.Area ");
        System.out.println("2.Volume ");

        choice = sc.nextInt();
        switch (choice) {

            case 1:
                System.out.println("Area ");
                getArea();
                break;

            case 2:
                System.out.println("Volume ");
                getVolume();
                break;

            default:
                System.out.println("You have entered a wrong choice");
                Formulate();
        }
    }

    @Override
    public String toString() {
        return "Ellipse{" +
                "a=" + a +
                ", b=" + b +
                ", sc=" + sc +
                '}';
    }
}
