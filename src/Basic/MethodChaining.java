package Basic;

class A{
    void m1()
    {
        System.out.println("in A");
    }
}
class MethodChaining extends A
{
    void  m1(){
        System.out.println("in Method Chaning Class");
        super.m1();
    }
    public static void main(String[] args)
    {
        MethodChaining m = new MethodChaining();
        m.m1();
    }
}
