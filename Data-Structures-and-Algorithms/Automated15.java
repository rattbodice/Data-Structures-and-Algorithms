import java.util.Scanner;
public class Automated15 {
    public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int p20=0,p10=0,p5=0,p2=0,p1=0;
    int num = sc.nextInt();
    int num2 = sc.nextInt();
    int value = num2-num;
    
    while(value>=20){
        value-=20;
        p20++;
        if (value<20) break;
    }
    while(value>=10){
        value-=10;
        p10++;
        if (value<10) break;
    }   
    while(value>=5){
        value-=5;
        p5++;
        if (value<5)break;
    }
    while(value>=2){
        value-=2;
        p2++;
        if (value<2) break;
    }
    while(value>=1){
        value-=1;
        p1++;
        if (value<1) break;
    }
    System.out.println(p20+" "+p10+" "+p5+" "+p2+" "+p1);

    }
}
