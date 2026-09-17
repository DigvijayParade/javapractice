package stream_api;

import java.util.ArrayList;
import java.util.List;

import functionalInterfacess.TaxCalculator;
import pojo_classes.Product;

public class StoreApp {

    // Helper method that accepts our custom functional interface
    public static void printProductInvoice(Product p, TaxCalculator taxCalc) {
        double taxAmount = taxCalc.calculateTax(p);
        double totalPrice = p.getPrice() + taxAmount;
        System.out.println(p.getName() + " | Base: $" + p.getPrice() + 
                           " | Tax: $" + taxAmount + " | Total: $" + totalPrice);
    }

    public static void main(String[] args) {
        List<Product> inventory = new ArrayList<>();
        inventory.add(new Product(101, "Gaming Laptop", 1200.00));
        inventory.add(new Product(102, "Wireless Mouse", 25.00));
        inventory.add(new Product(103, "Mechanical Keyboard", 90.00));

        // Implementing custom functional interface via Lambdas
        TaxCalculator standardTax = p -> p.getPrice() * 0.10; // 10% rate
        TaxCalculator luxuryTax = p -> p.getPrice() * 0.20;   // 20% rate

        System.out.println("--- Standard Rate Invoices ---");
        for (Product p : inventory) {
            printProductInvoice(p, standardTax);
        }

        System.out.println("\n--- High Value Product Luxury Rate ---");
        inventory.stream()
                 .filter(p -> p.getPrice() > 500.00)
                 .forEach(p -> printProductInvoice(p, luxuryTax));
    }
}