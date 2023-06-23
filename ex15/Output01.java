package ex15;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class Output01 {
    public static void main(String[] args) {
        OutputStream os = System.out;
        OutputStreamWriter ow = new OutputStreamWriter(os);
        BufferedWriter bw = new BufferedWriter(ow);

        try {
            bw.write("안녕");//언제까지 기록했다 보내야 할지 모르니까 
            //통신의 끝에선 /n을 써야해
            //bw.write("안녕\n");
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
