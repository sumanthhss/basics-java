package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

class FlatMap2
{
    public static void main(String[] args)
    {
        List<String> n1 = Arrays.asList("Melisandre","Sansa","Jon","Donarrays","Joffrey");
        List<String> n2 = Arrays.asList("A","B","C","D","E");
        List<String> n3 = Arrays.asList("F","G","H","I","J");
        List<String> n4 = Arrays.asList("K","L","M","N","O");
        List<List<String>> data = new ArrayList<>();
        data.add(n1);
        data.add(n2);
        data.add(n3);
        data.add(n4);
//  Before Java 8
//        for(List<String> n: data)
//        {
//            for(String name:n)
//            {
//                System.out.println(name);
//            }
//        }

        data.stream().flatMap(Collection::stream).forEach(i-> System.out.println(i));
    }
}
