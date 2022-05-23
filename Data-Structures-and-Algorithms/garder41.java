import java.util.Scanner;
public class garder41 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] arr = input.split(",");

        for (int i=0; i<arr.length ; i++)
        {
            if ( arr[i].length()> 6)
            {
                System.out.print(arr[i]);
                if(i < input.length()) System.out.print(" ");
            }
        }
    }
}
