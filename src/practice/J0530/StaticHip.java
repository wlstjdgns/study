package practice.J0530;

public class StaticHip {

int k = 10;
int n = 20; //static 앞에 붙이면 밑에 참조가 되지.

//    static void printRestMoney(){ // 행위
//         System.out.println(n);//static이 붙으면 n이랑 다른 공간이기도 하고..
    

//위아래가 공간이 아예 다르니 서로 참조 되지 않아 지금은. new를 해줘야해

    public static void main(String[] args) {//메인도 메서드 메서드 안에 있는건 다 스택에 뜬다.
        StaticHip c2 = new StaticHip();//k,n 메모리에 로딩됨
        //스태틱 안에는 힙 변수를 넣을 수 없다.
        System.out.println(c2.k);
    }
}

