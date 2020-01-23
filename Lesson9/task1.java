package Lesson9;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class task1 {
    public static void main(String args[]) throws IOException, ClassNotFoundException {
    FileInputStream fis = new FileInputStream("temp.out");
    ObjectInputStream oin = new ObjectInputStream(fis);
    TestSerial ts = (TestSerial) oin.readObject();
    System.out.println("version="+ts.version);
}
}
