import java.util.Scanner;
public class factorial {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    
    for (int i=n; i>=1 ; i--)
    {
        if (i==n) System.out.print(n+"! = ");
        System.out.print(i+" * ");

    }
    System.out.print("= "+factorial(n));
    }
    
    public static int factorial(int n){
    int value =1;
    for (int i=n; i>=1 ; i-- )
    {
        value *= i; 
    }
    return value;

    }
}
