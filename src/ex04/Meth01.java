package ex04;
//자바는 모든게 클래스 안에 있어야한다.

class Elis {
    int height = 160;
    int x = 0;

    void eat(){
        height = height + 10;
    }
    void walk(){
        x = x+1;
    }
}//////////위에가 바로 OOP적인 코드이다.

class Cal01 {
void add(){ //메서드 기본형 콜라자판기면 void(리턴할 자료형)가 콜라가되는것 
 System.out.println("add 호출됨");}

 int x,y;
 int z=0;

    void minus() {
        System.out.println("minus 호출됨");
    }

    void multi() { //메서드는 괄호가 있어야 한다. 일종의 자판기투입구 같은느낌적인 느낌적인 Feel
        System.out.println("multi 호출됨");
    }

    void divide() {
        System.out.println("divide 호출됨");
    }}

public class Meth01 {
public static void main(String[] args) {
    Cal01 cl = new Cal01();//내가 new하면 해당오브젝트 안에 스태틱제외 모든게 참조된다.
    cl.add();
    cl.minus();//.은 객체를 연결하는 연산자이다.
    cl.multi();
    cl.divide();

    Cal01 c2 = new Cal01();//의자모델링을(오브젝트) 만들고 내가 new 하면 의자(인스턴스)라는 실체가 생기지.
    c2.add();
    c2.minus();//.은 객체를 연결하는 연산자이다.
    c2.multi();
    c2.divide();

}
}
