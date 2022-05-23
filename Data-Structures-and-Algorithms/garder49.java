import java.util.Arrays;
import java.util.Scanner;
public class garder49 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String answer = sc.nextLine();
        String[] arr = answer.split(",");
        Arrays.sort(arr);
        
        for(int i = 0 ; i<arr.length ; i++)
        {
            System.out.print(arr[i]);
            if (i<arr.length-1) System.out.print(",");
        }
        
        
    }
}
