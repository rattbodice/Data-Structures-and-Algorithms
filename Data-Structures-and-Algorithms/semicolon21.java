import java.util.Scanner;
public class semicolon21 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String input = sc.nextLine();
    int result=0;

    for (int i=0; i<input.length(); i++)
    {
        if (input.charAt(i) == ';') result++;
    }
    System.out.println(result);




    }
}
