package practice.J0526;

public class ArrayTest3 {
    public static void main(String[] args) {
        int[] score = {10, 20 ,30, 40, 50};
        for(int i=0;i<score.length;i++){
            System.out.printf(score[i]+" ");}

        for(int e : score)
        System.out.printf(e+" ");    
    }
}
