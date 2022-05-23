import java.util.Scanner;
public class Abbreviator19 
{
    public static void main(String[] args)
    {
    Scanner sc = new Scanner(System.in);
    String word,answer="";

    while (true)
    {
        word = sc.nextLine();
        if (word.equals("outloop")) break;
        answer += word+" ";
    }
    String[] arr = answer.split(" ");
    for(int i=0 ; i<arr.length ; i++)
    {
        if (i<arr.length)
        {
            System.out.print(arr[i].charAt(0));
        }
        System.out.print(".");
    }
    
    
    }
}
