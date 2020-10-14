package com.company;

import java.util.Scanner;

public class Cube extends Shape{
        String askForSide = "Please enter the value for one of the sides ";
         int a;


    public void  Prompt(int a){
        Scanner sc = new Scanner(System.in);
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
    }
