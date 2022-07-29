package lambda;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

class Employee
{
    String ename;
    int salary;
    Employee(String ename, int salary){
        this.ename = ename;
        this.salary = salary;
    }
}

class functionExp2
{
    public static void main(String[] args)
    {
        ArrayList<Employee> emplist = new ArrayList<Employee>();
        emplist.add(new Employee("David",10000));
        emplist.add(new Employee("Jones",5000));
        emplist.add(new Employee("Marry",60000));
        emplist.add(new Employee("Anna",10000));

        Function<Employee,Integer> fn = e->{
            int sal =e.salary;
            if(sal>=10000 && sal<=20000)
            {
                return (sal*10/100);
            }
            else if(sal>20000 && sal<=30000)
            {
                return (sal*20/100);
            }
            else if(sal>30000 && sal<=40000)
            {
                return (sal*30/100);
            }
            else
            {
                return (sal*40/100);
            }
        };

        Predicate<Integer> p = b->b>5000;
        for(Employee employee:emplist)
        {
            int bonus = fn.apply(employee);//function
            if(p.test(bonus)){
                //predicate
                System.out.println(employee.ename+"  "+employee.salary);
                System.out.println("Bonus is :"+bonus);
            }

        }
    }
}
