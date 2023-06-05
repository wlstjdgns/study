package practice;

import java.util.Scanner;

public class Pract03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("x: ");
        int x = sc.nextInt();
        System.out.print("y: ");
        int y = sc.nextInt();

        System.out.println("두 수의 합: "+(x+y));
        System.out.println("두 수의 차: "+(x-y));
        System.out.println("두 수의 곱: "+(x*y));
        double Z = (double)((x+y)/2);
        System.out.println("두 수의 평균: "+Z);
        System.out.println("두 수의 큰 수: "+((x>y) ? x:y));
        System.out.println("두 수의 작은수: "+((x<y) ? x:y));


        sc.close();
    }
}
