import java.util.Scanner;

public class ageofvenus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        double ageofvenus = (age * 365.25) / 224.70;

        System.out.println(String.format("%.3f", ageofvenus));

    }
}
