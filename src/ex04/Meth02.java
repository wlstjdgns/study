package ex04;
//자바는 모든게 클래스 안에 있어야한다.

class Cal02 {

    void add(int n1, int n2) { // 메서드 기본형 콜라자판기면 void(리턴할 자료형)가 콜라가되는것
        //int n1, int n2 는 매개변수다. 내가 밑에서 값을 넣어줄때 값을 가지게 된다.
        //n1과 n2 밑에서 넣어준 값은 현 바디가 끝나면 사라진다.
        //지역변수/ 매개변수/ 로컬변수 한정적인 로컬 안에서만 작동한다.
        System.out.println("더하기: "+(n1+n2));
                
    }//복귀전에 현바디(스택)는 삭제한다. 그 후 복귀 주소로 복귀한다.

    void minus(int n1, int n2) {
        System.out.println("마이너스: "+(n1-n2));
    }

    void multi(int n1, int n2) { // 메서드는 괄호가 있어야 한다. 일종의 자판기투입구 같은느낌적인 느낌적인 Feel so good~
        System.out.println("곱하기: "+(n1*n2));
    }

    void divide(int n1, int n2) {
        System.out.println("나누기: "+(n1/n2));
    }
}

public class Meth02 {
    public static void main(String[] args) {
        Cal02 c02 = new Cal02();// 내가 new하면 해당오브젝트 안에 스태틱제외 모든게 참조된다.
        // 의자모델링을(오브젝트) 만들고 내가 new 하면 의자(인스턴스)라는 실체가 생기지.
        c02.minus(10,5);// .은 객체를 연결하는 연산자이다.
        c02.multi(10,5);
        c02.divide(10,5);
        c02.add(10,5); //인수가 2개

       

    }
}
