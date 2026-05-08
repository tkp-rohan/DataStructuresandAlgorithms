package Unit4_Arrays;


import java.util.*;
public class u4p2_arraylist {
    public static void main(String[] args){
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(10);
        al.add(20);
        al.add(30);
        System.out.println(al);

        ArrayList<Integer>al1 = new ArrayList<Integer>(5);
        al1.add(2);
        al1.add(4);
        al1.add(6);
        al1.add(8);
        al1.add(10);
        System.out.println(al1);
    }
}
