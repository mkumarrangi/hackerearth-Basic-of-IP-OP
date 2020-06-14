import java.util.Scanner;

class Reverse
{
    public static void main(String[] agrs)
    {
        Scanner scan=new Scanner(System.in);
        String line;
        line=scan.nextLine();
        String lineReverse="";
        for(int i=line.length()-1;i>=0;i--)
        {
            lineReverse=lineReverse+line.charAt(i);
        }
        if(line.equals(lineReverse))
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("No");
        }

    }
}