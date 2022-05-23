import java.util.Scanner;
public class quadrants25 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int y = sc.nextInt();

    if(x==0 && y==0)
    {
        System.out.println("0,y and x,0 are not valid inputs");
    }
    else if (x>0 && y>0 )
    {
        System.out.println("Quadrant I");
    }
    else if (x<0 && y>0 )
    {
        System.out.println("Quadrant II");
    }
    else if (x<0 && y<0 )
    {
        System.out.println("Quadrant III");
    }
    else if (x>0 && y<0 )
    {
        System.out.println("Quadrant IV");
    }
    
    }
}
