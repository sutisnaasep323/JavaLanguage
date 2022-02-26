package Udemy.PZN.S3_JavaObjectOrientedProgramming.product.app;

import Udemy.PZN.S3_JavaObjectOrientedProgramming.product.data.Product;

public class Application {
    public static void main(String[] args) {
        Product product = new Product("MBP Pro", 30_000_000);
        System.out.println(product.name);
        System.out.println(product.price);

        System.out.println(product.getName());
        System.out.println(product.getPrice());
    }
}
