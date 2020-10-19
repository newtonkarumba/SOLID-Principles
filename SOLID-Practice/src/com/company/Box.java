package com.company;

import java.util.Scanner;

public class Box extends Rectangle{



    @Override
    public void areaPrompt(int length, int width) {
        super.areaPrompt(length, width);
    }

    @Override
    public void getArea() {
       super.areaMessage = "The area of the box is ";
        super.getArea();
    }

    @Override
    public void getVolume() {
        super.volumeMessage = "The volume of the box is ";
        super.getVolume();
    }
    public void Formulate() {
        System.out.println("This is a Box. would you like to do... ");
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
    }
