package ex05.ch05;

/**
 * 인터페이스
 * 1. 필요한 메서드만 노출시키고 싶을때!!
 * 2. 프로그램 설계할 때, 특정 메서드만 사용하도록 강제시키고 싶을 때!!
 */

// CarAble의 구현체는 Car이다.
interface CarAble {
    public abstract void 엑셀();
}// 사용자에게 노출시키고 싶은 UX제공

class Car implements CarAble {
    private void 엔진가열() {System.out.println("엔진가열");}
    private void 모터작동() {System.out.println("모터작동");}
    private void 바퀴회전() {System.out.println("바퀴회전");}

    @Override
    public void 엑셀() {
        엔진가열();
        모터작동();
        바퀴회전();}}

public class InterEx01 {
    public static void main(String[] args) {
        CarAble carAble = new Car(); // 다형성을 만족하기위해 implement한게 아니다.
        // 행위를 제한시키기 위해서지
        // 다형성 신경쓸 필요 없다. 그냥 문법이다. car가 carAble은 아니잖아
        carAble.엑셀();}}
