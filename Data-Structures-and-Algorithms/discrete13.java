import java.util.Scanner;
public class discrete13 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt(),value=0,sum=0;
    for (int i=1 ; i<=n ; i++)
    {
        if (1 <= n && n < 100)
        {
        value = n*(n+1)*(2*+n+1)/6; 
        
        }
        else
        {
            System.out.println("Press input number 1-99");
            break;
        }
    }
    System.out.println(value);
    
    }
}
