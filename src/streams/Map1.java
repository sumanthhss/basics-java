package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Map1
{
    public static void main(String[] args)
    {
        List<Integer> n = Arrays.asList(10,15,20,25,30);

        List<Integer> evenNumberList = new ArrayList<Integer>();

        n.stream().map(i->i*3).forEach(System.out::println);

    }
}
