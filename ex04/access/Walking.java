package ex04.access;

public class Walking {
    private static double claculateCalory(int walk) {

        return 0.02 * (double)walk;
        
    }

    public static void main(String[] args) {
          
            double result = Walking.claculateCalory(5000);
            System.out.println(result);
    }
}
