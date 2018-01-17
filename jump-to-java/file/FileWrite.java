import java.io.FileOutputStream; //byte like InputStream
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class FileWrite {
    public static void main (String[] args) throws IOException {
        FileOutputStream output = new FileOutputStream ("test.txt");

        for(int i=1;i<11;i++) {
            String data = i + "th lines. \r\n";
            output.write(data.getBytes()); //convert to byte
        }

        FileWriter fw = new FileWriter("test2.txt",false);

        for(int i=1;i<11;i++) {
            String data = i + "th lines. \r\n";
            fw.write(data);
        }

        FileWriter fw2 = new FileWriter("test2.txt");

        for(int i=11;i<21;i++) {
            String data = i + "th lines. \r\n";
            fw.write(data);
        }

        PrintWriter pw = new PrintWriter ("test3.txt");

        for(int i=1;i<11;i++) {
            String data = i + "th lines. "; //no newline char
            pw.println(data);
        }

        pw.close();
        fw.close();
        output.close();
    }
}