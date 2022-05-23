import java.util.Scanner;
public class divide {
    public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt(),value;
      
        for (int i = 1 ; i<=m ; i++)
        {
            value = m*i;
            if (value>n)
            {
               break;    
            }
            if (value%m==0)
            {
               System.out.println(value);
            }
            
        }


    }
}
