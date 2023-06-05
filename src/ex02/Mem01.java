package ex02;

public class Mem01 {
   static int price = 10000;
//static int price = 10; //스태틱 먼저 읽어 들이고 메인실행하니 위에 스태틱도 인식하는구

    public static void main(String[] args) {
        Coffee c = new Coffee();//앞에 int c = 10; 처럼 타입붙여줘야지 타입은 해당파일인거고
         //뉴를 붙이면 관련 클래스 안에 있는 걸 실행한다. 다만 스태틱이 붙어있으면 그거빼고
        System.out.println(price); //해당파일명을 붙여준다. 중복될경우에는.
        System.out.println(Coffee.price);
        System.out.println(c.name);
    }
    
}
