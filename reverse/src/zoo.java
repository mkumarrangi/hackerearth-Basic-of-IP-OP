import java.util.Scanner;

public class zoo {
    public static void main(String[] arg)
    {
        Scanner scan=new Scanner(System.in);
        String str=scan.nextLine();
        String strz="";
        String stro="";
        for (int i = 0; i <str.length(); i++)
        {
            if(str.charAt(i)=='z')
            {
                strz=strz+str.charAt(i);
            }
            if(str.charAt(i)=='o')
            {
                stro=stro+str.charAt(i);
            }
        }
        if(2*strz.length()==stro.length())
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }
}
