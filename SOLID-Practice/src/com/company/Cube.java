package com.company;

import java.util.Scanner;

public class Cube extends Shape{
        String askForSide = "Please enter the value for one of the sides ";
         int a;
        private Scanner sc;

    public Cube() {
        Scanner sc = new Scanner(System.in);
    }

    public void  Prompt(int a){

        System.out.println(askForSide);
        this.a=sc.nextInt();

    }


        @Override
        public void getArea() {
            Prompt(a);
            area = 6 * a * a ;
            System.out.println("The value for the area of the cube is " + area);
        }

        @Override
        public void getVolume() {
            Prompt(a);
            volume = a * a * a;
            System.out.println(super.volumeMessage + volume);
        }

            public void Formulate() {
                System.out.println("This is a Cube. would you like to do... ");
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
        return "Cube{" +
                "askForSide='" + askForSide + '\'' +
                ", a=" + a +
                ", sc=" + sc +
                '}';
    }
}
