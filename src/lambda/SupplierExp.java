package lambda;

import java.util.Date;
import java.util.function.Supplier;

class SupplierExp
{
    public static void main(String[] args)
    {
        Supplier<Date> s = Date::new;
        System.out.println(s.get());
    }
}
