package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

class StreamMethods3
{
    public static void main(String[] args)
    {
        List<String> stringList = Arrays.asList("one","two","three","one");
        Optional<String> e = stringList.stream().findAny();
        System.out.println(e.get());

//        findFirst

        Optional<String> e1 =stringList.stream().findFirst();
        System.out.println(e1.get());
    }
}
