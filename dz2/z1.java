package dz2;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
public class z1 {
    public static void main(String[] args) throws IOException {
        FileWriter wr = new FileWriter("dz2/log.txt", true);
        int m[] = {2, 5, 7, 12, 35, 1, 4, 10, 3, 5};
        boolean check = false;
        int temp = 0;
        while (!check){
            check = true;
            for (int i = 0; i < m.length-1; i++) {
                if (m[i] > m[i+1]){
                    check = false;
                    temp = m[i];
                    m[i] = m[i+1];
                    m[i+1] = temp;
                    wr.write(Arrays.toString(m) + "\n");         
                }

            }
        wr.flush();
        }
    }
    
}