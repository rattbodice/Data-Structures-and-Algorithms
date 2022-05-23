import java.util.Scanner;
public class totalchar20 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String word,wordsum="";
    while (true)
    {
        word = sc.nextLine();
        if (word.equals("stop")) break;
        wordsum += word;
    }
    System.out.println(wordsum.length());
    
    
    }
}
