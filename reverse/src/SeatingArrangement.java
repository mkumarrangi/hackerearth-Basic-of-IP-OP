import java.util.*;

class TestClass {

    public static void main(String args[] ) throws Exception {

        int size;

        Scanner s = new Scanner(System.in);

        size = s.nextInt();

// System.out.println("Size0 "+size);

        int arr[];
        int seat_No,remainderForSeat,remainderForOpposite;
        arr = new int[size];

        for(int i=0;i<size;i++)

        {

            arr[i] = s.nextInt();
            System.out.println();

            seat_No = arr[i];

            remainderForSeat = (seat_No % 6);

            remainderForOpposite = (seat_No % 12);



            if(remainderForOpposite == 1)

            {System.out.print(seat_No+11);}

            else if(remainderForOpposite == 2)

            {System.out.print(seat_No+9);}

            else if(remainderForOpposite == 3)

            {System.out.print(seat_No+7);}

            else if(remainderForOpposite == 4)

            {System.out.print(seat_No+5);}

            else if(remainderForOpposite == 5)

            {System.out.print(seat_No+3);}

            else if(remainderForOpposite == 6)

            {System.out.print(seat_No+1);}

            else if(remainderForOpposite == 7)

            {System.out.print(seat_No-1);}

            else if(remainderForOpposite == 8)

            {System.out.print(seat_No-3);}

            else if(remainderForOpposite == 9)

            {System.out.print(seat_No-5);}

            else if(remainderForOpposite == 10)

            {System.out.print(seat_No-7);}

            else if(remainderForOpposite == 11)

            {System.out.print(seat_No-9);}

            else if(remainderForOpposite == 0)

            {System.out.print(seat_No-11);}



            if((remainderForSeat == 0)||(remainderForSeat == 1))

            {System.out.print(" WS");}

            else if((remainderForSeat == 2)||(remainderForSeat == 5))

            {System.out.print(" MS");}

            else if((remainderForSeat == 3)||(remainderForSeat == 4))

            {System.out.print(" AS");}

        }




    }

}

