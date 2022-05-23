import java.util.Scanner;
public class garder39{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine(),answer ="";
        String[] arr = input.split(" ");
        String compare1 = arr[0].toUpperCase(),compare2 = arr[1].toUpperCase();

        if (compare1.equals(compare2))
        {
           answer = "same";
        }
        else
        {
            answer = "different";
        }
        System.out.println(answer);
    
    
    }
}
