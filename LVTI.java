public class LVTI {
    // var num = 10; // Not allowed: `var` cannot be used as a class-level field

    public static void main(String[] args) {
        int a = 9; // Regular declaration
        var b = 8; // `var` correctly infers the type as int
        // System.out.println(num); // `num` is not defined

        String varName = "Vaibhav"; // Using "var" as a variable name is valid

        int c;
        // var d; // Error: `var` requires initialization at the time of declaration

        int[] nums = new int[10]; // Regular array declaration

        var nums1 = new int[10]; // `var` infers the type as int[]

        var obj = new Alien(); // Correct instantiation of an object using `var`

        System.out.println("Value of b: " + b);
        System.out.println("Value of varName: " + varName);
    }
}

// Example class for object creation
class Alien {
    @Override
    public String toString() {
        return "Alien object created!";
    }
}
