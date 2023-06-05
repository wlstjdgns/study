package practice.ex04_prac;

public class TelevionTest {
    public static void main(String[] args) {
        Televion myTv = new Televion(7, 10, true);
        myTv.print();
        Televion youTv = new Televion(10, 5, false);
        youTv.print();
    }
}
