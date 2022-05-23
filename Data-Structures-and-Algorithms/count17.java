import java.util.Scanner;
public class count17 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        char[] aeiou = {'a','e','i','o','u'};
        String wordans = "";
        int num=0;
        for (int i=0 ; i<word.length() ; i++)
        {
            for (int j=0 ; j<aeiou.length ; j++)
            {
                if (word.charAt(i) == aeiou[j]) num++;
            }
        }
        System.out.println(num);
    }
}
