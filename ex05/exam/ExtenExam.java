package ex05.exam;

abstract class 육식동물 {
    abstract void printMyName();

}

class Tiger extends 육식동물 {
    private String name;

    public Tiger(String name) {
        this.name = name;
    }

    public void printMyName() {
        System.out.println(name);
    }
}

class Lion extends 육식동물 {
    private String name;

    public Lion(String name) {
        this.name = name;
    }

    public void printMyName() {
        System.out.println(name);
    }
}

public class ExtenExam {
    static void start(육식동물 u) {
        u.printMyName();

    }

    public static void main(String[] args) {
        Lion lion = new Lion("숫사자");
        Tiger tiger = new Tiger("호랑이1");
        start(lion);
        start(tiger);

    }
}
