package com.pluralsight.NorthwindTradersSpringBoot;

import com.pluralsight.Product;
import com.pluralsight.ProductDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class NorthwindApp implements CommandLineRunner {

    @Autowired
    private ProductDAO pd;

    @Override
    public void run(String... args) throws Exception {

        Scanner keyboard = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("======= NWT Product Management System =======");
            System.out.println("1) List Products");
            System.out.println("2) Add Products");
            System.out.println("0) EXIT");
            System.out.println("Choose an option: ");

            int choice = keyboard.nextInt();
            keyboard.nextLine();

            switch (choice) {
                case 1 -> listProducts();
                case 2 -> addProduct(keyboard);
                case 0 -> {
                    running = false;
                    System.out.println("Goodbye");
                }
                default -> System.out.println("Invalid option! Try again..");
            }
        }
    }
    
    private void listProducts() {
        System.out.println("======== Product List =========");
        for (Product product : pd.getAll()) {
            System.out.printf("ID: %d | Name: %s | Category: %s | Price: $%.2f%n", product.getProductID(), product.getName(), product.getCategory(), product.getPrice());
        }
    }

    private void addProduct(Scanner keyboard) {
        System.out.println("\n=== Add New Product ===");
        System.out.print("Enter Product ID: ");
        int id = keyboard.nextInt();
        keyboard.nextLine();

        System.out.print("Enter Product Name: ");
        String name = keyboard.nextLine();

        System.out.print("Enter Category: ");
        String category = keyboard.nextLine();

        System.out.print("Enter Price: ");
        double price = keyboard.nextDouble();
        keyboard.nextLine();

        Product newProduct = new Product(id, name, category, price);
        pd.add(newProduct);

        System.out.println("Product added successfully!");

    }
}
