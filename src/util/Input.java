package util;

import java.util.Scanner;

public class Input {
    private static Scanner scanner = new Scanner(System.in);

public static String getString(){
      return scanner.nextLine();
    }

   public static boolean yesNo(){
    String userInput = scanner.nextLine();
        return userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes");
    }

 public static int getInt(int min, int max){
     System.out.println("enter a number within the range");
        int num = scanner.nextInt();
        if(num < min || num > max) {
            getInt(min, max);
        }
        return num;
    }

   public static int getInt(){
    return scanner.nextInt();
    }

  public static double getDouble(double min, double max){
      System.out.println("enter a number within the range");
      double num = scanner.nextDouble();
            if(num < min || num > max) {
                getDouble(min, max);
            }
            return num;
    }
   public static double getDouble(){
    return scanner.nextDouble();
    }
}