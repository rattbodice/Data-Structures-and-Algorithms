import java.util.Scanner;
class Test2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        try{
            while(n!=0){
                System.out.println(n);
                n = sc.nextInt();
            }
        }catch(java.util.NoSuchElementException e){
            System.out.println("End of Data");
        }
	}
}