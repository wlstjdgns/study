package ex15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Input03 {
    public static void main(String[] args) {
       
        BufferedReader br = 
        new BufferedReader(new InputStreamReader(System.in));//생성자를 주입받으면서 만드는 패턴
        //데코레이션 패턴이라고 한다. 잘만들어져잇는걸 주입받아서 만든다는겨

        //읽기
        try {
String data = br.readLine();
System.out.println(data);           
       } catch (IOException e) {
            e.printStackTrace();//오류에 대한 모든 로그를 다 보여주겠다.
        } //throw된거지 메인에서 예외처리하라고 (컴파일이셉션)

    }
}
