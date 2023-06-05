package practice;

public class ComOperator {
    public static void main(String[] args) {
        int r = 20;
        int r1 = 30;
        double area1 = 2*r*r*3.141592;
        double area2 = r*r*3.141592;
        System.out.println(area1);
        System.out.println(area2);
        System.out.println(((area1>area2)? r:r1) + "cm 피자 한개를 주세요.");
    }
    
}
