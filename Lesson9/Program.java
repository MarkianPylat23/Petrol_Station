package Lesson9;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Program {
    public static void main(String[] args) {

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.dat"))) {
            {
                Person p = new Person("Marik", 18);
                Person o = new Person("Pavlo", 27);
                oos.writeObject(p);
                oos.writeObject(o);
            }
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        System.out.println(e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
