package com.company;

import java.util.Scanner;

public class Rectangle extends Shape {
    public int length;
    public int width;
    public int height;
    public int choice;
    public Scanner scanner;
    String areaMessage = "Area of the rectangle is: ";
    String volumeMessage = "Volume of the rectangle is: ";


    public Rectangle() {
        Scanner scanner = new Scanner(System.in);
    }

    public void  areaPrompt(int length, int width){
        System.out.println("Please enter the value for length ");
        this.length=scanner.nextInt();
        System.out.println("Please enter the value for width ");
        this.width=scanner.nextInt();

    }
    public void  volumePrompt(int length,int width, int height){
        System.out.println("Please enter the value for length ");
        this.length=scanner.nextInt();
        System.out.println("Please enter the value for width ");
        this.width=scanner.nextInt();
        System.out.println("Please enter the value for height ");
        this.height=scanner.nextInt();

    }

    public void Formulate(){
        System.out.println("This is a Rectangle. would you like to do... ");
        System.out.println("1.Area ");
        System.out.println("2.Volume ");
        choice = scanner.nextInt();
            switch (choice){

                case 1 :

                    getArea();
                    break;

                case 2 :

                    getVolume();
                    break;
                default:
                    System.out.println("You have entered a wrong choice");
                    Formulate();
            }

    }

    public void  getArea() {

       areaPrompt(length,width);
         area = length * width;
        System.out.println( areaMessage + area);
    }



    public void getVolume() {
        volumePrompt(length,width,height);
        volume = length * width * height;
        System.out.println( volumeMessage + volume);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                ", height=" + height +
                ", choice=" + choice +
                ", scanner=" + scanner +
                ", areaMessage='" + areaMessage + '\'' +
                ", volumeMessage='" + volumeMessage + '\'' +
                '}';
    }
}
