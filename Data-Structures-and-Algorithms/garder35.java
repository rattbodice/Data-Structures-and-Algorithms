import java.util.Scanner;
public class garder35 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] arr = input.split(" ");
        int valuearr = arr.length;
        int[] arrint = new int[valuearr];
        String answer = "";

        for (int i=0 ; i<arr.length ; i++)
        {
            arrint[i] = Integer.parseInt(arr[i]);
        }
        
        for (int j=0 ; j<arrint.length ; j++)
        {
            if (arrint[j] < 7)
            {
                answer += arrint[j];
                if (j!=arrint.length-1) answer += " ";
            }
        }
        System.out.println(answer);
    }
}
