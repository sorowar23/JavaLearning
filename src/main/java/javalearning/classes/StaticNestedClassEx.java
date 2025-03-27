package javalearning.classes;

public class StaticNestedClassEx {
    public static void main(String[] args) {
       OuterClass.StaticNestedClass stnc = new OuterClass.StaticNestedClass();
       stnc.display();
    }
}
