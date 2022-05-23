import java.util.Scanner;
public class Q5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input ="";

        while (true)
        {
            String key = sc.nextLine();
            if (key.equals("-")) break;
            input += key+" ";
        }
        String[] input1 = input.split(" ");
        int[] numin1 = new int[input1.length];
        
        int sum = 0,sumtonum=0,j=0;
       
        for (int i=0 ; i<input1.length ; i++)
        {
            String check = input1[i];
            sumtonum = 0;
            for (int o=0 ; o<check.length() ; o++)
            {
                switch (j)
                {
                case 0:
                if (check.charAt(o) == 'A') 
                {
                    sum+=11;
                    sumtonum+=11;
                }
                case 1:
                if (check.charAt(o) == 'T' || check.charAt(o) == 'J' || check.charAt(o) == 'Q' || check.charAt(o) == 'K')
                {
                    sum+=10;
                    sumtonum+=10;
                }
                case 2:
                if (check.charAt(o) == '2' )
                {
                    sum+=2;
                    sumtonum+=2;
                }
                case 3:
                if (check.charAt(o) == '3')
                {
                    sum+=3;
                    sumtonum+=3;
                }
                case 4:
                if (check.charAt(o) == '4')
                {
                    sum+=4;
                    sumtonum+=4;
                }
                case 5:
                if (check.charAt(o) == '5')
                {
                    sum+=5;
                    sumtonum+=5;
                }
                case 6:
                if (check.charAt(o) == '6')
                {
                    sum+=6;
                    sumtonum+=6;
                }
                case 7:
                if (check.charAt(o) == '7')
                {
                    sum+=7;
                    sumtonum+=7;
                }
                case 8:
                if (check.charAt(o) == '8')
                {
                    sum+=8;
                    sumtonum+=8;
                }
                case 9:
                if (check.charAt(o) == '9')
                {
                    sum+=9;
                    sumtonum+=9;
                }
                }
            }
            numin1[i] = sumtonum;
        }
        
        
        input ="";
        while (true)
        {
            String key = sc.nextLine();
            if (key.equals("-")) break;
            input += key+" ";
        }
        String[] input2 = input.split(" ");
        int[] numin2 = new int[input2.length];
        int sum2 = 0;
       
        for (int i=0 ; i<input2.length ; i++)
        {
            String check = input2[i];
            sumtonum = 0;
            for (int o=0 ; o<check.length() ; o++)
            {
                switch (j)
                {
                case 0:
                if (check.charAt(o) == 'A') 
                {
                    sum+=11;
                    sumtonum+=11;
                }
                case 1:
                if (check.charAt(o) == 'T' || check.charAt(o) == 'J' || check.charAt(o) == 'Q' || check.charAt(o) == 'K')
                {
                    sum+=10;
                    sumtonum+=10;
                }
                case 2:
                if (check.charAt(o) == '2' )
                {
                    sum+=2;
                    sumtonum+=2;
                }
                case 3:
                if (check.charAt(o) == '3')
                {
                    sum+=3;
                    sumtonum+=3;
                }
                case 4:
                if (check.charAt(o) == '4')
                {
                    sum+=4;
                    sumtonum+=4;
                }
                case 5:
                if (check.charAt(o) == '5')
                {
                    sum+=5;
                    sumtonum+=5;
                }
                case 6:
                if (check.charAt(o) == '6')
                {
                    sum+=6;
                    sumtonum+=6;
                }
                case 7:
                if (check.charAt(o) == '7')
                {
                    sum+=7;
                    sumtonum+=7;
                }
                case 8:
                if (check.charAt(o) == '8')
                {
                    sum+=8;
                    sumtonum+=8;
                }
                case 9:
                if (check.charAt(o) == '9')
                {
                    sum+=9;
                    sumtonum+=9;
                }
                }
            }
            numin2[i] = sumtonum;
        }
    
        findhigh1(numin1);
        findhigh2(numin2);
        int valuehi1 = checkvaluehigh1(input1,findhigh1(numin1));
        int valuehi2 = checkvaluehigh2(input2,findhigh2(numin2));
    
        if (sum == sum2)
        {
           if (valuehi1 > valuehi2)
           {
               System.out.println("1");
           }
           else
           {
               System.out.println("2");
           }
        }
        else if (sum > sum2)
        {
            System.out.println("1");
        }
        else 
        {
            System.out.println("2");
        }
    
    }

    public static int findhigh1(int[] num){
        int answer = 0;
        int a=0;
        for (int i=0 ; i<num.length ;i++)
        {
            if (num[0] < num[i])
            {
                num[0] = num[i];               
                answer = num[0];
                a=i;
            }
        }

        return a;
    }

    public static int findhigh2(int[] num){
        int answer = 0;
        int a=0;
        for (int i=0 ; i<num.length ;i++)
        {
            if (num[0] < num[i])
            {
                num[0] = num[i];               
                answer = num[0];
                a=i;
            }
        }

        return a;
    }


    public static int checkvaluehigh1(String[] input ,int numhigh ){
        String check = input[numhigh];
        int answer = 0;
        for (int i=0 ; i<check.length() ; i++)
        {
            int j=0;
            switch (j)
            {
            case 0:
            if (check.charAt(i) == 'A') answer+=11;
            case 1:
            if (check.charAt(i) == 'T' || check.charAt(i) == 'J' || check.charAt(i) == 'Q' || check.charAt(i) == 'K') answer+=10;
            case 2:
            if (check.charAt(i) == '2' ) answer+=2;
            case 3:
            if (check.charAt(i) == '3') answer+=3;
            case 4:
            if (check.charAt(i) == '4') answer+=4;
            case 5:
            if (check.charAt(i) == '5') answer+=5;
            case 6:
            if (check.charAt(i) == '6') answer+=6;
            case 7:
            if (check.charAt(i) == '7') answer+=7;
            case 8:
            if (check.charAt(i) == '8') answer+=8;
            case 9:
            if (check.charAt(i) == '9') answer+=9;
            case 10:
            if (check.charAt(i) == 'C') answer+='C';
            case 11:
            if (check.charAt(i) == 'D') answer+='D';
            case 12:
            if (check.charAt(i) == 'H') answer+='H';
            case 13:
            if (check.charAt(i) == 'S') answer+='S';
            }
        }
        return answer;
    }      

    public static int checkvaluehigh2(String[] input ,int numhigh ){
        String check = input[numhigh];
        int answer = 0;
        for (int i=0 ; i<check.length() ; i++)
        {
            int j=0;
            switch (j)
            {
            case 0:
            if (check.charAt(i) == 'A') answer+=11;
            case 1:
            if (check.charAt(i) == 'T' || check.charAt(i) == 'J' || check.charAt(i) == 'Q' || check.charAt(i) == 'K') answer+=10;
            case 2:
            if (check.charAt(i) == '2' ) answer+=2;
            case 3:
            if (check.charAt(i) == '3') answer+=3;
            case 4:
            if (check.charAt(i) == '4') answer+=4;
            case 5:
            if (check.charAt(i) == '5') answer+=5;
            case 6:
            if (check.charAt(i) == '6') answer+=6;
            case 7:
            if (check.charAt(i) == '7') answer+=7;
            case 8:
            if (check.charAt(i) == '8') answer+=8;
            case 9:
            if (check.charAt(i) == '9') answer+=9;
            case 10:
            if (check.charAt(i) == 'C') answer+='C';
            case 11:
            if (check.charAt(i) == 'D') answer+='D';
            case 12:
            if (check.charAt(i) == 'H') answer+='H';
            case 13:
            if (check.charAt(i) == 'S') answer+='S';
            }
        }
        return answer;
    }      

}
