package streams;

import java.util.Arrays;
import java.util.List;

import netscape.javascript.JSObject;

class Product{

    int id;
    String name;
    float price;
    public  Product(int id, String name, float price){
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
class Filter4
{
    public static void main(String[] args)
    {
        List<Product> products = Arrays.asList(new Product(1,"pro1",12345),new Product(2,"pro2",12345),
                new Product(3,"pro3",22345),new Product(1,"pro1",12345),new Product(4,"pro4",32345));

        products.stream().filter(p->p.id==1).forEach(p->System.out.println(p.name));

    }
}
