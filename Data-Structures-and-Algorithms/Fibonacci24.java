import java.util.Scanner;
public class Fibonacci24 {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int i = sc.nextInt();
       int sum=1,a=1,b=1,c=1;
       for (int j=1 ; j<=i ; j++)
       {
           if (j<=2) System.out.print(1);
           if (j>2)
           {
               sum = b+a;
               a=b; 
               b=sum; 
               System.out.print(sum);
           }
           if (j<i) System.out.print(" ");
                
    }


    }
}
