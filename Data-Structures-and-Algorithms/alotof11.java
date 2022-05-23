import java.util.Scanner;
public class alotof11 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String wo = sc.nextLine();
    int answer=0;
    char word;
    for (int i=0 ; i<wo.length(); i++)
    {
        word = wo.charAt(i);    
        if (word == 'a' || word == 'A'){
            answer++;
        } 
    }
    System.out.println(answer);
    } 



} 
