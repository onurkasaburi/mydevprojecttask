package com.myprojecttask.lambda.shape;

public class ShapeTest {

    public static void main(String[] args) {
        Drawable drawable = () -> System.out.println("Drawing a Circle");
        drawable.draw();

        Drawable2 drawable2 = shape -> System.out.println("Drawing a " + shape);
        drawable2.draw("Triangle");

        Drawable3 drawable3 = (shape, name) -> System.out.println(name + " is a name of "+shape);
        drawable3.draw("Circle","Whirling");

        Drawable4 drawable4 = (shape, area) -> "Drawing a"+shape+" and it's area is "+area;
        drawable4.draw("circle",100);


    }
}
