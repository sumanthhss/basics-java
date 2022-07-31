package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Map2
{
    public static void main(String[] args)
    {
        List<String> names = Arrays.asList("Melisandre","Sansa","Jon","Donarrays","Joffrey");
        List<String> longNames =new ArrayList<String>();

        names.stream().map(String::toUpperCase).forEach(System.out::println);

    }
}
