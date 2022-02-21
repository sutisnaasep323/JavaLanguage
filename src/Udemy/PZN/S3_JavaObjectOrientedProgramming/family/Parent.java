package Udemy.PZN.S3_JavaObjectOrientedProgramming.family;

class Parent {
    String name;

    void doIt(){
        System.out.println("Do it in parent");
    }
}

class Child extends Parent {
//    String name; -> variabel hiding

    void doIt(){
        System.out.println("Do it in child");
        System.out.println("Parent name is " + super.name);
    }
}