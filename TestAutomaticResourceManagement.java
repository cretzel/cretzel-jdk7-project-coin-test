import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TestAutomaticResourceManagement {

    public void test() {

        try (final BufferedReader br = new BufferedReader(new FileReader("./TestAutomaticResourceManagement.java"))) {

           String line;
           while ((line = br.readLine()) != null) {
               System.out.println(line);
           }

        } catch (final IOException e) {
        }


    }

    public static void main(final String[] args) {
        new TestAutomaticResourceManagement().test();
    }
}
