package practice.Ktalk;

public class Walking {
    public static void main(String[] args) {
        
        double result = calculateCalory(5000);
        System.out.println("소모 칼로리: "+result+"kcal");
    }

    private static double calculateCalory(int walk){
        return 0.02*walk;
    }
}
