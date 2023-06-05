package practice;

import java.util.Scanner;

public class Pract02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("이름을 입력하시오: ");
        String m = sc.nextLine();
        System.out.println(m+"은 바보다.");
        sc.close();
    }
    
}
