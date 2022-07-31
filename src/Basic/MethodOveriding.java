package Basic;

class Animal{
    void makeNoise()
    {
        System.out.println("Some Noise");
    }
}
class MethodOveriding extends  Animal
{
    void makeNoise()
    {
        System.out.println("hh Ss");
    }

    public static void main(String[] args)
    {
        MethodOveriding m = new MethodOveriding();
        m.makeNoise();
    }
}

