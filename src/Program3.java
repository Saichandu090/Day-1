public class Program3
{
    String s1="Malayalam";
    String s2="Malayalam";

    public static void main(String[] args) {

        Program3 p=new Program3();
        boolean rs=p.s1.equals(p.s2);
        if(rs)
            System.out.println("Strings are Equal");
        else
            System.out.println("Strings are not Equal");
    }
}
