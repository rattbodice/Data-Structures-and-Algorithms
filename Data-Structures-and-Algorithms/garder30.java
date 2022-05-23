import java.util.Scanner;
public class garder30 {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       String input = sc.nextLine();
       String answer = "";
       
       for (int i=0 ; i<input.length() ; i++)
       {
           if (i==0) answer += input.charAt(i);
           
           if (i>0)
           {
               if (input.charAt(i) == input.charAt(i-1))
               {

               }
               else
               {
                   if (i<input.length()) answer += ",";
                   answer+= input.charAt(i);
               }
           
            }
       
        
        }
        System.out.println(answer);
    
    
    }
}
