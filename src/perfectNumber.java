import java.util.Scanner;

class perfectNumber
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n, i = 1, sum = 0;
        System.out.println("Enter Number:");
        n = sc.nextInt();
        while (i < n)
        {
            if (n % i == 0)
            {
                sum = sum + i;
            }
            i++;
        }
        if (sum == n)
        {
            System.out.println(i + "is a perfect number");
        }
        else
        {
            System.out.println(i + "is not a perfect number");
        }
    }
}
