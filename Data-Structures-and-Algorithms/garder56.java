import java.util.Scanner;
import java.util.Arrays;
public class garder56 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String in1 = sc.next();
        double in2 = sc.nextInt();
        double num = Math.ceil(in1.length()/in2) ;
        String[] data = new String[(int)num];
        int[] dataint = new int[data.length];  
    
        int a = 0;
        int b = 0;
        int in3 = (int)in2; 
        for (int i=0 ; i<data.length ; i++)
        {
            a=b;
            for (int j=a ; j<=in1.length()&&j<=in2 ; j++)
            {
                a=j;
            }
            data[i] = in1.substring(b,a);
            b=a;

            in2+=in3;
            dataint[i] = Integer.parseInt(data[i]);
        }
        int sum=0;
        for (int i=0 ; i<data.length ; i++)
        {
            if (i!=0) System.out.print(" ");
            System.out.print(dataint[i]);
            sum+=dataint[i];
        }
        System.out.println("\n"+sum);
    }
}
