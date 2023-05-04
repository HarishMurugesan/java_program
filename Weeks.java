public class Weeks
{
 public static void main(String args[])
    {
        Weeks obj = new Weeks();
        obj.Days(3);
        obj.Days(5);

    }
public void Days(int n)
{
        switch (n)
 {
        
case 1:
    {
        System.out.println("Monday");
        break;
    }
case 2:
    {
        System.out.println("Tuesday");
        break;
    }
case 3:
    {
        System.out.println("Wednesday");
        break;
    }
case 4:
    {
        System.out.println("Thursday");
        break;
    }
case 5:
    {
        System.out.println("Friday");
        break;
    }
case 6:
    {
        System.out.println("Saturday");
        break;
    }
case 7:
    {
        System.out.println("sunday");
        break;
    }
default:
    {
        System.out.println("pls check the number");
    }
 }
}
}
