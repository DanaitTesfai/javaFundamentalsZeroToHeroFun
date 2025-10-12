package org.java_fundamentals._07_OOP._07_interface._06_draw;

import java.util.ArrayList;

public class Main {
    static ArrayList<Shape> shapes = new ArrayList<>();
    public static void main(String[] args) {


        Circle circle = new Circle();
        shapes.add(circle);

        Rectangle rec = new Rectangle();
        shapes.add(rec);

        Square square = new Square();
        shapes.add(square);

        printShapes();

        //Circle cir1 = new Circle();
        //addShape(cir1);
        addShape(new Circle());
        addShape(new Rectangle());
        addShape(new Square());


        printShapes();


        addShapeV2(new Circle());
        addShapeV2(new Rectangle());
        addShapeV2(new Square());


    }


    private static void printShapes() {
        System.out.println("---------------");
        for (Shape s : shapes){
            s.draw();
        }
    }

    public static void addShape(Circle circle){
        shapes.add(circle);
    }


    public static void addShape(Rectangle rec){
        shapes.add(rec);
    }

    public static void addShape(Square square){
        shapes.add(square);
    }

    public static void addShapeV2(Shape shape){
        shapes.add(shape);
    }
}
