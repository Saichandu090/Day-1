import java.util.*;
public class Program4
{
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of times to flip a coin");
        int n=sc.nextInt();

        getPerc(n);

    }

    public static void getPerc(int n)
    {
        double hp=0.0,tp=0.0;
        while(n>0)
        {
            double s=Math.random();
            if(s<0.5)
                hp=hp+s;
            else
                tp=tp+s;
            n--;
        }
        System.out.println("Heads Percentage is "+hp);
        System.out.println("Tails Percentage is "+tp);
    }
}
