import java.util.Scanner;
public class garder43 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String answer ="";
        String[] arr = input.split(",");

        for (int i=1 ; i<arr.length ; i++)
        {
            if (arr[i].equals(arr[0]))
            {
               answer = "true";
            }
            else
            {
                answer = "false";
                break;
            }
        }
        System.out.println(answer);
    
    
    }
}
