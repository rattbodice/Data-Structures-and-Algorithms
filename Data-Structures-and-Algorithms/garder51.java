import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;
public class garder51 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] arr = input.split(",");
        int [] arrint = new int[arr.length];
        
        for (int i=0 ; i<arr.length ; i++)
        {
            arrint[i] = Integer.parseInt(arr[i]);
        }
        
        for (int i=0 ; i<arrint.length ; i++)
        {
            for (int j=i+1 ; j<arrint.length-1 ; j++)
            {
                if (arrint[i] == arrint[j])
                {
                    arrint[j] =0;
                }
            }
        }
        
        for (int i=0 ; i<arrint.length ; i++)
        {
            if (arrint[i] != 0)
            {
                if (i!=0) System.out.print(",");
                System.out.print(arrint[i]);
            }
        }
    
    }
}
