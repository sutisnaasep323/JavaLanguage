package Udemy.PZN.S3_JavaObjectOrientedProgramming.family;

public class ParentApp {
    public static void main(String[] args) {
        /*
        di java tidak ada namanya field/attribut overriding adanya method
        field/attribute itu independen/berdiri sendiri
         */

        Child child = new Child();
        child.name = "Asep";
        child.doIt();
        System.out.println(child.name);

        Parent parent = (Parent) child;
        parent.doIt();
        System.out.println(parent.name);
    }
}
