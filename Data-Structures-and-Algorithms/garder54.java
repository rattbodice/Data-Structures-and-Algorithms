import java.util.Scanner;
public class garder54 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] arrst = input.split(",");
        int[] arrint = Stto(arrst);

        for (int i=0 ; i< arrint[0] ; i++)
        {
            if (i!=0) System.out.print(",");
            System.out.print("[");
            for (int j=0; j<arrint[1]; j++)
            {
                if (j!=0) System.out.print(",");
                System.out.print(i*j);

            }
            System.out.print("]");
        }
        
    }
    public static int[] Stto(String[]x){
        int[] arr = new int[x.length];
        for (int i=0 ; i<arr.length ; i++)
        {
            arr[i] = Integer.parseInt(x[i]);
        }
        return arr;
    }
}
