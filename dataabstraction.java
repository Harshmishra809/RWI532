

abstract class Shape {
    public abstract void draw();
}


class Rectangle extends Shape {
    
    public void draw() {
        System.out.println("Drawing Rectangle");
    }
}


class Circle extends Shape {
    
    public void draw() {
        System.out.println("Drawing Circle");
    }
}


public class dataabstraction {
    public static void main(String[] args) {
        
        Shape shape1 = new Rectangle();
        Shape shape2 = new Circle();

        
        shape1.draw();
        shape2.draw();
    }
}
