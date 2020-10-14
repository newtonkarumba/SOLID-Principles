package com.company;

import java.util.Scanner;

public class Ellipse extends Shape {
    public static final double pie = 3.14;
    private int a;
    private int b;

    public void  Prompt(int a,int b){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the measurement for a");
        this.a=sc.nextInt();
        System.out.println("Please enter the measurement for b");
        this.b=sc.nextInt();

    }


    @Override
    void getArea() {
        Prompt(a,b);
        area =  4 * a * b * pie;
    }

    @Override
    void getVolume() {
        Prompt(a,b);
        area = (4/3)*(a * b * pie);
    }
}
