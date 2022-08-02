package streams;

import java.util.HashSet;
import java.util.Set;

class StreamMethods2
{
    public static void main(String[] args)
    {
        Set<String> f = new HashSet<String>();
        f.add("one Apple");
        f.add("One Mango");
        f.add("One Apples");
        f.add("One grapes");
        f.add("Two guavas");

        boolean res = f.stream().anyMatch(i-> i.startsWith("one"));
        System.out.println(res);

        res = f.stream().allMatch(i-> i.startsWith("one"));
        System.out.println(res);

        res = f.stream().noneMatch(i-> i.startsWith("one"));
        System.out.println(res);

    }
}
