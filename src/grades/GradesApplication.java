package grades;

import util.Input;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {
    public static void main(String[] args) {


        HashMap<String, Student> student = new HashMap<>();

        Student mia = new Student("Mia");
        mia.addGrade(20);
        mia.addGrade(40);
        mia.addGrade(10);

        Student anthony = new Student("Anthony");
        anthony.addGrade(40);
        anthony.addGrade(20);
        anthony.addGrade(10);

        Student mido = new Student("Amida");
        mido.addGrade(20);
        mido.addGrade(10);
        mido.addGrade(30);

        student.put("mia@codeup.com", mia);
        student.put("anthony@codeup.com", anthony);
        student.put("midoostar1", mido);


        System.out.println("Welcome!");
        System.out.println("Here are the GitHub usernames of our students:");
        System.out.println(student.keySet());


        Scanner sc = new Scanner(System.in);
        boolean Continue = true;
        do {
            System.out.println("What student would you like to see more information on?");
            String choice = Input.getString();
            if (student.containsKey(choice)) {
                Student val = student.get(choice);
                System.out.println(val.getName() + "---" + val.getGradeAverage());
                System.out.println("Would you like to see another student? [y/n]");

            } else {
                System.out.println("Sorry, no student found with the GitHub username of" + choice);
                String response = sc.nextLine();
                if (response.equalsIgnoreCase("no") || response.equalsIgnoreCase("n")) {
                    Continue =false;

                }


            }
        } while (Continue);
    }
}