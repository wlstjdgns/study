package ex04;


class Account {
    /// 입금(입금할 금액, 계좌잔액)
    int deposit(int amount, int money) {
        int restMoney = money + amount;
        return restMoney;// return 메서드를 호출한 라인으로 값을 반환하는것
        // return 1.1; 은 안되지 왜? 실수니까. 그럴거면 앞에 (double)붙여줘
        // return값이랑 위에 메서드값은 같아야해

    }

    // 출금(입금할 금액 300, 계좌잔액 money)
    int withdraw(int amount, int money) {
        int restMoney = money - amount;
        return restMoney;

    }
    //이체transFer (보낼금액(amount)/받는사람 잔액(receiverMoney),보내는사람잔액 (senderMoney)) 
    
        //리턴은 필요없다 출력만해보자.
    //출력: 보내는사람 잔액 출력
//출력: 보낸사람 잔액 출력
}

public class Meth04 {
    public static void main(String[] args) {

        // 홍길동의 잔액
        int hMoney = 1000;

        // 임꺽정의 잔액
        int iMoney = 1000;
        // 홍길동이 입금을 2번하고, 출금을 1번 함
        Account hAccount = new Account(); // Account로 내가 타입을만들었다.
        hMoney = hAccount.deposit(500, hMoney);// 입금이라는 행위를 할거다.
        System.out.println("남은 금액은: " + hMoney + "원");
        hMoney = hAccount.deposit(300, hMoney);
        System.out.println("남은 금액은: " + hMoney + "원");
        hMoney = hAccount.withdraw(500, hMoney);
        System.out.println("남은 금액은: " + hMoney + "원");

        // 임꺽정이 입금을 1번(100원)하고, 출금을 2번(300원,500원)하기

        Account iAccount = new Account();
        iMoney = iAccount.deposit(100, iMoney);// 입금이라는 행위를 할거다.
        System.out.println("남은 금액은: " + iMoney + "원");
        iMoney = iAccount.withdraw(300, iMoney);
        System.out.println("남은 금액은: " + iMoney + "원");
        iMoney = iAccount.withdraw(500, iMoney);
        System.out.println("남은 금액은: " + iMoney + "원");
        
       

    }

}