package Udemy.PZN.S2_StudiKasusJavaDasar;

import java.util.Scanner;

public class S2_AplikasiTodoList_1 {

    /*
    1. View Menu -
    2. View Add -
    3. View Remove -
    4. View Data -
    5. Logic input -
    6. logic add -
    7. logic remove
     */

    public static String[] model = new String[2];
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        MenuShowTodoList();
    }


    /**
     * Input
     */

    public static String Input(String info){
        System.out.print(info + " : ");
        String data = input.nextLine();
        return data;
    }

    //test Input
    public static void testInput(){
        var nama = Input("Nama"); // masukkan input
        System.out.println("Halo " + nama); // tampilkan input, apakah berhasil?

        var kelas = Input("Kelas");
        System.out.println("Kelas: " + kelas);

        var npm = Input("NPM");
        System.out.println("NPM: " + npm);
    }

    /**
     * Menampilkan Todo list <Tampilan Awal>
     */

    public static void MenuShowTodoList(){
        while (true){
            ShowTodoList();

            System.out.println("==== Menu Todo List ====");
            System.out.println("1. Menambahkan Todo");
            System.out.println("2. Menghapus Todo");
            System.out.println("x. Keluar");

            var input = Input("Pilih");

            if (input.equals("1")){
                ViewAddTodoList();
            } else if (input.equals("2")){
                ViewRemoveTodoList();
            } else if (input.equalsIgnoreCase("x")){
                break;
            } else {
                System.out.println("Maaf pilihan tidak dimengerti");
            }

        }
    }

    /**
     * Menampilkan Todo listnya
     */

    public static void ShowTodoList() {
        System.out.println("Data Todo List");
        for (int i = 0; i < model.length; i++) {
            var todo = model[i];
            var no = i + 1;

            if (todo != null) {
                System.out.println(no + ". " + todo);
            }
        }
    }

    /*
    View Add Todo List
     */
    public static void ViewAddTodoList(){
        System.out.println("==== Tambah Todo List ====");
        var todo = Input("Masukkan Todo (x, jika batal)");

        if (todo.equalsIgnoreCase("x")){

        } else {
            AddTodoList(todo);
        }

    }

    /*
    View Remove Todo List
     */
    public static void ViewRemoveTodoList(){

        ShowTodoList();

        System.out.println("==== Remove Todo List ====");
        var remove = Input("Hapus Todo ke- (x, jika batal)");

        if (remove.equalsIgnoreCase("x")){

        } else {
            boolean ifnotsucces = RemoveTodoList(Integer.parseInt(remove));
            if (ifnotsucces) {
                System.out.println("Gagal menghapus todo ke: " + remove);
            }
        }
    }

    /**
     * Logic Menambahkan Todo list
     */

    public static void AddTodoList(String todo){
        var isFull = true;

        for (int i = 0; i < model.length; i++) {
            if(model[i] == null){
                isFull = false;
                break;
            }
        }

        if(isFull){
            var temp = model;

            model = new String[model.length * 2];
            for (int i = 0; i < temp.length; i++) {
                model[i] = temp[i];
            }
        }

        for (int i = 0; i < model.length; i++) {
            if (model[i] == null){
                model[i] = todo;
                break;
            }
        }
    }


    /**
     * Logic Menghapus Todo list
     */
    public static boolean RemoveTodoList(int number){
        if ((number-1) >= model.length){
            return true;
        } else if (model[number-1] == null){
            return true;
        } else {

            for (int i = (number-1); i < model.length; i++) {
                if(i == (model.length-1)){ //data terakhir
                    model[i] = null;
                } else {
                    model[i] = model[i+1]; //geser
                }
            }

            return false;
        }
    }

    // Test Menambahkan TodoList
    public static void testAddTodoList(){

    }

    public static void TestViewAddTodoList(){
        AddTodoList("test1");
        AddTodoList("test2");

        ViewAddTodoList();

        ShowTodoList();
    }

    //Test ShowTodoList
    public static void testShowTodoList() {
        AddTodoList("Menambahkan Data");
        AddTodoList("Menghapus Data");
        AddTodoList("Exit");

        ShowTodoList();
    }

    //Test ShowRemoveTodoList
    public static void testRemoveTodoList() {
        AddTodoList("Asep");
        AddTodoList("Yumi");
        AddTodoList("Kazu");

        ShowTodoList();

        //RemoveTodoList();

        ShowTodoList();
    }
}
