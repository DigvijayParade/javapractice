public class Copyconst {

    String data;

    // 1. Default/Normal Constructor (Used to create the FIRST object)
    public Copyconst() {
        this.data = "Original Data";
    }

    // 2. Copy Constructor (Takes an existing Copyconst object and duplicates it)
    public Copyconst(Copyconst h) {
        this.data = h.data; // Copies data from 'h'
        System.out.println("Hello! Successfully copied: " + this.data);
    }

    public static void main(String[] args) {
        // Option A: Two distinct steps (Clearer)
        Copyconst original = new Copyconst();
        Copyconst copy1 = new Copyconst(original);

        // Option B: Your exact inline syntax now works!
        Copyconst copy2 = new Copyconst(new Copyconst());
    }
}