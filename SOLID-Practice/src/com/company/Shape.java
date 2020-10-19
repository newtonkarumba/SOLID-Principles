package com.company;

import java.util.Scanner;

public abstract class Shape implements ShapeI {
     public int choice;
     double area;
     double volume;
     String areaMessage = "Area of the shape is: ";
     String volumeMessage = "Volume of the shape is: ";

     public void Formulate(){
          System.out.println("This is a Shape. would you like to do... ");
          System.out.println("1.Area ");
          System.out.println("2.Volume ");
          Scanner sn = new Scanner(System.in);
          choice = sn.nextInt();
          switch (choice){

               case 1:
                    System.out.println("Area ");
                    getArea();
                    break;

               case 2 :
                    System.out.println("Volume ");
                    getVolume();
                    break;
               default:
                    System.out.println("You have entered a wrong choice");
                    Formulate();
          }

     }

     abstract void getArea();
     abstract void getVolume();



}
