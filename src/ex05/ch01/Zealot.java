package ex05.ch01;


public class Zealot {
    String name;
        int hp;
        int attack;

        public Zealot(String name, int hp, int attack) {//()는 스택변수기 때문에 사라지잖아 밑에 힙에 올려주는 코드야
            this.name = name;
            this.hp = hp;
            this.attack = attack;
        }
    }
