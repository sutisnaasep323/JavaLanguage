package Udemy.PZN.S3_JavaObjectOrientedProgramming.company;

public class PolymerphismApp {

    public static void main(String[] args) {
        Employee employee = new Employee("Asep");
        employee.sayHello("Yumi");

        employee = new Manager("Asep");
        employee.sayHello("Yumi");

        employee = new VicePresident("Asep", "PT Syukur", 20);
        employee.sayHello("Yumi");

        sayHello(new Employee("Hammad"));
        sayHello(new Manager("Hammad"));
        sayHello(new VicePresident("Hammad"));

    }

    static void sayHello(Employee employee){
        System.out.println("Hello " + employee.name);
    }
}
