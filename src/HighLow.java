import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {
        System.out.println("i choosed a number between 1 and 100");
        System.out.println("Can u guess?");
        randomG();
    }

    static double random = Math.floor(Math.random() * 100 + 1);
    static int guessLeft = 10;

    public static void randomG() {
        Scanner sc = new Scanner(System.in);


        System.out.println("input your guess:");

        int userguess = sc.nextInt();
        if (userguess == (int) random) {
            System.out.println("congrats u won!!!!");
        } else if (userguess < (int) random) {
            System.out.println("wrong guess");
            System.out.printf("u have %d left\n", guessLeft - 1);
            System.out.println("go higher");
            guessLeft -= 1;
            randomG();

        } else if (userguess > (int) random) {
            System.out.println("wrong guess");
            System.out.printf("u have %d left\n", guessLeft - 1);
            System.out.println("go lower");
            guessLeft -= 1;
            randomG();

        }
    }
}
