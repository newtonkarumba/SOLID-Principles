package com.company;

import java.util.Scanner;

public class Square extends Rectangle {
    @Override
    public void areaPrompt(int length, int width) {
        super.areaPrompt(length, width);
    }

    @Override
    public void getArea() {
        super.areaMessage = "The area of the square is ";
        super.getArea();
    }

    @Override
    public void getVolume() {
        super.volumeMessage = "The volume of the square is ";
        super.getVolume();
    }
    public void Formulate() {
        System.out.println("This is a Square. would you like to do... ");
        System.out.println("1.Area ");
        System.out.println("2.Volume ");
        Scanner sn = new Scanner(System.in);
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
}


