package Udemy.PZN.S3_JavaObjectOrientedProgramming.product.data;

public class ProductApp {
    public static void main(String[] args) {
        Product product = new Product("Lenovo", 30_000_000);
        System.out.println(product.name);
        System.out.println(product.price);
    }
}
