package vjezba19;

import java.io.FileReader;

import java.io.IOException;

public class Vjezba19 {

    public static void main(String[] args) {

        try (FileReader fr = new FileReader("myFile.txt");) {
            int content = fr.read();

            while (content != -1) {
                System.out.println((char) content);
                content = fr.read();
            }
        } catch (IOException exc) {
            System.out.println(exc);
        }

    }

}
