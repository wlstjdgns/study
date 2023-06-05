package practice;

import java.util.Scanner;

public class Project1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("번호를 선택하시오: ");
        int select = sc.nextInt();

        if (select == 1) {
            System.out.print("화씨온도를 입력하시오: ");
            Double f = sc.nextDouble();
            Double c_temp = ((f - 32) / 9 * 5);
            System.out.print("섭씨온도는 " + c_temp);} 
            else {
            System.out.print("섭씨온도를 입력하시오: ");
            Double c = sc.nextDouble();
            Double f_temp = ((c * 9 / 5) + 32);
            System.out.print("화씨온도는 " + f_temp);}
        sc.close();}}
