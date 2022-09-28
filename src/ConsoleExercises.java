import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class ConsoleExercises {

    public static void main(String[] args) {

        double pi = 3.14159;
        System.out.printf("The value of pi is approximately %2f \n", pi);


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int userInput = scanner.nextInt();
        System.out.printf("You entered: %d\n", userInput);

        System.out.println("Enter 3 words");
        String firstWord = scanner.next(),
                secondWord = scanner.next(),
                thirdWord = scanner.next();

        System.out.printf("You Entered:%s %s %s\n", firstWord, secondWord, thirdWord);

        System.out.println("Enter a sentence");
        scanner.nextLine();
        String sentence = scanner.nextLine();
        System.out.printf("your sentence was: %s\n", sentence);

        System.out.println("enter length of virtual room");
        int length = parseInt(scanner.nextLine());

        System.out.println("enter width of virtual room");


           int   width = parseInt(scanner.nextLine());
        int area = length * width;
        int perimeter = (2 * length) + (2 * width);

        System.out.printf("area of room is: %d and perimeter is: %d", area, perimeter);



    }
}