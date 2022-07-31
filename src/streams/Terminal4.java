package streams;

import java.util.Arrays;
import java.util.List;

class Terminal4
{
    public static void main(String[] args)
    {
        List<Integer> n = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        Object[] arr = n.stream().toArray();
        System.out.println(arr.length);
        for (Object a:arr)
        {
            System.out.println(a);
        }

    }
}
