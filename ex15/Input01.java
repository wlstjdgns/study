package ex15;

import java.io.IOException;
import java.io.InputStream;

public class Input01 {
    public static void main(String[] args) {
       //(키보드) 연결
        InputStream in = System.in;

        //읽기
        try {
            int data = in.read(); //대기 기다리는중 /리스너/ 키보드반응을 계속 봐야니까
            //리드칸에서 데이터 들어올때까지 와일돌면서 기다리고 있다는 거야
             System.out.println(data);//시스템으로 받은걸 시스템으로 내보낸다는거야
             System.out.println((char)data); //아스키코드가 기본이고 다시 문자로
        } catch (IOException e) {
            e.printStackTrace();//오류에 대한 모든 로그를 다 보여주겠다.
        } //throw된거지 메인에서 예외처리하라고 (컴파일이셉션)

    }
}
