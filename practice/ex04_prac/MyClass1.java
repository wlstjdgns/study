package practice.ex04_prac;

public class MyClass1 {
    int x,y;

    public MyClass1(){
        this(0,0);
    }
    public MyClass1(int x){
        this(x,0);
    }
    public MyClass1(int x,int y){
        this.x = x;
        this.y = y;
    }
}
