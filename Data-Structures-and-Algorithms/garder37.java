import java.util.Arrays;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;
public class garder37 {
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
