import java.util.Scanner;
public class garder46 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String answer = "";
        while (true)
        {
            String input = sc.nextLine();
            if (input.equals("bye")) break;
            answer += input+",";
        }
        String[] arr = answer.split(",");
       
        for (int i=0 ; i<arr.length ; i++)
        {
            answer = "";
            for (int a = 101 ; a<119 ; a++)
            {
                String check = Integer.toString(a);
                if (arr[i].contains(check))
                {
                    answer = "floor 1";
                    break; 
                }
            }
            
            for (int a = 201 ; a<219 ; a++)
            {
                String check = Integer.toString(a);
                if (arr[i].contains(check))
                {
                    answer = "floor 2";
                    break;   
                }
            }

            for (int a = 301 ; a<319 ; a++)
            {
                String check = Integer.toString(a);
                if (arr[i].contains(check))
                {
                    answer = "floor 3";
                    break;      
                }
            }

            for (int a = 401 ; a<419 ; a++)
            {
                String check = Integer.toString(a);
                if (arr[i].contains(check))
                {
                    answer = "floor 4";
                    break;      
                }
            }
           
            for (int a = 501 ; a<519 ; a++)
            {
                String check = Integer.toString(a);
                if (arr[i].contains(check))
                {
                    answer = "floor 5";
                    break;  
                }
                
            }
            if (answer.equals("")) answer = "Invalid room";
            System.out.println(answer);  
            
        }
        
    
    
    
    
    }
}
