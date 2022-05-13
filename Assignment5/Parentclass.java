package Assignment5;

public class Parentclass {
    // Overridden method
    void display() {
        System.out.println("This is parent class method");
    }
}

// Complete following class:

class Subclass extends Parentclass {
    void display() {
        System.out.println("Child class method");
    }

    void printMsg() {
        // Calling overriding method in subclass
        display();
        // Calling super class method
        super.display();

    }

    public static void main(String args[]) {
        Subclass obj = new Subclass();
        obj.printMsg();

    }
}
