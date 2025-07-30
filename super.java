public class Super {
    public static void main(String[] args) {
        // Demonstrating Inheritance
        OOPDerived derived = new OOPDerived();
        derived.show(); // Calls the overridden method in OOPDerived

        // Demonstrating Abstraction
        OOPImplement abstraction = new OOPImplement();
        abstraction.display(); // Calls the abstract method implementation

        // Demonstrating Polymorphism
        OOPBase polymorphic = new OOPDerived();
        polymorphic.show(); // Calls the overridden method in OOPDerived
    } 
}
public class OOPBase {
    public void show() {
        System.out.println("This is the base class showing Inheritance in OOPs.");
    }
}
public class OOPDerived extends OOPBase {
    // Method overriding (Polymorphism - Runtime)
    @Override
    public void show() {
        System.out.println("This is the derived class overriding the show method.");
    }
}
public abstract class OOPAbstraction {
    public abstract void display();
}
public class OOPImplement extends OOPAbstraction {
    @Override
    public void display() {
        System.out.println("Abstraction in OOPs.");
    }
}

