import java.util.Scanner;
public class timesquare26 {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int input1 = sc.nextInt();
       int input2 = sc.nextInt();
       int input3 = sc.nextInt();
       int input4 = sc.nextInt();
       int[] arr = {input1,input2,input3,input4};
       int max = arr[0];
       int min = arr[0];
       for (int i=0 ; i<arr.length ; i++)
       {
           if (max<arr[i]) 
           {
              max = arr[i];
           }
           else if (min>arr[i]) 
           {
               min = arr[i];
           }
           
        }
        System.out.println("Min : "+min);
        System.out.println("Max : "+max);

    }
}
