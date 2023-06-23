package practice.ex04_prac;

public class Televion {
    private int channel;
    private int volume;
    private boolean isOfOff;
    Televion(int c, int v, boolean o){
        channel = c;
        volume = v;
        isOfOff = o;
    }
    void print(){System.out.println(isOfOff+"채널은 "+channel+"이고 볼륨은"+volume+"입니다.");}
    
}
