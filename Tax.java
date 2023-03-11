import java.util.Random;
import java.util.Scanner;
public class Tax {
    public static void main(String[] args) {
        int number;
        Random rand = new Random();
        number= rand.nextInt(15)+1;
        Scanner in = new Scanner(System.in);
        int amount;
        double tax,max=0;
        for(int i=1;i<=number;i++)
        {
            System.out.println("Enter the taxable amount of person "+ i);
            amount = in.nextInt();
            if(amount<=750)
            {
                tax=(1/100.0)*amount;
                System.out.println("Tax due is $: "+tax);
                if(max<tax)
                    max=tax;
            }
            else if(amount>751 &&amount<=2500)
            {
                tax=7.5+(2/100.0)*(amount-750);
                System.out.println("Tax due is $: "+tax);
                if(max<tax)
                    max=tax;
            }
            else if(amount>2550 && amount<=5000)
            {
                tax=82.5+(4/100.0)*(amount-2500);
                System.out.println("Tax due is $: "+tax);
                if(max<tax)
                    max=tax;
            }
            else if(amount>5000 && amount<=8000)
            {
                tax=142.5+(5/100.0)*(amount-5000);
                System.out.println("Tax due is $: "+tax);
                if(max<tax)
                    max=tax;
            }
            else
            {
                tax=230.00 + (6/100.0)*(amount-8000);
                System.out.println("Tax due is $: "+tax);
                if(max<tax)
                    max=tax;
            }
        }
        System.out.println("The maximum value of all taxes is $: "+max);
        in.close();
    }
}
