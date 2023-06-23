package practice;

import java.util.Scanner;

public class Prac77 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("구매한 가격: ");
        int price = sc.nextInt();
        int answer = 0;
        if(1000000>=price&&price>10){
        if (300000 > price && price >= 100000) {
            answer += price - (price / 20);
        } else if (500000 > price && price >= 300000) {
            answer += price - (price / 10);
        } else {
            answer += price - (price / 5);
        }}

        System.out.println("할인된 가격: "+answer);
sc.close();
    }
}
