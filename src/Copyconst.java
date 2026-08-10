public class Copyconst {

    String data;

    public Copyconst() {
        this.data = "Original Data";
    }

    public Copyconst(Copyconst h) {
        this.data = h.data; // Copies data from 'h'
        System.out.println("Hello! Successfully copied: " + this.data);
    }

    public static void main(String[] args) {

        Copyconst original = new Copyconst();
        Copyconst copy1 = new Copyconst(original);

        Copyconst copy2 = new Copyconst(new Copyconst());
    }
}