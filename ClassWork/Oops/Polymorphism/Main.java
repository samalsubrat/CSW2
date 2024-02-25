package ClassWork.Oops.Polymorphism;

//run-time polymorphism
class Box {
    public void color() {
        System.out.println("Default color is Brown");
    }
}

class Dress extends Box {
    @Override // Override is just an annotation to check if it is overriding the same method
              // or not.
    public void color() {
        System.out.println("Color is White");
    }
}

class Shoes extends Box {
    @Override
    public void color() {
        System.out.println("Color is Red");
    }
}

// compile-time polymorphism
class Numbers {
    double sum(double a, double b) {
        return a + b;
    }

    double sum(int a, int b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }
}

public class Main {
    public static void main(String[] args) {
        Numbers obj = new Numbers();
        obj.sum(1,2);
        obj.sum(1.2,2.3);
        obj.sum(3,4,5);

        Box dress = new Dress();
        Box shoes = new Shoes();
        dress.color();
        shoes.color();
    }
}
