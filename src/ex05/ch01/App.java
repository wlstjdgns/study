package ex05.ch01;

public class App {

    static void attack(Zealot u1, Dragoon u2) {// 3. 매개변수에 주소값준거야.
        u2.hp = u2.hp - u1.attack; // 1.z1,d1 스택은 메인이 알지 이스택에선 모르지
        // 2.매개변수에 내가 들고 있는 주소값(d1,z1)을 전달해줘야해
        System.out.println(u1.name + "이 " + u2.name + "을 공격했습니다.");
        System.out.println(u2.name + "이 공격당했습니다.");
        System.out.println(u2.name + "의 남은 hp: " + u2.hp);
    }

    static void attack(Zealot u1, Zealot u2) {
        u2.hp = u2.hp - u1.attack;
        System.out.println(u1.name + "이 " + u2.name + "을 공격했습니다.");
        System.out.println(u2.name + "이 공격당했습니다.");
        System.out.println(u2.name + "의 남은 hp: " + u2.hp);
    }

    static void attack(Zealot u1, DarkTempler u2) {
        u2.hp = u2.hp - u1.attack;
        System.out.println(u1.name + "이 " + u2.name + "을 공격했습니다.");
        System.out.println(u2.name + "이 공격당했습니다.");
        System.out.println(u2.name + "의 남은 hp: " + u2.hp);
    }

    static void attack(Dragoon u1, Zealot u2) {
        u2.hp = u2.hp - u1.attack;
        System.out.println(u1.name + "이 " + u2.name + "을 공격했습니다.");
        System.out.println(u2.name + "이 공격당했습니다.");
        System.out.println(u2.name + "의 남은 hp: " + u2.hp);
    }

    static void attack(Dragoon u1, Dragoon u2) {
        u2.hp = u2.hp - u1.attack;
        System.out.println(u1.name + "이 " + u2.name + "을 공격했습니다.");
        System.out.println(u2.name + "이 공격당했습니다.");
        System.out.println(u2.name + "의 남은 hp: " + u2.hp);
    }

    static void attack(Dragoon u1, DarkTempler u2) {
        u2.hp = u2.hp - u1.attack;
        System.out.println(u1.name + "이 " + u2.name + "을 공격했습니다.");
        System.out.println(u2.name + "이 공격당했습니다.");
        System.out.println(u2.name + "의 남은 hp: " + u2.hp);
    }

    static void attack(DarkTempler u1, Zealot u2) {
        u2.hp = u2.hp - u1.attack;
        System.out.println(u1.name + "이 " + u2.name + "을 공격했습니다.");
        System.out.println(u2.name + "이 공격당했습니다.");
        System.out.println(u2.name + "의 남은 hp: " + u2.hp);
    }

    static void attack(DarkTempler u1, Dragoon u2) {
        u2.hp = u2.hp - u1.attack;
        System.out.println(u1.name + "이 " + u2.name + "을 공격했습니다.");
        System.out.println(u2.name + "이 공격당했습니다.");
        System.out.println(u2.name + "의 남은 hp: " + u2.hp);
    }

    static void attack(DarkTempler u1, DarkTempler u2) {
        u2.hp = u2.hp - u1.attack;
        System.out.println(u1.name + "이 " + u2.name + "을 공격했습니다.");
        System.out.println(u2.name + "이 공격당했습니다.");
        System.out.println(u2.name + "의 남은 hp: " + u2.hp);
    }

    public static void main(String[] args) {
        Zealot z1 = new Zealot("질럿1", 100, 10);// z1이라는 주소값은 메인스택에 상태값은 힙에 질럿값이 힙에 있으니까 얹어줘
        Zealot z2 = new Zealot("질럿2", 100, 10);
        Dragoon d1 = new Dragoon("드라군1", 100, 5); // d1의 상태를 한번에 설정해줄수잇지
        Dragoon d2 = new Dragoon("드라군1", 100, 5);
        DarkTempler t1 = new DarkTempler("다크1", 100, 20);
        DarkTempler t2 = new DarkTempler("다크2", 100, 20);

        // 질럿 -> 드라군 공격
        attack(z1, d1);
        // 질럿 - > 질럿 공격
        attack(z1, z2);
        // 질럿 - > 다크 공격
        attack(z1, t1);

        // 드라군 -> 질럿 공격
        attack(d1, z1);
        // 드라군 -> 드라군 공격
        attack(d1, d2);
        // 드라군 -> 다크 공격
        attack(d1, t1);

        // 다크 -> 질럿 공격
        attack(t1, z1);
        // 다크 -> 드라군 공격
        attack(t1, d2);
        // 다크 -> 다크 공격
        attack(t1, t2);

        //오버로딩 체험하기
        System.out.println();
        System.out.println(1);//sysout도 다 오버로딩이야 같은 코드로 다적용하잖아.
        System.out.println(1.1);
        System.out.println('가');
        System.out.println("다나가");
        System.out.println(true);
    }
}
