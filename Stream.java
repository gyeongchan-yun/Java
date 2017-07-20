import java.io.InputStream; //byte
import java.io.InputStreamReader; //character
import java.io.BufferedReader; //String

public class Stream {
    public static void main (String[] args) throws Exception {
        InputStream in = System.in;
        InputStreamReader ir = new InputStreamReader(in);
        BufferedReader br = new BufferedReader (ir);

        //int a;
        //a = in.read();

        String a = br.readLine();
        System.out.println(a);
    }
}