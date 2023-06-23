package ex15;

import java.io.IOException;
import java.io.InputStreamReader;

public class Input02 {
    public static void main(String[] args) {
       //(키보드) 연결
       // InputStream in = System.in;
        InputStreamReader ir = new InputStreamReader(System.in);
        //배열로 만들어서 큰 데이터로 받을수 있어
        //아스키코드가 아닌 바로 글자로 읽어줘

        //읽기
        try {
            char[] ch = new char[5];
           ir.read(ch);

for (char c : ch) {
    System.out.println(c);
    
}
           
        } catch (IOException e) {
            e.printStackTrace();//오류에 대한 모든 로그를 다 보여주겠다.
        } //throw된거지 메인에서 예외처리하라고 (컴파일이셉션)

    }
}
