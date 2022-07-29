package lambda;

import java.util.function.Function;

class FunctionExp
{
    public static void main(String[] args)
    {
        Function<Integer,Integer> f = n->n*n;
//        System.out.println(f.apply(10));
//        System.out.println(f.apply(200));

//        Function<String,Integer> fn = s -> s.length();
        Function<String,Integer> fn = String::length;
        System.out.println(fn.apply("Welcome"));
        System.out.println(fn.apply("Jhon"));

    }
}
