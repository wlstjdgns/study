package ex13;

class Data<T>{
int status;//200
T body;//값
}

public class Generic03 {

Data<?> getNum(int check){//와일드카드<?> 리턴타입을 동적으로 바꿀수잇음
    if(check == 1){
        Data<String> data = new Data<>();
        return data;
    }else{
    Data<Integer> data = new Data<>();
        return data;
    
    }
}
Object getNum2(int check){
    if(check == 1){
        return "안녕";
    }else{
        return 1;
    }
}

    public static void main(String[] args) {
        // Generic03 g3 = new Generic03();
        // int n = (int) g3.getNum2(1);
        // Data<?> d = g3.getNum(3);
    }
}
