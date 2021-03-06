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
        if (employee instanceof VicePresident){
            VicePresident vp = (VicePresident) employee;
            System.out.println("Hello vp " + vp.name);
        } else if (employee instanceof Manager){
            Manager manager = (Manager) employee;
            System.out.println("Hello manager " + manager.name);
        }else{
            System.out.println("Hello " + employee.name);
        }


    }
}
