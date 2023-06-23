package ex13;

class Box<T> {
    T num; // 포괄적인 타입
}

public class Generic01 {
    public static void main(String[] args) {
        Box<Integer> b1 = new Box<>(); // 타입지정해주는것
        b1.num = 1;
        Box<Double> b2 = new Box<>();
        b2.num = 1.0;

    }
}
