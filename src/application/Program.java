package application;

import entities.Product;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author 8pg
 */
public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner read = new Scanner(System.in);
        Product prod = new Product();
        Product prod2 = new Product("TV", 1500.00, 0);

        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        prod.setName(read.nextLine());
        System.out.print("Price: ");
        prod.setPrice(read.nextFloat());

        System.out.println("\nProduct data: " + prod); //IDE entende que como está num contexto de impressão que espera um parametro de String, implicitamente ele vai chamar o toString()
        System.out.println("");
        System.out.print("Enter the number of products to be added in stock: ");
        prod.addProducts(read.nextInt());
        System.out.println("\nUpdated data: " + prod);
        System.out.print("Enter the number of products to be removed from stock: ");
        prod.removeProducts(read.nextInt());
        System.out.println("\nUpdated data: " + prod);

        read.close();
    }
}
