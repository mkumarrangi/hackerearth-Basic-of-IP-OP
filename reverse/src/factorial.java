import java.util.Scanner;

public class factorial {
    public static void main(String[] agrs)
    {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int fact=1;
        while(n>0) {
            fact=n*fact;
            n--;

        }
        System.out.println(fact);
    }
}

