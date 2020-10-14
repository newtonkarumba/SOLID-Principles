package com.company;

import java.util.Scanner;

public class Main {

    public static int shape;

    public Shape s;

    public static void main(String[] args) {
        menu();

    }


    public static void menu() {

        do {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the shape selector.. Please choose to see one from the menu!!");
        System.out.println("1.Rectangle");
        System.out.println("2. Square");
        System.out.println("3. Box");
        System.out.println("4. Cube");
        System.out.println("5. Ellipse");
        System.out.println("6. Circle");
        System.out.println("7. Sphere");
        System.out.println("8. Triangle");
        System.out.println("9. Tetrahedron");
        System.out.println("0. Exit");
        shape = sc.nextInt();


            switch (shape) {

                case 1:
                    Rectangle rectangle = new Rectangle();
                    rectangle.Formulate();
                    break;
                case 2:
                    Square square = new Square();
                    square.Formulate();
                    break;
                case 3:
                    Box box = new Box();
                    box.Formulate();
                    break;
                case 4:
                    Cube cube = new Cube();
                    cube.Formulate();
                    break;
                case 5:
                    Ellipse ellipse = new Ellipse();
                    ellipse.Formulate();
                    break;
                case 6:
                    Circle circle = new Circle();
                    circle.Formulate();
                    break;
                case 7:
                    Sphere sphere = new Sphere();
                    sphere.Formulate();
                    break;
                case 8:
                    Triangle triangle = new Triangle();
                    triangle.Formulate();
                    break;
                case 9:
                    Tetrahedron tetrahedron = new Tetrahedron();
                    tetrahedron.Formulate();
                    break;
            }


        }
        while (shape != 0);
    }
}

