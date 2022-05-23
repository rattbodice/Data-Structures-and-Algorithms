import java.util.Scanner;

public class planetnaem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String first = Character.toString(input.charAt(0)).toUpperCase();
        String inputval = input.toLowerCase().substring(1);
        String answer = first + inputval;

        if (answer.equals("Mercury")) {
            System.out.println("Mercury is the 1st planet from the Sun.");
        } else if (answer.equals("Venus")) {
            System.out.println("Venus is the 2nd planet from the Sun.");
        } else if (answer.equals("Earth")) {
            System.out.println("Earth is the 3rd planet from the Sun.");
        } else if (answer.equals("Mars")) {
            System.out.println("Mars is the 4th planet from the Sun.");
        } else if (answer.equals("Jupiter")) {
            System.out.println("Jupiter is the 4th planet from the Sun.");
        } else if (answer.equals("Jupiter")) {
            System.out.println("Jupiter is the 5th planet from the Sun.");
        } else if (answer.equals("Saturn")) {
            System.out.println("Saturn is the 6th planet from the Sun.");
        } else if (answer.equals("Uranus")) {
            System.out.println("Uranus is the 7th planet from the Sun.");
        } else if (answer.equals("Neptune")) {
            System.out.println("Neptune is the 8th planet from the Sun.");
        }
    }
}
