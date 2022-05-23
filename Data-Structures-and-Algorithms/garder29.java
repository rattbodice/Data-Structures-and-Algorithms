import java.util.Scanner;
public class garder29 {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int input = sc.nextInt();
       String stinput = Integer.toString(input);
       int answer = 0,j=0;
       for (int i=stinput.length()-1 ; i>=0; i--)
       {
           char chinput = stinput.charAt(j);
           j++;
           if(chinput == '1')
           {
            double b = Math.pow(2,i); 
            answer += b;
           }
           else if(chinput == '0')
           {
             answer += 0;  
           }
            
       }
       System.out.println(answer);

    }
}
