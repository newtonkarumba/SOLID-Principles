package com.company;

import java.util.Scanner;

public class Sphere extends Ellipse{
private Scanner sn = new Scanner(System.in);
    public Sphere() {
        Scanner sn = new Scanner(System.in);

    }

    public void Formulate() {
        System.out.println("This is a Sphere. would you like to do... ");
        System.out.println("1.Area ");
        System.out.println("2.Volume ");
        choice = sn.nextInt();
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
        return "Sphere{" +
                "choice=" + choice +
                ", area=" + area +
                ", volume=" + volume +
                ", areaMessage='" + areaMessage + '\'' +
                ", volumeMessage='" + volumeMessage + '\'' +
                '}';
    }
}
