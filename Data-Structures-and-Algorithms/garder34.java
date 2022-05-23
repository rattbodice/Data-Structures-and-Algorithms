import java.util.Scanner;
public class garder34 {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       String num = sc.nextLine();
       String[] arr = num.split(" ");

       for (int i=arr.length-1 ; i>=0 ; i--)
       {
           System.out.print(arr[i]);
           if (i!=0) System.out.print(" ");
       }
       

    }
}
    