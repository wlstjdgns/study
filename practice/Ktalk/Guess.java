package practice.Ktalk;

import java.util.Scanner;

public class Guess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int randomInt = (int)(Math.random()*100)+1; 
        int attemp = 0;


        for(int guess=0; guess != randomInt; attemp++){
            System.out.print("정답을 추측하여 보시오 ");
            guess = sc.nextInt();

            if(guess>randomInt){
                System.out.println("추측한 숫자가 높습니다. ");
            }else if(guess<randomInt){
                System.out.println("추측한 숫자가 낮습니다. ");
            }else{
                System.out.println("축하드립니다.");
                System.out.println("추측한 횟수"+attemp+"번");
            }


        }
    sc.close();}
}
