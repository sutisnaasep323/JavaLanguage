package Udemy.PZN.StudiKasusJavaDasar;

public class S2_AplikasiToDoList {

    public static String[] model = new String[10];

    public static void main(String[] args) {
        TestRemoveTodoList();
    }

    /**
     * Menampilkan ToDoList
     */

    public static void ShowTodoList() {
        for (int i = 0; i < model.length; i++) {
            String todo = model[i];
            int no = i + 1;

            if (todo != null) {
                System.out.println(no + ". " + todo);
            }
        }
    }

    public static void TestShowTodoList() {
        model[0] = "Tampilkan Data";
        model[1] = "Menambahkan Data";
        model[2] = "Menghapus Data";
        ShowTodoList();
    }

    /**
     * Menambahkan ToDo ke List
     */

    public static void AddTodoList(String todo) {
        // Mengecek apakah datanya ada yang kosong?
        var isFull = true;
        for (int i = 0; i < model.length; i++) {
            // jika model masih ada yang kosong
            if (model[i] == null) {
                isFull = false;
                break;
            }
        }

        //mengecek apakah sudah penuh?
        if (isFull) {
            var temp = model; // untuk menampung data sebelumnya, agar tidak hilang

            model = new String[model.length * 2];
            for (int i = 0; i < temp.length; i++) {
                model[i] = temp[i];
            }
        }

        // Tambahkan data, ke posisi data array yang null/kosong
        for (int i = 0; i < model.length; i++) {
            if (model[i] == null) {
                model[i] = todo;
                break;
            }
        }

    }

    public static void TestAddTodoList() {
        for (int i = 0; i < 25; i++) {
            AddTodoList("Contoh ke-" + i);
        }

        ShowTodoList();
    }

    /**
     * Menghapus ToDo dari List
     */
    public static boolean RemoveTodoList(Integer number) {
        if ((number - 1) >= model.length) {
            return false;
        } else if (model[number - 1] == null) {
            return false;
        } else {

            /**
             * mulai perulangan dari index yang dihapus sampai data terakhir. kemudian data digeser
             */
            for (int i = (number - 1); i < model.length; i++) {
                if (i == (model.length - 1)){ // jika data terakhir maka beri nilai null
                    model[i] = null;
                } else {
                    model[i] = model[i+1];
                }
            }
            return true;
        }
    }

    public static void TestRemoveTodoList(){
        AddTodoList("satu");
        AddTodoList("dua");
        AddTodoList("tiga");
        AddTodoList("empat");

        var result = RemoveTodoList(20);
        System.out.println(result);

        result = RemoveTodoList(5);
        System.out.println(result);

        result = RemoveTodoList(3);
        System.out.println(result);

        ShowTodoList();
    }

    /**
     * Menampilkan view ToDoList
     */

    public static void ViewShowTodoList() {

    }

    /**
     * Menampilkan view Menambahkan ToDo ke List
     */

    public static void ViewAddTodoList() {
    }


    /**
     * Menampilkan view Menghapus ToDo dari List
     */
    public static void ViewRemoveTodoList() {

    }

}
