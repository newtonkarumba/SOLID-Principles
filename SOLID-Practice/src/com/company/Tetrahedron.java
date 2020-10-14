package com.company;

import java.util.Scanner;

public class Tetrahedron extends Shape{
    private int a;


    public void  Prompt(int a){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the value for a ");
        this.a=scanner.nextInt();


    }



    @Override
    void getArea() {
        Prompt(a);
        area = Math.sqrt(3)* a * a * a;
        System.out.println(areaMessage + area);
    }

    @Override
    void getVolume() {
       Prompt(a);
       volume = (a*a*a)/(6*(Math.sqrt(2)));
    }
    public void Formulate() {
        System.out.println("This is a Tetrahedron. would you like to do... ");
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


