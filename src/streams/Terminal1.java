package streams;

import java.util.Arrays;
import java.util.List;

/*
* distinct()
* limit()
* count()
*
* */
class Terminal1
{
    public static void main(String[] args)
    {
        List<String> vechicleList = Arrays.asList("bus", "car", "bycle", "bus", "car", "car", "bike");

        vechicleList.stream().distinct().forEach(i-> System.out.println(i));

        long a = vechicleList.stream().distinct().count();
        System.out.println(a);

        vechicleList.stream().limit(2).forEach(i-> System.out.println(i));
    }
}
