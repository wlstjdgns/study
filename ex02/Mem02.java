package ex02;

public class Mem02 {
        static int price = 10000;
    
        public static void main(String[] args) {
            System.out.println(Mem01.price);
            System.out.println(Coffee.price);
            Coffee c = new Coffee();
            System.out.println(c.name);
            
            c.run();
            
        
    }
    
}
