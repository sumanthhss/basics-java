package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Stu
{

    String name;
    int score;

    Stu(String name, int score)
    {
        this.name = name;
        this.score = score;
    }

    public String getName()
    {
        return this.name;
    }

    public int getScore()
    {
        return  this.score;
    }
}


class ParallelStream
{
    public static void main(String[] args)
    {
        List<Stu>  students = Arrays.asList(
                new Stu("A",45),
                new Stu("B",65),
                new Stu("C",75),
                new Stu("D",85),
                new Stu("E",95));

//        using stream - sequencial
        students.stream().filter(i->i.getScore()>80).limit(3).forEach(stu-> System.out.println(stu.getName() +"  "+stu.getScore()));

//        parallel Stream
        students.parallelStream().filter(i->i.getScore()>80).limit(3).forEach(stu-> System.out.println(stu.getName() +"  "+stu.getScore()));

        //       Convert stream to parallel
        students.stream().parallel().filter(i->i.getScore()>80).limit(3).forEach(stu-> System.out.println(stu.getName() +"  "+stu.getScore()));


    }
}
