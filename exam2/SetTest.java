package exam2;

import java.util.HashSet;

public class SetTest {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>();

        set.add("밀크");
        set.add("우유");
        set.add("드링크");
        set.add("핫식스");
        set.add("밀키스");
        set.add("밀키스");

        System.out.println(set);

        if(set.contains("우유")){
            System.out.println("우유포함되어있음"); }}}
