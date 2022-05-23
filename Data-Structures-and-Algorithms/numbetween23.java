import java.util.Scanner;
public class numbetween23 {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int num1 = sc.nextInt();
       int num2 = sc.nextInt();

        if (num1<num2)
        {
            for (int i=num1 ; i<num2-1 ; i++)
            {
                System.out.print(i+1);
                if (i+1!=num2-1) System.out.print(',');

            }
       
        }
        else
        {
            for (int i=num2 ; i<num1-1 ; i++)
            {
               System.out.print(i+1);
               if (i+1!=num1-1) System.out.print(',');
   
            }  
        }

    }
}
