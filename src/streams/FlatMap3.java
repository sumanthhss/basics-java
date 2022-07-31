package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Student
{
    String sname;
    int sid;
    char grade;

    Student(String sname,int sid, char grade){
        this.sname =sname;
        this.sid =sid;
        this.grade =grade;
    }
}
class FlatMap3
{
    public static void main(String[] args)
    {
        List<Student> s1 = Arrays.asList(new Student("A", 001,'a'),new Student("B", 002,'b'),new Student("C", 002,
                'c'),new Student("D", 002,'D'),new Student("E", 002,'E'));

        List<Student> s2 = Arrays.asList(new Student("A", 001,'a'),new Student("B", 002,'b'),new Student("C", 002,
                'c'),new Student("D", 002,'D'),new Student("E", 002,'E'));

        List<Student> s3 = Arrays.asList(new Student("A", 001,'a'),new Student("B", 002,'b'),new Student("C", 002,
                'c'),new Student("D", 002,'D'),new Student("E", 002,'E'));

        List<List<Student>> finalList = Arrays.asList(s1,s2,s3);

        finalList.stream().flatMap(i->i.stream()).forEach(i-> System.out.println(i.sname));
    }
}
