package practice.ex04_prac;

public class Box {
    int width, length, heigth;

   
    double getVoume(){
         return (double)width*heigth*length;
     }
}

class myBox {
    public static void main(String[] args) {
        Box myBox = new Box();
        myBox.width = 20;
        myBox.heigth = 30;
        myBox.length = 20;
        
        System.out.println(myBox.width);
        System.out.println(myBox.getVoume());
    }
}
