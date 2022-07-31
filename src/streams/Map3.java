package streams;

import java.util.Arrays;
import java.util.List;

class Prod{

    int id;
    String name;
    float price;
    public  Prod(int id, String name, float price){
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
class Map3
{
    public static void main(String[] args)
    {
        List<Prod> products = Arrays.asList(new Prod(1,"pro1",12345),new Prod(2,"pro2",12),
                new Prod(3,"pro3",22345),new Prod(1,"pro1",12345),new Prod(4,"pro4",32345));

        products.stream().filter(i->i.price>2500).map(i->i.price).forEach(System.out::println);
    }
}
