package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

class Terminal3
{
    public static void main(String[] args)
    {
        List<String> strList = Arrays.asList("A","B","C","1","2","3");
      Optional<String> reduced =strList.stream().reduce((value, combinedValue)->{
          return combinedValue+value;
        });

        System.out.println(reduced.get());
    }
}
