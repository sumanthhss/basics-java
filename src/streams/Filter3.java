package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

class Filter3
{
    public static void main(String[] args)
    {
        List<String> words = Arrays.asList("cup", null, "forest", "sky", "book", null);

//        Method reference
//        List<String> result = words.stream().filter(Objects::nonNull).collect(Collectors.toList());

        List<String> result = words.stream().filter(w->w!=null).collect(Collectors.toList());
        System.out.println(result);
    }
}
