package ex14;

public class Thread01 {
    //CPU가 하나의 스레드를 생성하여 실행된다.
    //실(스레드)== main 메서드
 public static void main(String[] args) {


new Thread(() -> {//람다식 ()->{} // {}내부는 타겟(스레드의 길이)
for(int i = 0; i<10; i++){
        System.out.println("서브쓰레드: "+i);

        try {
            Thread.sleep(900);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}).start();//실을 만드는 코드

    for(int i = 0; i<10; i++){
        System.out.println("메인쓰레드: "+i);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
 }   
}

