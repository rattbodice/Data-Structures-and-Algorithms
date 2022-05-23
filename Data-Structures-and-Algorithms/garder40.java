import java.util.Scanner;
public class garder40 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine(),answer;
        int c =0,s=0;

        for (int i=0 ; i<input.length() ; i++)
        {
            if (input.charAt(i) == 'C')
            {
               c++;
            }
            else if (input.charAt(i) == 'S')
            {
               s++;
            }
        }
        
        if ( c == s)
        { 
           answer = "true";
        }
        else
        { 
          answer = "false";
        }
        System.out.println(answer);
    }
}
