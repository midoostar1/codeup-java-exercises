import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

        int i = 5;
        while (i <= 15) {
            System.out.println(i);
            i++;
        }

//*************************************************
        int l = 0;
        do {
            System.out.println(l);
            l += 2;
        } while (l <= 100);

//****************************************************
     /*   int j = 100;
        do {
            System.out.println(j);
            j -= 5;
        } while (j >= -10);


     //******************************* *************

        long p = 2;
        do {
            System.out.println(p);
            p *= p;
        } while (p <= 1000000);
*/

        for (int j = 100; j >= -10; j -= 5) {
            System.out.println(j);

        }

        for (long p = 2; p <= 1000000; p *= p) {
            System.out.println(p);
        }

        //Fizzbuzz
        for (int t = 1; t <= 100; t++) {
            if (t % 15 == 0) {
                System.out.println("FizzBuzz");
            } else if (t % 3 == 0) {
                System.out.println("Fizz");
            } else if (t % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(t);
            }
        }


        Scanner sc = new Scanner(System.in);
        System.out.println("input a number");
        int input = sc.nextInt();


        System.out.println("here is your table");
        System.out.println("Number | Squared | Cubed");
        System.out.println("-------------------------");
        for (int n = 1; n <= input; n++) {
            System.out.println(n + "    |    " + (int) Math.pow(n, 2) + "     |    " + (int) Math.pow(n, 3));
        }

        System.out.println("enter grade between 1 to 100");
        int grade = sc.nextInt();
        if (grade <= 100 && grade >= 88) {
            System.out.println("A");
        } else if (grade <= 87 && grade >= 80) {
            System.out.println("B");
        } else if (grade <= 79 && grade >= 67) {
            System.out.println("C");
        } else if (grade <= 66 && grade >= 60) {
            System.out.println("D");
        } else if (grade <= 59 && grade >= 0) {
            System.out.println("F");
        }
    }

}
