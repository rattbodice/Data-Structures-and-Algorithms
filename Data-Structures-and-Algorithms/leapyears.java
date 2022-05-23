import java.util.Scanner;
public class leapyears {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double number = sc.nextDouble();
        boolean answer;
        if (number == 4)
        {
            answer = true;
        }
        else
        {
            answer = false;
        }
        System.out.println(answer);




    }
}
