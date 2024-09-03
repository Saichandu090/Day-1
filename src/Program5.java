import java.util.Scanner;
import java.util.stream.StreamSupport;

public class Program5
{
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the year");
        int year=sc.nextInt();

        if(year>999&&year<=9999)
        {
            boolean rs=isLeap(year);
            if(rs)
                System.out.println(year+" is a leap year");
            else
                System.out.println(year+" is not a leap year");
        }
        else
        {
            System.out.println("Enter year in valid 4 digit number");
        }
    }

    public static boolean isLeap(int year)
    {
       return year%400==0||(year%4==0&&year%100!=0);
    }
}
