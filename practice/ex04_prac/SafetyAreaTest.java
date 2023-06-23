package practice.ex04_prac;

public class SafetyAreaTest {
    public static void main(String[] args) {
        SafetyArea area = new SafetyArea(4);

        for(int i = 0; i<(area.length+1); i++){
            area.put(i, i*10);
        }
    }
}
