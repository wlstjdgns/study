package ex08;

public class DivideByZero {

   static void divide(int n) {
        int result = 10 / n;
        System.out.println("나눗셈 결과: " + result);
    }

    public static void main(String[] args) {
        
            divide(0);
    }
}
