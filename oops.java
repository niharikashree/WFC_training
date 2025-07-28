
// Abstract class to demonstrate abstraction
abstract class OOPAbstraction {
    public abstract void display();
}

// Inheriting the abstract class
class OOPImplement extends OOPAbstraction {
    @Override
    public void display() {
        System.out.println("Abstraction in OOPs.");
    }
}

// Parent class for Inheritance
class OOPBase {
    public void show() {
        System.out.println("This is the base class showing Inheritance in OOPs.");
    }
}

// Child class inheriting OOPBase
class OOPDerived extends OOPBase {
    // Method overriding (Polymorphism - Runtime)
    @Override
    public void show() {
        System.out.println("This is the derived class overriding the show method.");
    }

    // Method overloading (Polymorphism - Compile-time)
    public void show(String msg) {
        System.out.println("Overloaded show: " + msg);
    }
}

// Main class
public class oops {
    public static void main(String[] args) {
        // Inheritance & Polymorphism (Overriding)
        OOPBase baseRef = new OOPDerived();  // Runtime polymorphism
        baseRef.show();

        // Polymorphism (Overloading)
        OOPDerived derived = new OOPDerived();
        derived.show("This is method overloading.");

        // Abstraction
        OOPAbstraction abs = new OOPImplement();
        abs.display();
    }
}
