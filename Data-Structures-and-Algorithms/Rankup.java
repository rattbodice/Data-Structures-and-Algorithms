import java.util.Scanner;
import java.util.StringTokenizer;
public class Rankup {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String sum = "";
        while (true)
        {
            String input = sc.nextLine();
            if (input.equals("***")) break;
            sum += input+" ";
        }
        word (sum);
        mark (sum);
        
        if (word(sum) == 1)
        {
           System.out.println(word(sum) + " word");
        }
        else
        {
            System.out.println(word(sum) + " word");
        }
        if (mark (sum) == 1)
        {
            System.out.println(mark(sum)+ " punctuation mark");
        }
        else
        {
            System.out.println(mark(sum)+ " punctuation marks");
        }
    }
    public static int word(String x){
        int j=0;    
        x.replaceAll("\\p{Punct}","");
        x.replaceAll(" ","");
        StringTokenizer answer = new StringTokenizer(x);
        int count = answer.countTokens();
        return count;
    }
    
    public static int mark(String x){
        int count = 0;
        for (int i =0 ; i< x.length() ; i++)
        {
            int j=0;
            switch (j)
            {
                case 0 :
                if (x.charAt(i) == ',') count++;
                case 1 :
                if (x.charAt(i) == '.') count++;
                case 2 :
                if (x.charAt(i) == '?') count++;
                case 3 :
                if (x.charAt(i) == '!') count++;
            }
        }
        return count;

    }

}
