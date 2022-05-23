import java.util.Scanner;
public class doubled8 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int i=0,value = 1;
        int x = sc.nextInt();
    
        do{
            if (i<=x)  value += value;
            i++;
            
        }while (i!=x-1);
        System.out.println(value);
    }
}
