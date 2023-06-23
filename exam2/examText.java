package exam2;

public class examText {
public static void main(String[] args) {
    
}
           public int solution(int angle) {
            int answer = 0;
            if(angle==180)return 4;
            if(angle==90)return 2;
            if(90>angle && angle>0)return 1;
            if(180>angle && angle>90)return 3;
            return answer;
        }
    }

