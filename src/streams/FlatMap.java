package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class FlatMap
{
    public static void main(String[] args)
    {
        List<Integer> n1 = Arrays.asList(10,15);
        List<Integer> n2 = Arrays.asList(20,25);
        List<Integer> n3 = Arrays.asList(30,35);

        List<List<Integer>> finalist = Arrays.asList(n1,n2,n3);
        finalist.stream().flatMap(i->i.stream().map(j->j*3)).forEach(System.out::println);
    }
}
