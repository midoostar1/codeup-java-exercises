import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {


        System.out.println(" talk to Bob");
        Scanner sc = new Scanner(System.in);

        boolean startover = true;
        do {


            String response = sc.nextLine();

            if (response.isEmpty()) {
                System.out.println("Bob: Fine. Be that way!");

            } else if (response.endsWith("!")) {
                System.out.println("Bob: Whoa, chill out!");

            } else if (response.endsWith("?")) {
                System.out.println("Bob: Sure");

            } else {
                System.out.println("Bob: Whatever");
            }
            System.out.println("do u want to keep talking");
            String userInput = sc.nextLine();
            if (userInput.equalsIgnoreCase("y")) {
                startover = true;
            } else if (userInput.equalsIgnoreCase("n")) {
                startover = false;
            }
        } while (startover);


    }
}
