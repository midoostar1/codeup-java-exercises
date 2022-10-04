import java.util.Scanner;

public class methodExercises {

    public static void main(String[] args) {
        System.out.println(Addition(20, 40));
        System.out.println(Subtraction(60, 40));
        System.out.println(Multiplication(20, 40));
        System.out.println(Division(20, 0));
        System.out.println(Modulus(20, 6));
//        System.out.println(Multiply2(20,6));
        getInterger();
        getFactorial();
Dice();
    }

    public static int Addition(int num1, int num2) {
        return num1 + num2;
    }

    public static int Subtraction(int num1, int num2) {
        return num1 - num2;
    }

    public static int Multiplication(int num1, int num2) {
        return num1 * num2;
    }

    public static double Division(double num1, double num2) {
        return num1 / num2;
    }

    public static int Modulus(int num1, int num2) {
        return num1 % num2;
    }

    // public static int Multiply2(int num1,int num2){}

    public static void getInterger() {

        System.out.println("input a number between 1 and 5");
        Scanner sc = new Scanner(System.in);
        int chosenNum = sc.nextInt();
        if (chosenNum >= 1 && chosenNum <= 5) {
            System.out.printf("You Entered: %d\n", chosenNum);
        } else {
            System.out.println("invalid input");
            getInterger();
        }
        sc.nextLine();
    }

    public static void getFactorial() {
        Scanner sc2 = new Scanner(System.in);
        System.out.println(" enter an integer from 1 to 10");
        int userInput = sc2.nextInt();
        sc2.nextLine();

        if (userInput >= 1 && userInput <= 10) {
            long fact = 1;
            for (int i = 2; i <= userInput; i++) {
                fact = fact * i;
                System.out.println(fact);

            }

        } else {
            System.out.println("invalid input");
            getFactorial();
        }

       System.out.println("do u want to continue?[y/n]");

       String userResponse = sc2.nextLine();
       if (userResponse.equalsIgnoreCase("n") || userResponse.equalsIgnoreCase("no")) {
           sc2.nextLine();

       } else if (userResponse.equalsIgnoreCase("y") || userResponse.equalsIgnoreCase("yes")) {
         getFactorial();
       }
    }


    public static void Dice() {
        Scanner sm = new Scanner(System.in);
        System.out.println("enter the number of sides for a pair of dice");

        int sides = sm.nextInt();
sm.nextLine();

        System.out.println("ready to roll dice?[y/n]");
        double random = Math.floor(Math.random() * sides + 1);
        double random2 = Math.floor(Math.random() * sides + 1);
        String response = sm.nextLine();
        if(response.equalsIgnoreCase("n") || response.equalsIgnoreCase("no")){
            Dice();

        }else if(response.equalsIgnoreCase("y") || response.equalsIgnoreCase("yes")) {


        System.out.println("first roll: "+ (int)random);
            System.out.println("first roll: "+ (int)random2);
        }


        }

    }







