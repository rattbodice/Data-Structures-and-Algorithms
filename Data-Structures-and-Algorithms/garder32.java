import java.util.Scanner;
public class garder32 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input,answer = "";

        while (true)
        {
            input = sc.nextLine();
            if (input.equals("*")) break;
            answer += input+" ";
        }
        String[] arr = answer.split(" ");

        for (int i=arr.length-1; i>=0 ; i--)
        {
            System.out.println(arr[i]);
        }
    }
}
