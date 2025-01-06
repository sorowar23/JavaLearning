package javalearning.abstractex;

public class Rectangle extends GraphicObject{

    @Override
    void draw() {
        System.out.println("Drawing a Rectangle...");
    }

    @Override
    void resize() {
        System.out.println("Resize a Rectangle...");
    }
}
