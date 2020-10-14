package com.company;

import java.util.Scanner;

public class Triangle extends Shape {
    private int a;
    private int b;
    private int h;

    public void  areaPrompt(int b,int h){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the value for b ");
        this.b=scanner.nextInt();
        System.out.println("Please enter the value for h ");
        this.h=scanner.nextInt();

    }
    public void  volumePrompt(int a,int b, int h){
        Scanner scanner = new Scanner(System.in);
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
}
