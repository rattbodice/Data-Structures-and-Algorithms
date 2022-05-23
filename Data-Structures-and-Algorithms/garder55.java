import java.util.Arrays;
import java.util.Scanner;
public class garder55 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int[] arr = count(input);
        int[] arr2 = num(arr);
        int[] countarr = countre(arr,arr2);
        
        for (int i=0 ; i<arr2.length ; i++)
        {
            if (i!=0) System.out.print(",");
            System.out.print("{"+arr2[i]+":"+countarr[i]+"}");
        }
        
    }
    public static int[] countre(int[] arr,int[] arr2){
        int[] numarr = new int[arr2.length];
        for (int i=0 ; i<arr2.length ; i++)
        {
            int count = 0;
            for (int j=0 ; j<arr.length ; j++)
            {
                if (arr2[i] == arr[j])
                {
                   count++;
                }
            }
            numarr[i] = count;
        }
        return numarr;
    }
    public static int[] count(String input){
        String[] arr = input.split(" ");
        Arrays.sort(arr);
        int[] arrint = new int[arr.length];
        for (int i=0 ; i<arr.length ; i++)
        {
            arrint[i] = Integer.parseInt(arr[i]);
        }
        return arrint;  
    
    
    }
    public static int[] num (int[] arr){
        int count=1;
        int check = arr[0];
        for (int i=0; i<arr.length ; i++)
        {
            if (arr[i] == check)
            {

            }
            else
            {
                check = arr[i];
                count++;
            }
        }

        int[] rearr = new int[count];
        rearr[0] = arr[0];
        int j=1,o=0;
        check = arr[0];
        while (j<rearr.length)
        {
            if (arr[o] == check)
            {
               o++;
            }
            else
            {
                check = arr[o];
                rearr[j] = arr[o];
                j++;
            }
        }
        Arrays.sort(rearr);
  
        return rearr;
    }


}
