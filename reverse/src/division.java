import java.util.Scanner;

public class division {
    public static void main(String[] agrs)
    {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        //int arr[]=new int[n];
        long product;
        for(int i=0;i<n;i++)
        {
            product=scan.nextLong();
            product=product%1000000007;
            System.out.println(product);
        }
        /*for(int i=0;i<n;i++)
        {
            arr[i]=scan.nextInt();
        }
        for(int j=0;j<n;j++)
        {
            product=(product*arr[j])%1000000007;
            System.out.println(product);
        }
        System.out.println(product);

         */
    }
}

