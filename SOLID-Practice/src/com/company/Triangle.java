package com.company;

import java.util.Scanner;

public class Triangle extends Shape {
    private int a;
    private int b;
    private int h;
    private Scanner scanner;

    public Triangle() {
        Scanner scanner = new Scanner(System.in);

    }

    public void  areaPrompt(int b, int h){
        System.out.println("Please enter the value for b ");
        this.b=scanner.nextInt();
        System.out.println("Please enter the value for h ");
        this.h=scanner.nextInt();

    }
    public void  volumePrompt(int a,int b, int h){
        System.out.println("Please enter the value for a ");
        this.a=scanner.nextInt();
        System.out.println("Please enter the value for b ");
        this.b=scanner.nextInt();
        System.out.println("Please enter the value for h ");
        this.h=scanner.nextInt();

    }


    @Override
    void getArea() {
        areaPrompt(b,h);
        area = 0.5 * b * h;
        System.out.println(areaMessage + area);
    }

    @Override
    void getVolume() {
        volumePrompt(a,b,h);
        volume = 0.5 * a* b * h;
        System.out.println(areaMessage + volume);
    }
    public void Formulate() {
        System.out.println("This is a Triangle. would you like to do... ");
        System.out.println("1.Area ");
        System.out.println("2.Volume ");
        choice = scanner.nextInt();
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
        return "Triangle{" +
                "choice=" + choice +
                ", area=" + area +
                ", volume=" + volume +
                ", areaMessage='" + areaMessage + '\'' +
                ", volumeMessage='" + volumeMessage + '\'' +
                '}';
    }
}
