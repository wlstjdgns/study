package practice.J0526;


class addd {
    void printRestMoney(){//메서드, 행위 무조건자바는 클래스 밖에 아무것도 둘수없다.
//static이 안붙었고 실행되도 공간에 안뜬다. 행위의내부가스택(단기기억)이다. 메서드안에 메서드가 들어갈수없다.
//힙은 약간 장기기억이다. 
//클래스를 new로 참조하면 static빼고 다 참조된다.
    } //클래스 위에 클래스를 둘수 있고 그 안에 메서드 넣을 수는 있다.
}


public class Coin {

    void printRestMoney(){//메서드, 행위 무조건자바는 클래스 밖에 아무것도 둘수없다.

    }
    public static void main(String[] args) {
        // 500,100,50,10(개수를 최소로 해서 주세요.)
        final int money = 12125683; // 파이널은 불변의 수로 만들어준다. 받은돈을 얼마받았는지 스캐너로 수정하기
        int restMoney = money; //위 머니는 그대로 두고 밑에  남은금액에 현재돈 넣고 막 바꿀거야. 네이밍은 풀로적는게 가독성이 좋다. 다른사람도 알아들어야지.
        //int count; //동전 개수를 담을 변수


        int[] tempMoney = {500, 100, 50, 10};
        for(int coin:tempMoney){
            int count = restMoney / tempMoney.length;
            System.out.println(tempMoney+"원"+count+"개");
            restMoney = restMoney % coin;
        }
       


        /*tempMoney=500;
        count = restMoney/tempMoney; //5
        System.out.println(tempMoney+"개"+count);
        restMoney = restMoney % tempMoney;

        tempMoney=100;
        count = restMoney/tempMoney; //26 위에 500원 주고 또 2600원 줄거 아니면 조심해
        System.out.println(tempMoney+"개"+count);
        restMoney = restMoney%tempMoney;

        tempMoney=50;
        count = restMoney/tempMoney; //26
        System.out.println(tempMoney+"개"+count);
        restMoney = restMoney%tempMoney;

        tempMoney=10;
        count = restMoney/tempMoney; //26
        System.out.println(tempMoney+"개"+count);
        restMoney = restMoney%tempMoney;
        */


    }
}
