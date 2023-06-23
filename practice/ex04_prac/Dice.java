package practice.ex04_prac;

public class Dice {
    private int value;

    public Dice(){value=0;}
    public void roll(){value=(int)(Math.random()*6)+1;}
    public int getValue() {
        return value;
    }
    public void setValue(int value) {
        this.value = value;
    }
    
    public static void main(String[] args) {
        int count = 0;
        Dice d1 = new Dice();
        Dice d2 = new Dice();

        do{
            d1.roll();
            d2.roll();
            count++;
            System.out.println("다이스1: "+d1.getValue()+"다이스2: "+d2.getValue());
        }while(d1.getValue()+d2.getValue()!=2);
System.out.println("횟수"+count);    }


}
