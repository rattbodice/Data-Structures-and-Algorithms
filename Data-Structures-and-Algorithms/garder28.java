import java.util.Scanner;
public class garder28 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        String answer = "";
        for (int i=2 ; i<input ; i++)
        {
            if (input%i==0)
            {
                answer = "N";
                break;
            }
            else if (input%2!=0)
            {
                answer = "Y";
            }
        }
        System.out.println(answer);


    }
}
