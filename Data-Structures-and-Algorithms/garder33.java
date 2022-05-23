import java.util.Scanner;
public class garder33 {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       String input,answer="";
       while (true)
       {
            input = sc.nextLine();
            if (input.equals("*")) break;
            answer += input+" ";
       }
       String[] arr = answer.split(" ");

       if (arr.length%2==0)
       {
           System.out.println(arr[(arr.length/2)-1]);
           System.out.println(arr[(arr.length/2)]);
       }
       else
       {
           System.out.println(arr[(arr.length/2)]);
       }

    }
}
