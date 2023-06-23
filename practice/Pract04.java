package practice;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Pract04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("날짜를 입력하세요 (yyyy-MM-dd): ");
        String dateStr = sc.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate date = LocalDate.parse(dateStr, formatter);

        System.out.print("변경할 항목을 선택하세요 (연:Y, 월:M, 일:D): ");
        String choice = sc.nextLine();

        if (choice.equalsIgnoreCase("Y")) {
            System.out.print("변경할 연도의 차이를 입력하세요: ");
            int yearInterval = sc.nextInt();
            date = date.plusYears(yearInterval);
        } else if (choice.equalsIgnoreCase("M")) {
            System.out.print("변경할 월의 차이를 입력하세요: ");
            int monthInterval = sc.nextInt();
            date = date.plusMonths(monthInterval);
        } else if (choice.equalsIgnoreCase("D")) {
            System.out.print("변경할 일의 차이를 입력하세요: ");
            int dayInterval = sc.nextInt();
            date = date.plusDays(dayInterval);
        } else {
            System.out.println("잘못된 선택입니다.");
            sc.close();
            return;
        }

        System.out.println("결과: " + date.format(formatter));

        sc.close();
    }
}
