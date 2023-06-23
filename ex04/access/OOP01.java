package ex04.access;

class Player {
    String name; //상태값
    int thirty; // 0-100 (범주가 있는 데이터)(클수록 목마름)
    public void drink(){//드링크라는 메서드를 하나 만들어주자
        thirty = thirty -30;
    }
    public Player(String name, int thirty) {
        this.name = name;
        this.thirty = thirty;
    }//Alt+Enter

    // public Player(String name, int thirty) {//생성자는 무조건 클래스 이름으로. 
    // //인수를 안넣었으니까 에러가 나지 괄호 안에 있는 애들은 스택이야. 
    // this.name = name; //스택에 있는 이름받은걸 위에 상태값으로 옮기는거야
    // this.thirty = thirty; //위에 있는 상태값에 넣어주는게 목표인거야
    // }
}

public class OOP01 {
    public static void main(String[] args) {
//Player p= new Player(); 에러안나던게 난다. 왜? 내가 위에 디폴트 생성자들 부여해줬으니까 자동으로 안해주지 
        Player p1 = new Player("홍길동", 100); // 변수를 선언했는데 값을 안넣으면 null이다.
        Player p2 = new Player("임꺽정",100); //인수를 부여해주는 것이다.

        System.out.println(p1.name);
        System.out.println(p2.name);
        p2.drink();
        System.out.println(p1.thirty);
        System.out.println(p2.thirty);
    }

}
