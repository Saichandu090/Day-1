import java.util.Scanner;

public class Program3
{
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first String");
        String s1=sc.next();
        System.out.println("Enter second String");
        String s2=sc.next();
        boolean rs=s1.equals(s2);
        if(rs)
            System.out.println("Strings are Equal");
        else
            System.out.println("Strings are not Equal");
    }
}
