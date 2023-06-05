package ex03;

import java.util.Scanner;

public class rockPaperScissor {
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("가위(0), 바위(1), 보(2): ");
        int user = sc.nextInt();
        int computer = (int)(Math.random()*3);
        if(user==computer) System.out.println("인간: "+user+"컴퓨터: "+computer+"비겼다.");
        else if(user<=computer)  System.out.println("인간: "+user+"컴퓨터: "+computer+"컴퓨터 승리");
        else  System.out.println("인간: "+user+"컴퓨터: "+computer+"인간 승리");
    sc.close();}}
