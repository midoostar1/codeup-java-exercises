package util;
import java.util.Scanner;
public class InputTest {

    public static void main(String[] args) {
        System.out.println("enter a string");
        Input.getString();
       // System.out.println("enter yes or no");
        Input.yesNo();
        System.out.println("enter a number between 10 and 20");
         Input.getInt(10,20);
        System.out.println("enter any number");
        Input.getInt();
        System.out.println("enter a number between 50.5 and 100.6");
        Input.getDouble(50.5,100.6);
        System.out.println("enter a number with 2 decimal places");
       Input.getDouble();
    }
}
