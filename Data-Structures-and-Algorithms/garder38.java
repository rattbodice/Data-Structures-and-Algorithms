import java.util.Scanner;
public class garder38 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine(),inputreverse = "",answer = "";
        
        for (int i=input.length()-1 ; i>=0 ; i--)
        {
            inputreverse += input.charAt(i);
        }
    
        for (int i=0 ; i<input.length() ; i++)
        {
            if (input.equals(inputreverse))
            { 
               answer = "true";
            }
            else
            {
                answer = "false";
            }
        }
        System.out.println(answer);
    
    }
}
