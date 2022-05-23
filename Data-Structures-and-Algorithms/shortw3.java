import java.util.Scanner;
public class shortw3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = "";
        String value = "";
        for (int i=0; i<5 ; i++)
        {
            String a = sc.nextLine();
            input += a+" "; 
        }
        String[] valueinput = input.split(" ");
        for (int j=0; j<valueinput.length ; j++)
        {
            if (valueinput[j].length() <=valueinput[0].length() && valueinput[j].length()<=valueinput[1].length() && valueinput[j].length()<=valueinput[2].length() && valueinput[j].length()<=valueinput[3].length() && valueinput[j].length()<=valueinput[4].length())
            {
                value = valueinput[j]; break;
            }
        }
        System.out.println(value);
    }
}
