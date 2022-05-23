import java.util.Scanner;
public class garder48 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String input1 = sc.nextLine()+sc.nextLine();
        String inpub = sc.nextLine();
        String suminput = input1+inpub;
        suminput = suminput.replace(" ","");
        int[] arrint = new int[suminput.length()];
        int j=0,k=0;
        
        for (int i=0 ; i<arrint.length ; i++)
        {
            String toarrays = Character.toString(suminput.charAt(i));
            arrint[i] = Integer.parseInt(toarrays);
        }
    
        for (int i=0 ; i<num ; i++)
        {
            if (i != 0) j+=2;
            System.out.print("["+arrint[j]+"]");
            if (i==num-1)
            {
                System.out.print(" + ");
            }
            else
            {
                System.out.print("   ");
            }
            k=j+1;
            System.out.print("["+arrint[k]+"]");
            if (i==num-1)
            {
                System.out.print(" = ");
            }
            else
            {
                System.out.print("   ");
            }
            System.out.print("["+(arrint[j]+arrint[k])+"]");
            System.out.println();
        
        }
    
    }
}
