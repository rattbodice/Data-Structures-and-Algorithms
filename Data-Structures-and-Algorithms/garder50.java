import java.util.Scanner;
import java.util.StringTokenizer;
public class garder50 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = "";
        
        while (true)
        {
            String inloop = sc.nextLine();
            if (inloop.equals("***"))
            {
                break;
            }
            input += inloop+" ";
        }
        int count = wordcount(input);
        int countmark = mark(input);
        if (count == 1)
        {
            System.out.println(count+" word");
        }
        else
        {
            System.out.println(count+" words");
        }
        if (countmark == 1)
        {
            System.out.println(countmark+" punctuation mark");
        }
        else
        {
            System.out.println(countmark+" punctuation marks");
        }
        
    
    }
    private static int wordcount(String x){
        int j=0;
        switch (j)
        {
            case 0 :
            x = x.replace(",","");
            case 1 :
            x = x.replace(".","");
            case 2 :
            x = x.replace("?","");
            case 3 :
            x = x.replace("!","");
            
        }
        
        int countoftokens = new StringTokenizer(x).countTokens();
      return countoftokens;
    }
    private static int mark(String x){
        String xreplace = x.replace(" ","");
        int count=0;
        for (int i=0 ; i<xreplace.length(); i++)
        {
            int j=0;
            String check = Character.toString(xreplace.charAt(i));
            switch (j)
            {
                case 0 :
                if (check.equals(",")) 
                {
                count++;
                break;
                }
                case 1 :
                if (check.equals(".")) 
                {
                    count++;
                    break;
                }
                case 2 :
                if (check.equals("?")) 
                {
                    count++;
                    break;
                }
                case 3 :
                if (check.equals(".")) 
                {
                    count++;
                    break;
                }
                case 4 :
                if (check.equals("!"))
                {
                    count++;
                    break;
                }
            }

        }
        return count;
    }   


}
