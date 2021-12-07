package streamex;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

public class OutputStreamEx {
    public static void main(String[] args) {
        PrintStream ps = null;
        OutputStream out = null;
        try {
            ps = System.out;
            out = (OutputStream)ps;
            // int first = 'A';
            int first = 65;
            int second = 'b';
            out.write(first);
            out.write(second);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if(ps != null) ps.close();
                if(out != null) out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    
}
