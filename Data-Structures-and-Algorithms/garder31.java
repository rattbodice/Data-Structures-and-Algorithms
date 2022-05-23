import java.util.Scanner;
public class garder31 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String sumst = "",input;
        while (true)
        {
            input = sc.nextLine();
            if (input.equals("*")) break;
            sumst += input+" ";
        }
        String[] arr = sumst.split(" ");
        
        for (int i=0 ; i<arr.length ; i++)
        {
            System.out.print(arr[i]);
            if (i<arr.length-1) System.out.print(" ");
        }
        
    
    }
}
