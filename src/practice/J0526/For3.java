package practice.J0526;

import java.util.Scanner;

public class For3 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("정수를 입력하시오: ");
       int sel = sc.nextInt();
       long result = 1;

       for(int i=1; i<=sel; i++){
               result = result*i;}
    
       System.out.println(result);
       sc.close();



    
}
}