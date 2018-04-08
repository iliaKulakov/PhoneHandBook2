import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Scanner;
public class App {

    public String getGreeting() {
        return "Hello world.";
    }

    public static void main(String[] args) throws IOException {
        System.out.println(new App().getGreeting());
        FIO Example1= new FIO();
        Example1.AddNametoHandBook();
        Example1.AddSurnameHandBook();
        Example1.AddPhone();
        Example1.GetFIOFromHandBook();

    }



}
