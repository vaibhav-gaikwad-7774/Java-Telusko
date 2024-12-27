record Alien(int id, String name) implements Cloneable {
    static int num;
    // int age; not declared in the followiing way

    public Alien {
        if (id == 0) {
            throw new IllegalArgumentException();
        }

    }

    public void show() {

    }

    // public Alien(int id, String name) {
    // this.id = id;
    // this.name = name;
    // }

}

public class Record {
    public static void main(String[] args) {
        Alien a1 = new Alien(1, "vaibhav");
        Alien a2 = new Alien(1, "navin");

        System.out.println(a1.equals(a2));
        System.out.println(a1.name());

    }

}
