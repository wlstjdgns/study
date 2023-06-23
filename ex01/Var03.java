package ex01;

public class Var03 {
    public static void main(String[] args) {
        // up캐스팅(자주씀), 묵시적형변환
        int n1 = 10; //초기화 
        double d1 = n1; //변수의 선언 묵시적형변환(값이큰어항으로복사가됨)
        System.out.println(d1);

        // 다운 캐스팅, 명시적 형변환
        double d2 = 10.5;
        int n2 = (int)d2;
        System.out.println(n2);

        //문자 형변환(아스키코드)
        // 01010101111010 -> 65 문자인걸 알면 첨부터 차로 받음 단어로 받겟지
        byte ch = 65;
        char data = (char)ch; //같은 크기의 타입이어도 문자/글자가 다름으로 형변환해줘야한다. 

        System.out.println(data);


    }
    
}
