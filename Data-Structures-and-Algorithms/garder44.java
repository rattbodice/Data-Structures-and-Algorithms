import java.util.Scanner;
public class garder44 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine(),answer = "false";
        String[] arr = input.split(",");
    
        for (int i=0 ; i<arr.length-2 ; i++)
        {
            if (arr[i].equals("1"))
            {
                if (arr[i+1].equals("2"))
                {
                   if (arr[i+2].equals("3"))
                   {
                      answer = "true";
                      break;
                   }
                   else
                   {
                       answer = "false";
                       break;
                   }
                }
                else
                {
                    answer = "false";
                    break;
                }
            }
            
        }
        System.out.println(answer);
   
   
   
    }
}
