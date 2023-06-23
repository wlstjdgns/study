package practice.J0530;

public class Mystar03 {
    public static void main(String[] args) {
        int space = 3;
        for (int i = 0; i < space; i++) {
            for (int j = 0; j < space - 1 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i * 2 + 1; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        for (int p = 0; p < space - 1; p++) {
            for (int q = 1; q < space - 1 + p; q++) {
                System.out.print(" ");
            }
            for (int r = 4; r > p * 2 + 1; r--) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

}
