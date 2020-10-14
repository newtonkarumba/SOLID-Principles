package com.company;

public abstract class Shape {
     public int choice;
     double area;
     double volume;
     String areaMessage = "Area of the shape is: ";
     String volumeMessage = "Volume of the shape is: ";

     abstract void getArea();
     abstract void getVolume();



}
