package ex05.ch03;

abstract class Animal{//추상클래스
    abstract void speak();} //추상메소드//몸체가없음

class Dog extends Animal {
    void speak(){System.out.println("멍멍");}
 }//몸체가 없는걸 상속받아오려하니 뭔가 정의를 하라이거지

class Cat extends Animal {void speak(){System.out.println("냥냥");} }

class Bird extends Animal {void speak(){System.out.println("짹짹");}}

public class Exten03 {

    static void start(Animal u){
        u.speak();
    }
    public static void main(String[] args) {
        Animal d = new Dog();
        start(d);
        Animal c = new Cat();
        start(c);
    }
}
