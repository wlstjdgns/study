package ex05.prac05;

class 엘리스 {
    
    static String name = "엘리스";
    int height = 160;

    public 엘리스() {}

    void eat(int qty) {
        this.height = this.height + (10 * qty);
        System.out.println(this.height);
    }
}

public class MemApp {
    public static void main(String[] args) {
        엘리스 e = new 엘리스(); //먼저 메인열리면서 new 앨리스()가 동시에 실행된다.
        e.eat(5);
    }
}