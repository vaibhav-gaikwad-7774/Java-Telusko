sealed class A extends Thread implements Cloneable permits B, C {
    // Class A logic
}

non-sealed class B extends A {
    // Class B logic
}

final class C extends A {
    // Class C logic
}

// Class D extends non-sealed class B, so further subclassing is allowed
class D extends B {
    // Class D logic
}

// Sealed interface example
sealed interface X permits Y {
    // Interface X logic
}

final class Y implements X {
    // Class Y logic
}

public class SealedClass {
    public static void main(String[] args) {
        // Example usage of the classes
        A a = new B();
        A c = new C();
        B b = new D();

        System.out.println("Sealed class example executed.");
    }
}
