import java.util.Scanner;

public class Program6
{
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of N");
        int n=sc.nextInt();

        if(n>=0 && n<31)
        {
            printTab(n);
        }
        else
        {
            System.out.println("Please enter valid number");
        }
    }

    public static void printTab(int n)
    {
        for(int i=1;i<=n;i++)
        {
            System.out.println("2^"+i+"="+pow(2,i));
        }
    }

    public static int pow(int n,int i)
    {
        int prod=1;
        do{
            prod=prod*n;
            i--;
        }while(i!=0);
        return prod;
    }
}
