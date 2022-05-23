import java.util.Scanner;
public class selectchar14 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int n = sc.nextInt();

        if (n<=input.length()) System.out.println(input.charAt(n-1));
        if (n>input.length()) System.out.println("error.");


    }
}
