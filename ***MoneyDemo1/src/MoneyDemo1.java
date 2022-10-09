import java.text.DecimalFormat;
import java.util.Scanner;
public class MoneyDemo1
{
    public static void main(String [] args)
    {

        double n1=0.16666667;
        double n2=1.66666667;
        double n3=16.6666667;
        double n4=166.666667;

        DecimalFormat formatter = new DecimalFormat("#0.00");//creates a decimal format object. 2 decimal digits rounding

        System.out.println(formatter.format(n1)); // this will take n1 and round it to two points of precision.
        System.out.println(formatter.format(n2));
        System.out.println(formatter.format(n3));
        System.out.println(formatter.format(n4));

        double hours;
        double rate;
        System.out.println("Enter hours as a decimal");

        Scanner keyboard = new Scanner(System.in);
        hours=keyboard.nextDouble();
        System.out.println("Enter rate as a decimal:");
        rate=keyboard.nextDouble();
        double salary= hours*rate;

        DecimalFormat df=new DecimalFormat("$0,000.00");// correct money format
        System.out.println("Your salary is "+ df.format(salary));//applies the df specializiation you created in previous line rather than the formatter.format

    }
}