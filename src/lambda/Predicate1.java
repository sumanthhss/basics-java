package lambda;

import java.util.function.Predicate;

class Predicate1
{
    public static void main(String[] args)
    {
        Predicate<Integer> p = i -> (i > 10);
//        System.out.println(p.test(10));
//        System.out.println(p.test(20));

//        Ex2: given string greater than 4 or not
        Predicate<String> pr = i -> (i.length()>4);
        System.out.println(pr.test("Hello"));
        System.out.println(pr.test("ant"));

//        Ex3:

        String [] names ={"david", "scott", "Smith", "Jhon", "Marry"};
        for(String name:names)
        {
            if(pr.test(name))
            {
                System.out.println(name);
            }
        }
    }
}
