import java.util.Scanner;
public class maxvalue27 {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       String value = sc.nextLine();
       String[] arr = value.split(" ");
       int[] arrint = new int[arr.length];
       for (int i=0; i<arrint.length ; i++)
       {
           arrint[i] = Integer.parseInt(arr[i]);
       }
       int sum = arrint[0];
        if (arrint.length<=5)
        {
            for (int i=0; i<arrint.length ; i++)
            {
            if (sum<arrint[i])
            {
            sum = arrint[i];
            }
           
            }
            System.out.println(sum);
        }
        else 
        {
            System.out.println("max input");
        }
        
       
    
    
    }
}
