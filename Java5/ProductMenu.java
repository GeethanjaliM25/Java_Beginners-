package com.mit.ui;

import java.util.List;
import java.util.Scanner;

import com.mit.pojo.Product;
import com.mit.service.InvalidProductException;
import com.mit.service.ProductService;
import com.mit.service.ProductServiceImpl;

public class ProductMenu {

    private static ProductService service = new ProductServiceImpl();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("1.Save\n2.Find\n3.List\n4.Price\n5.Delete\n6.Exit");
            System.out.print("Enter choice: ");

            int choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    save(scanner);
                    break;

                case 2:
                    find(scanner);
                    break;

                case 3:
                    list();
                    break;

                case 4:
                    price(scanner);
                    break;

                case 5:
                    delete(scanner);
                    break;

                case 6:
                    System.out.println("Thank you!");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }

    // Save
    private static void save(Scanner scanner) {

        System.out.print("Enter product code: ");
        int code = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Enter product name: ");
        String name = scanner.nextLine();

        System.out.print("Enter product price: ");
        double price = scanner.nextDouble();

        Product p = new Product(code, name, price);

        boolean result = service.save(p);

        if (result) {
            System.out.println("Product saved successfully");
        }
    }

    // Find
    private static void find(Scanner scanner) {

        System.out.print("Enter product code: ");
        int code = scanner.nextInt();

        try {

            Product p = service.findByCode(code);

            System.out.println("Product found:");
            System.out.println(p);

        } catch (InvalidProductException e) {

            System.out.println(e.getMessage());
        }
    }

    // List
    private static void list() {

        List<Product> products = service.listAll();

        if (products.isEmpty()) {

            System.out.println("No products available");

        } else {

            for (Product p : products) {
                System.out.println(p);
            }
        }
    }

    // Price
    private static void price(Scanner scanner) {

        System.out.print("Enter minimum price: ");
        double min = scanner.nextDouble();

        System.out.print("Enter maximum price: ");
        double max = scanner.nextDouble();

        List<Product> products = service.findByPriceRange(min, max);

        if (products.isEmpty()) {

            System.out.println("No products found");

        } else {

            for (Product p : products) {
                System.out.println(p);
            }
        }
    }

    // Delete
    private static void delete(Scanner scanner) {

        System.out.print("Enter product code: ");
        int code = scanner.nextInt();

        try {

            boolean result = service.delete(code);

            if (result) {
                System.out.println("Product deleted successfully");
            }

        } catch (InvalidProductException e) {

            System.out.println(e.getMessage());
        }
    }
}