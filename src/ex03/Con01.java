package ex03;

public class Con01 {
    public static void main(String[] args) {
        int point = 90;//타입 int를 안주면 이게 몇칸인줄 알고 자바가 공간을 잡겟니
        if(point > 90){//중괄호 내부가 if의 바디
            System.out.println("A학점");
        }else{
            System.out.println("미달입니다.");
        }
        // if(조건){실행}
    }
}
