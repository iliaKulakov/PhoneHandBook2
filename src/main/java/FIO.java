import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.io.InputStreamReader;
public class FIO {
    ArrayList<String> mylist= new ArrayList<String>();

    public void AddSurnameHandBook() throws IOException {
    BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
    System.out.println("Введите фамилию и нажмите Enter: " );
    String surname=reader.readLine();
        mylist.add(surname);
              System.out.println("Фамилия добавлена в справочник");
    }

    public void AddNametoHandBook() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите Имя и нажмите Enter: ");
        String name = reader.readLine();
        mylist.add(name);
        System.out.println("Имя добавлено в справочник");
    }

    public void AddPhone() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите Номер телефона и нажмите Enter: ");
        String phoneNumber = reader.readLine();
        mylist.add(phoneNumber);
        System.out.println("Номер добавлен в справочник");
    }


    public void GetFIOFromHandBook() {
        //for (String x : mylist)
        //{
            System.out.println("Информация об абонентах: ");
            System.out.println(mylist);
        //}
    }

};

