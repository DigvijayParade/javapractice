package functionalInterfacess;

import collection_framworks.Product;

@FunctionalInterface
public interface TaxCalculator {
    // Single Abstract Method (SAM)
    double calculateTax(pojo_classes.Product p);
}