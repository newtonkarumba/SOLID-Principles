package com.company;

public class Square extends Rectangle {
    @Override
    public void areaPrompt(int length, int width) {
        super.areaPrompt(length, width);
    }

    @Override
    public void getArea() {
        super.areaMessage = "The area of the square is ";
        super.getArea();
    }

    @Override
    public void getVolume() {
        super.volumeMessage = "The volume of the square is ";
        super.getVolume();
    }
}


