import java.util.Scanner;

public class text1 {


    public void checkPrime(int a) {
        if (a <= 1) {
            System.out.println("The number is non-prime");
            return;
        }

        boolean isPrime = true;
        for (int i=2; i<=Math.sqrt(a);i++) 
        {
            if (a%i==0)
            {
                isPrime = false;
                break;
            }
        }
        if (isPrime) 
        {
            System.out.println("The number is prime");
        } else 
        {
            System.out.println("The number is non-prime");
        }
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int a  = sc.nextInt();
        text1 t = new text1();
        t.checkPrime(a);
    }
}


