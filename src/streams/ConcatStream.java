package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class ConcatStream
{
    public static void main(String[] args)
    {
        List<String> animalsList = Arrays.asList("Dog","cat","elephant");
        List<String> birdsList = Arrays.asList("peacock","parrot","crow");

        Stream<String> s1 = animalsList.stream();
        Stream<String> s2 = birdsList.stream();

        Stream.concat(s1,s2).forEach(System.out::println);
    }
}
