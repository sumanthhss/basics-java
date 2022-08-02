package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class StreamMethods
{
    public static void main(String[] args)
    {
        List<Integer> list1 = Arrays.asList(2,4,1,7,5,9);
        System.out.println("rev sorted...");
        list1.stream().sorted().forEach(System.out::println);
        System.out.println("rev sorted...");
        list1.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

        List<String> list2 = Arrays.asList("Jhon", "Marray","Kim","David","Smith");
        list2.stream().sorted().forEach(System.out::println);
        list2.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

    }
}
