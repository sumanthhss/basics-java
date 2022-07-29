package lambda;

import java.util.function.Predicate;

class joinPredicate
{
    public static void main(String[] args)
    {
        int [] a ={10,15,20,25,30,35,40,45,50,55,60};
        Predicate<Integer> p1 = i->i%2==0;
        Predicate<Integer> p2 = i->i>50;
        for(int n:a)
        {
//            normal
//            if(p1.test(n)&&p2.test(n))
//            {
//                System.out.println(n);
//            }
//          and
//            if(p1.and(p2).test(n)){
//                System.out.println(n);
//            }
//            or
//            if(p1.or(p2).test(n))
//            {
//                System.out.println(n);
//            }
            if(p1.negate().test(n)){
                System.out.println(n);
            }
        }

    }
}