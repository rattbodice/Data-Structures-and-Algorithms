import java.util.Scanner;
public class garder42 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] arr = input.split(",");

        for (int i=0; i<arr.length ; i++)
        {
            if ( arr[i].length()> 7)
            {
                System.out.print(arr[i]);
                System.out.println();
            }
        }
    
    
    }
}
