package exam2;

import java.util.ArrayList;

public class ArrayListTest2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("사과");
        list.add("수박");
        list.add("딸기");
        list.add("감귤");

        int index = list.indexOf("수박");

        System.out.println("수박의 위치: "+index);
        System.out.println(list); }}