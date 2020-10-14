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
}


