import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
       Test lol= new Test();
       lol.start();

    }
    public void start(){
        System.out.println("введите число персон");
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        //Person[] tt=new Person[k];
        List<Person> tt=new ArrayList<>();
        for (int i=0;i<k;i++){
            try {
                BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("введите логин");
                String log = buf.readLine();
                System.out.println("введите пароль");
                String pass = buf.readLine();
                System.out.println("введите возраст");
                int age = Integer.valueOf(buf.readLine());
                tt.add(new Person (log, pass, age));
            }catch (IOException e) {
                e.printStackTrace();
            } catch (java.lang.NumberFormatException e) {
                System.out.println("дз как запросить новый ввод данных");
            }

        }
        for (int i=0; i<k;i++){
            System.out.println(tt.get(i));
        }
    }
}
