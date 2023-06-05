package practice.ex04_prac;

public class SafetyArea {
    private int a[];    // private으로 선언된 배열 필드
    public int length;  // public으로 선언된 길이 필드

    public SafetyArea(int size){  // 생성자
        a = new int[size];  // 입력된 size에 따라 배열 생성
        length = size;      // 배열의 길이를 length 필드에 저장
    }
    
    public int get(int index){  // index에 해당하는 배열 요소를 반환하는 메서드
        if(index >= 0 && index < length){  // 유효한 인덱스인지 확인
            return a[index];  // 해당 인덱스의 배열 요소 반환
        }
        return -1;  // 유효하지 않은 인덱스인 경우 -1 반환
    }
    
    public void put(int index, int value){  // index에 해당하는 배열 요소에 값을 설정하는 메서드
        if(index >= 0 && index < length){  // 유효한 인덱스인지 확인
            a[index] = value;  // 해당 인덱스의 배열 요소에 입력된 값을 할당
        } else {
            System.out.println("잘못된 인덱스 " + index);  // 유효하지 않은 인덱스인 경우 오류 메시지 출력
        }
    }
}