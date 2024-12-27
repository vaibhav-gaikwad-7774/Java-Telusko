record Alien(int id, String name) {

}

public class Record {
    public static void main(String[] args) {
        Alien a1 = new Alien(1, "vaibhav");
        Alien a2 = new Alien(1, "navin");

        System.out.println(a1.equals(a2));
        System.out.println(a1);

    }

}
