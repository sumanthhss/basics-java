package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Filter2
{
    public static void main(String[] args)
    {
        List<String> names = Arrays.asList("Melisandre","Sansa","Jon","Donarrays","Joffrey");
        List<String> longNames =new ArrayList<String>();

//        longNames = names.stream().filter(n->n.length()>2 && n.length()<4).collect(Collectors.toList());
        //        System.out.println(longNames);


        names.stream().filter(n->n.length()>2 && n.length()<4).forEach(System.out::println);



    }
}
