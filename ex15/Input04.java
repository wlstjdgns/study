package ex15;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Input04 {
    public static void main(String[] args) {

        try {
            InputStream in = new FileInputStream("input.txt");
            InputStreamReader ir = new InputStreamReader(in);
            BufferedReader br = new BufferedReader(ir);
            String data = br.readLine();//머리속으로 추상화가 딱딱 되어잇어야해
            //내 버퍼를 비워서 OS 버퍼내용을 채워내는거야.

            // if(br.readLine() !=null){
            //     System.out.println(br.readLine());
            // }
            // if((date=br.readLine()) !=null){
            //     System.out.println(br.readLine());
            // }
            //이미 버퍼를 비운다음에 그걸 읽으라고 하면 어쩌냐
            System.out.println(data);
        } catch (Exception e) {
            e.printStackTrace();
       
    }
    }}
