package lambda;

import java.util.ArrayList;
import java.util.function.Predicate;

class Predicate2
{
    String ename;
    int salary;
    int experiance;

    Predicate2(String name, int sal, int exp)
    {
        ename = name;
        salary = sal;
        experiance = exp;
    }

}

class demo2{

    public static void main(String[] args)
    {
        Predicate2 predicate2 = new Predicate2("Jhon",99019238,5);
        Predicate<Predicate2> pr = p->(p.salary>30000 && p.experiance>3);
//        System.out.println(pr.test(predicate2));

//        Ex2:
        ArrayList<Predicate2> al = new ArrayList<Predicate2>();
        al.add(new Predicate2("Jhon",99019238,5));
        al.add(new Predicate2("B",99019238,5));
        al.add(new Predicate2("C",10,5));
        al.add(new Predicate2("D",10,5));
        al.add(new Predicate2("E",10,5));
        for(Predicate2 p:al)
        {
            if(pr.test(p))
            {
                System.out.println(p.ename+"  "+p.salary);
            }
        }

    }
}