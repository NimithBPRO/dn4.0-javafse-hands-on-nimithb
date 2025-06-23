package src;
public class SearchTest {
    public static void main(String[] args) {
        Product[] products = {
            new Product(1, "Laptop", "Electronics"),
            new Product(2, "Shirt", "Apparel"),
            new Product(3, "Book", "Stationery"),
            new Product(4, "Phone", "Electronics")
        };

        // Linear search (unsorted)
        int idx1 = SearchAlgorithms.linearSearch(products, "Book");
        System.out.println("Linear Search: 'Book' found at index " + idx1);

        // Sort for binary search
        SearchAlgorithms.sortByName(products);

        // Binary search (sorted)
        int idx2 = SearchAlgorithms.binarySearch(products, "Book");
        System.out.println("Binary Search: 'Book' found at index " + idx2);
    }
}