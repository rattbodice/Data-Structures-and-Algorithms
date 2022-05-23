import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;
public class garder36{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] arr = input.split(" ");
        String answer = "";
        int num = arr.length,l=0;
        int[] arrint = new int[num];

        for (int i=0 ; i<arr.length ; i++)
        {
            arrint[i] = Integer.parseInt(arr[i]);
        }
     
        for (int j=0 ; j<arrint.length ; j++)
        {
            if (j<arrint.length-1)
            {
                if(arrint[j]+1 != arrint[j+1])
                {
                    for (l=arrint[j] ; l<arrint[j+1] ; l++)
                    {
                        
                        if (l != arrint[j])answer += l;
                        if (l != arrint[j] && l<29) answer += " ";
                    }
                }
            }
            
        }
        for(int val=arrint[arrint.length-1] ; val <30 ; val++)
        {
            val++;
            answer += val;
            if (val<30) answer += " ";
        }
        System.out.println(answer);
    }
}
