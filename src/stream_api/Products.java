package stream_api;

class Products {
    private int id;
    private String name;
    private String category;
    private double price;
    private boolean inStock;

    public Products(int id, String name, String category, double price, boolean inStock) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
        this.inStock = inStock;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getCategory() { return category; }
    public double getPrice() { return price; }
    public boolean isInStock() { return inStock; }

    @Override
    public String toString() {
        return name + " [" + category + ", $" + price + ", Stock=" + inStock + "]";
    }
}