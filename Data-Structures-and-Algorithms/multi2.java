import java.util.Scanner;
public class multi2 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    double x = sc.nextDouble();
    double y = sc.nextDouble();
    double value = x*y;
    
    System.out.print(x+" * "+y+" = "+String.format("%.2f", value));
    
    }
}
