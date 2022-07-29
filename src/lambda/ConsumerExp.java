package lambda;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Employee1
{
    String name;
    int salary;
    String gender;

    Employee1(String name, int salary, String gender)
    {
        this.name = name;
        this.salary = salary;
        this.gender = gender;
    }
}


class ConsumerExp
{
    public static void main(String[] args)
    {
        ArrayList<Employee1> emplist = new ArrayList<Employee1>();
        emplist.add(new Employee1("David",50000,"Male"));
        emplist.add(new Employee1("Jhon",10000,"Male"));
        emplist.add(new Employee1("Marry",50000,"female"));
        emplist.add(new Employee1("Anna",50000,"female"));

//        Function
        Function<Employee1,Integer> f = emp->(emp.salary*10)/100;

//        Predicate
        Predicate<Integer> p = b->b>=5000;

//        Consumer (Just Consumes Data)
        Consumer<Employee1> c = emp->{
            System.out.println(emp.name);
            System.out.println(emp.salary);
            System.out.println(emp.gender);
        };
        for (Employee1 e:emplist)
        {
            int bonus = f.apply(e);
            if(p.test(bonus))
            {
                c.accept(e);
                System.out.println("Employee bonus "+bonus);
            }
        }
    }
}
