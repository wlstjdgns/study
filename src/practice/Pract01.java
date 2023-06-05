package practice;

import java.util.Scanner;

public class Pract01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("오렌지의 개수를 입력하시오: ");
        int O = sc.nextInt();
        System.out.println((O/10)+"박스가 필요하고 "+(O%10)+"개가 남습니다.");
        sc.close();}}
