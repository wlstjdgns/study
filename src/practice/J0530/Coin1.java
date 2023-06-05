package practice.J0530;

public class Coin1 {
    final int money =  5160; // scanner 로 수정하기
    int restMoney = money; // 남은 금액 변수 만들기
    int count; // 동전 개수를 담을 변수

    void printRestMoney(int m) { // 행위 //만약 앞에 스태틱이 붙는다면 위 힙과 밑 스태틱공간분리된다.
        //행위 구문 쓰는데 앞에 동사가 들어가야지 프린트없다고 restMoney이러면 안돼 남은금액이 동사가 아냐
        count = restMoney / m;
        System.out.println(m + "원 : " + count);
        restMoney = restMoney % m;
    }

    public static void main(String[] args) {
        Coin1 c1 = new Coin1();
       // printRestMoney();//이건 실행 못하지 왜? 위에 스태틱이 아니라 힙공간이니까 아직 공간확보실행안된상태
       c1.printRestMoney(500);
       c1.printRestMoney(100);
       c1.printRestMoney(50);
       c1.printRestMoney(10);
    }
}

