package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;


class HashMap1
{
    public static void main(String[] args)
    {
        HashMap<String,ArrayList<Integer>> map = new  HashMap<String,ArrayList<Integer>>();
        map.put("mango", new ArrayList<Integer>(Arrays.asList(0, 4, 8, 9, 12)));
        map.put("orange", new ArrayList<Integer>(Arrays.asList(0, 4, 8, 9, 12)));
        map.put("pineaple", new ArrayList<Integer>(Arrays.asList(0, 4, 8, 9, 12)));
        String key = "u";
        int number = 42;
        map.putIfAbsent(key, new ArrayList<Integer>());
        System.out.println(map.get(key).add(number));
    }
}
