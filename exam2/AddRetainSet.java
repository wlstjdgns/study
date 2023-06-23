package exam2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class AddRetainSet {
    public static void main(String[] args) {
        Set<Integer> s1 = new HashSet<>(Arrays.asList(1,2,3,4,5,7,9));
        Set<Integer> s2 = new HashSet<>(Arrays.asList(2,4,6,8));

        Set<Integer> z1 = new HashSet<>(s1);
        z1.addAll(s2);
        System.out.println(z1);

        Set<Integer> z2 = new HashSet<>(s2);
        z2.retainAll(s1);
        System.out.println(z2);   }}
