import java.util.Scanner;
public class garder45 {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       String input = sc.nextLine();
       String[] arr = input.split(",");
       int[] arrint = new int[arr.length];
       
       for (int i =0 ; i<arr.length ; i++)
       {
           arrint[i] = Integer.parseInt(arr[i]);
       }
    
       for (int i=0 ; i<arrint.length ; i++)
       {
           if (arrint[i]%2==0 && arrint[i]!=0)
           {
              arrint[i] += 1;
           }
           else if (arrint[i]%2!=0 && arrint[i]!=0)
           {
              arrint[i] -=1;
           }
       }
    
       for (int i=0 ; i<arrint.length ; i++)
       {
           System.out.print(arrint[i]);
           if (i<arrint.length-1) System.out.print(",");
       }
       
    }
}
