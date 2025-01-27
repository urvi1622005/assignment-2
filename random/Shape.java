package random;
class Shape {
    void draw() {
        System.out.println("Drawing a shape");
    }
    
    double area() {
        return 0;
    }
}

class Circle extends Shape {
    double radius;
    
    Circle(double r) {
        radius = r;
    }
    
    void draw() {
        System.out.println("Drawing a circle");
    }
    
    double area() {
        return 3.14 * radius * radius;
    }
}

class Rectangle extends Shape {
    double length, width;
    
    Rectangle(double l, double w) {
        length = l;
        width = w;
    }
    
    void draw() {
        System.out.println("Drawing a rectangle");
    }
    
    double area() {
        return length * width;
    }
}

class MethodOverridingExample {
    public static void main(String[] args) {
        Shape shape = new Shape();
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);
        
        shape.draw();
        circle.draw();
        rectangle.draw();
        
        System.out.println("Shape area: " + shape.area());
        System.out.println("Circle area: " + circle.area());
        System.out.println("Rectangle area: " + rectangle.area());
    }
}