interface Drawable {
    void draw();
}

abstract class Shape implements Drawable {
    abstract double area();
}

 class Circle extends Shape {
    double radius;

    Circle(double r) {
        radius = r;
    }

    public void draw() {
        System.out.println("Drawing Circle");
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

    public void draw() {
        System.out.println("Drawing Rectangle");
    }

    double area() {
        return length * width;
    }
}

public class Circle2 {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rect = new Rectangle(4, 6);

        circle.draw();
        System.out.println("Circle area: " + circle.area());

        rect.draw();
        System.out.println("Rectangle area: " + rect.area());
    }
}