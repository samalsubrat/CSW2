package ClassWork.Oops.Abstraction;

abstract class Shape {
    // Abstract method
    abstract void draw();

    // Non-abstract method
    void display() {
        System.out.println("Displaying Shape");
    }
}

// Interface
// Interface is 100% abstraction
interface Box {
    void color(); // Abstract method
}

class Circle extends Shape implements Box {
   
    void draw() {
        System.out.println("Drawing Circle");
    }

    public void color() {
        System.out.println("Sara Laal Hai!");
    }
}

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.display(); 
        circle.draw();    
        circle.color();   
    }
}
