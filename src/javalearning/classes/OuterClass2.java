package javalearning.classes;

public class OuterClass2 {

    class InnerClass{
        public void display(){
            System.out.println("This is inner class method.");
        }
    }

    void outerClassMethod(){
        System.out.println("Inside outer class method");

        class MethodLocalClass{
            int count = 10;
            void localInnerMethod(){
                System.out.println("Inside method local class");
            }
        }

        MethodLocalClass mlc = new MethodLocalClass();
        mlc.localInnerMethod();
    }
}
