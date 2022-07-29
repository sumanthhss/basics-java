package lambda;

interface Cab{
    public void cab();
}

//class Ola implements lambda.Cab{
//    public void cab()
//    {
//        System.out.println("lambda.Cab is booked....");
//    }
//}

class LambdaExpression
{
    public static void main(String[] args)
    {
        Cab cab = () -> System.out.println("Cab is Booked...");
        cab.cab();
    }
}
