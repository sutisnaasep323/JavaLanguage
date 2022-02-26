package Udemy.PZN.S3_JavaObjectOrientedProgramming.product.data;

public class Product {

    /**
     * Public = bisa diakses di class lain & package lain
     * Private = hanya bisa diakses di class yang sama
     * Protected = hanya bisa diakses di package yang sama dan diturunannya
     * Default = tidak bisa diakses di luar package
     */


    public String name;
    public Integer price;

    public Product(String name, Integer price){
        this.name = name;
        this.price = price;
    }

    public String getName(){
        return name;
    }

    public Integer getPrice(){
        return price;
    }
}
