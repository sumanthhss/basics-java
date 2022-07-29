package lambda;

import java.util.function.Function;

//andThen()
//compose()
class functionExp3
{
    public static void main(String[] args)
    {
        Function<Integer,Integer> f1 = n->n*2;
        Function<Integer,Integer> f2 = n->n*n*n;
//        System.out.println(f1.andThen(f2).apply(2));
        System.out.println(f1.compose(f2).apply(2));
    }

}
