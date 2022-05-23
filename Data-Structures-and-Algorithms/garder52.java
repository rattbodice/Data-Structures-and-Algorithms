import java.util.Scanner;
import java.util.Arrays;
public class garder52 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        String[] arra = a.split(",");
        String[] arrb = b.split(",");
        Arrays.sort(arra);
        Arrays.sort(arrb);
        int k=0;
        String sum="";
        if (arra.length < arrb.length)
        {
        for (int i=0 ; i<arra.length ; i++)
        {
            for (int j=0 ; j<arrb.length ; j++)
            {
                if (arra[i].equals(arrb[j]))
                {
                    sum += arra[i]+",";
                }
            }
        }
        }
        else
        {
        for (int i=0 ; i<arrb.length ; i++)
            {
                for (int j=0 ; j<arra.length ; j++)
                {
                    if (arrb[i].equals(arra[j]))
                    {
                        sum += arrb[i]+",";
                    }
                }
        }    
        }
        String[] onearr = sum.split(",");

        for (int i=0 ; i<onearr.length-1 ;i++)
        {
            for (int j=i+1 ; j<onearr.length ; j++)
            {
                if (onearr[i].equals(onearr[j]))
                {
                   onearr[j] = "0";
                }
            }
        }
    
        for (int i=0 ; i<onearr.length ; i++)
        {
            if (!onearr[i].equals("0"))
            {
                if (i!=0) System.out.print(",");
                System.out.print(onearr[i]);
            }
        }
    }
}
