package Basic;

class Parent{
    int pAge =60;
    void earn()
    {
        System.out.println("Parent earns");
    }
}
class Inheritance extends Parent
{

    int cAge=30;
    String b ="new";
//    public static void main(String[] args)
//    {
//        Inheritance i = new Inheritance();
//        System.out.println(i.cAge);
//        i.earn();
//    }
}

class Child extends Inheritance{
    void b()
    {
        System.out.println("b");
    }

    public static void main(String[] args)
    {

        Child c = new Child();
        System.out.println(c.pAge);
        System.out.println(c.cAge);
        System.out.println(c.b);

    }
}
