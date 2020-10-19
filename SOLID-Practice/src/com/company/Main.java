package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static int shape;

    public Shape s;
    private Scanner sc;




    public static void main(String[] args) {

        menu();

    }


    public static void menu() {
        Scanner sc = new Scanner(System.in);
        List shapes = new ArrayList();
        do {


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
        System.out.println("11. View Shapes List");

        System.out.println("0. Exit");
        shape = sc.nextInt();


            switch (shape) {

                case 1:
                    Rectangle rectangle = new Rectangle();
                    rectangle.Formulate();
                    shapes.add(rectangle.toString());
                    break;
                case 2:
                    Square square = new Square();
                    square.Formulate();
                    shapes.add(square.toString());
                    break;
                case 3:
                    Box box = new Box();
                    box.Formulate();
                    shapes.add(box.toString());
                    break;
                case 4:
                    Cube cube = new Cube();
                    cube.Formulate();
                    shapes.add(cube.toString());
                    break;
                case 5:
                    Ellipse ellipse = new Ellipse();
                    ellipse.Formulate();
                    shapes.add(ellipse.toString());
                    break;
                case 6:
                    Circle circle = new Circle();
                    circle.Formulate();
                    shapes.add(circle.toString());
                    break;
                case 7:
                    Sphere sphere = new Sphere();
                    sphere.Formulate();
                    shapes.add(sphere.toString());
                    break;
                case 8:
                    Triangle triangle = new Triangle();
                    triangle.Formulate();
                    shapes.add(triangle.toString());
                    break;
                case 9:
                    Tetrahedron tetrahedron = new Tetrahedron();
                    tetrahedron.Formulate();
                    shapes.add(tetrahedron.toString());
                    break;

                case 11:
                    shapes.forEach((s) -> System.out.println(s));
                    break;
            }


        }
        while (shape != 0);
    }
}

