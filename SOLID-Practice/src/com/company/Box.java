package com.company;

public class Box extends Rectangle{

    @Override
    public void areaPrompt(int length, int width) {
        super.areaPrompt(length, width);
    }

    @Override
    public void getArea() {
       super.areaMessage = "The area of the box is ";
        super.getArea();
    }

    @Override
    public void getVolume() {
        super.volumeMessage = "The volume of the box is ";
        super.getVolume();
    }
}
