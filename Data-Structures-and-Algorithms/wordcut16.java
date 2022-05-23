import java.util.Scanner;
public class wordcut16 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String word,answer = "";
          while(true){
              word = sc.nextLine();
              if(word.equals("quit")) break;
              answer += word+" ";
          }
          String[] answerar = answer.split(" ");
          for (int i=0; i<answerar.length ; i++)
          {
            for (int j=1; j<4 ; j++)
            {  
                System.out.print(answerar[i].charAt(j));
            }
            System.out.println();  
          }
    }
}
