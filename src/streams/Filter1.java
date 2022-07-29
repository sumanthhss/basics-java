package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Filter1
{
    public static void main(String[] args)
    {
        List<Integer> n = Arrays.asList(10,15,20,25,30);

        List<Integer> evenNumberList = new ArrayList<Integer>();

//        without using streams
        /*
        for(int num:n){
            if(num%2==0)
            {
                evenNumberList.add(num);
            }
        }
        System.out.println(evenNumberList);*/

//        with streams

        /*
        evenNumberList = n.stream().filter(i->i%2==0).collect(Collectors.toList());
        System.out.println(evenNumberList);
         */

        n.stream().filter(i->i%2==0).forEach(System.out::println);

    }
}
