import java.util.Scanner;
public class wordshort18 
{
    public static void main(String[] args)
    {
    Scanner sc = new Scanner(System.in);
    String input,value="";

    while (true)
   {
    input = sc.nextLine();
    if (input.equals("quit"))
    {
        break;
    }
    value += input+" ";
   } 
    String[] arr = value.split(" ");
    for (int i =0 ; i<arr.length ; i++)
    {
        if (i<arr.length)
        {
            System.out.print(arr[i].charAt(0));
            System.out.print(arr[i].charAt(arr.length-1));
        }
        System.out.println();
    }
    
    
    
    
    
    
    }
}
