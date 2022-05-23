import java.util.Scanner;
public class garder47 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double input1 = sc.nextDouble();
        double input2 = sc.nextDouble();
        double a= 0,b=0;


        if (input1 < input2 )
        {
           a = input1;
           b = input2;
           a = Math.floor(a);
           b = Math.ceil(b);
           
        }
        else if (input2 < input1)
        {
            a = input2;
            b = input1;
            a = Math.floor(a);
            b = Math.ceil(b);
        }

        if (input1 != input2)
        {
        
        for (double i=a; i<b ; i++)
        {
            if (i!=a) System.out.print((int)i);
            if (i!=b-1 && i!=a) System.out.print(" ");
        
        
        }
    
        }
        else
        {
            System.out.println("No Answer!!.");
        }
    }
}
