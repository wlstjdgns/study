package ex13;

class 윤석열 {
    private Object data;
    private static 윤석열 instance = new 윤석열();//new 는 여기서만 가능하게.
    //제네릭은 타입을 포괄적으로 선정해주는건데 얘는 메모리에 이미 new를 
    //해놓은 상태이니 어떤타입넣고싶은지 2차개발자가 정할수있도록 오브젝트로
    //걸어두는거지

    public static 윤석열 getInstance(){
        return instance;
    }
    private 윤석열(){}
    public Object getData() {
        return data;
    }
    public void setData(Object data) {
        this.data = data;
    }
}

public class Generic02 {
    public static void main(String[] args) {
        윤석열 d1 = 윤석열.getInstance();
        d1.setData(1);

        int value = (int) d1.getData();
        System.out.println(value);

    }
}
