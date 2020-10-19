package com.company;

import java.util.Scanner;

public class Circle extends Shape{
    public static final int pie = 3;
    private int r;
    private int l;
    public Scanner sc;


    public Circle() {
        Scanner sc = new Scanner(System.in);
    }

    public void  Prompt(int r){
        System.out.println("Please enter the measurement for the radius");
        this.r=sc.nextInt();

    }
    public void  volPrompt(int r, int l){
        System.out.println("Please enter the measurement for the radius");
        this.r=sc.nextInt();
        System.out.println("Please enter the measurement for the length");
        this.l=sc.nextInt();

    }

    @Override
    void getArea() {
        Prompt(r);
        area = pie * r * r;
        System.out.println(super.areaMessage + area);
    }

    @Override
    void getVolume() {
        volPrompt(r,l);
        volume = (pie * r * r) * l;
        System.out.println(super.volumeMessage + volume);
    }

    public void Formulate(){
        System.out.println("1.Area ");
        System.out.println("2.Volume ");
        choice = sc.nextInt();
        switch (choice){

            case 1:
                System.out.println("Area of Circle");
                getArea();
                break;

            case 2 :
                System.out.println("Volume of Circle");
                getVolume();
                break;
            default:
                System.out.println("You have entered a wrong choice");
                Formulate();
        }

    }

    @Override
    public String toString() {
        return "Circle{" +
                "choice=" + choice +
                ", area=" + area +
                ", volume=" + volume +
                ", areaMessage='" + areaMessage + '\'' +
                ", volumeMessage='" + volumeMessage + '\'' +
                '}';
    }
}

