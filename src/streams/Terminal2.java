package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

class Terminal2
{
    public static void main(String[] args)
    {
        List<Integer> n = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
       long evenNumber = n.stream().filter(i->i%2==0).count();
        System.out.println(evenNumber);

//        n.stream().min((val1,val2)->{return val1.compareTo(val2);});

      Optional<Integer> max = n.stream().max(Integer::compareTo);
        System.out.println(max.get());
        Optional<Integer> min = n.stream().min(Integer::compareTo);
        System.out.println(min.get());

    }
}
