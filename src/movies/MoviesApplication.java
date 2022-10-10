
package movies;

import java.util.Scanner;
import java.util.Objects;

import static movies.MoviesArray.findAll;
import static util.Input.getInt;
import static util.Input.getString;

public class MoviesApplication {

    public static void main(String[] args) {
        searchMovie();



    }

    public static void searchMovie() {
        Scanner sc = new Scanner(System.in);

        System.out.println("What would you like to do?");
        System.out.println(" 0 - exit");
        System.out.println(" 1 - view all movies");
        System.out.println(" 2 - view movies in the animated category");
        System.out.println(" 3 - view movies in the drama category");
        System.out.println(" 4 - view movies in the horror category");
        System.out.println(" 5 - view movies in the scifi category");

        System.out.println("  Enter your choice:");
        int input = getInt();
        switch (input) {
            case 0:
                System.exit(0);
                break;
            case 1:
                for (Movie movie : findAll()) {
                    System.out.println(movie.getName() + "-------" + movie.getCategory());
                }
                System.out.println("do you want to continue [y/n]");
String newInput = sc.nextLine();
                if(newInput.equalsIgnoreCase("y") || newInput.equalsIgnoreCase("yes")){

                    searchMovie();
                }else {System.exit(0);}


                break;


            case 2:
                for (Movie movie : findAll()) {
                    if (Objects.equals(movie.getCategory(), "animated")) {
                        System.out.println(movie.getName() + "-------" + movie.getCategory());
                    }
                }

                System.out.println("do you want to continue [y/n]");
                 newInput = sc.nextLine();

                if(newInput.equalsIgnoreCase("y") || newInput.equalsIgnoreCase("yes")){

                    searchMovie();
                }else {System.exit(0);}

                break;


            case 3:
                for (Movie movie : findAll()) {
                    if (Objects.equals(movie.getCategory(), "drama")) {
                        System.out.println(movie.getName() + "-------" + movie.getCategory());
                    }
                }

                System.out.println("do you want to continue [y/n]");
                 newInput = sc.nextLine();
                if(newInput.equalsIgnoreCase("y") || newInput.equalsIgnoreCase("yes")){

                    searchMovie();
                }else {System.exit(0);}

                break;


            case 4:
                for (Movie movie : findAll()) {
                    if (Objects.equals(movie.getCategory(), "horror")) {
                        System.out.println(movie.getName() + "-------" + movie.getCategory());
                    }

                }

                System.out.println("do you want to continue [y/n]");
                newInput = sc.nextLine();
                if(newInput.equalsIgnoreCase("y") || newInput.equalsIgnoreCase("yes")){

                    searchMovie();
                }else {System.exit(0);}

                break;

            case 5:
                for (Movie movie : findAll()) {
                    if (Objects.equals(movie.getCategory(), "scifi")) {
                        System.out.println(movie.getName() + "-------" + movie.getCategory());
                    }
                }

                System.out.println("do you want to continue [y/n]");
                 newInput = sc.nextLine();
                if(newInput.equalsIgnoreCase("y") || newInput.equalsIgnoreCase("yes")){

                    searchMovie();
                }else {System.exit(0);}

                break;

            default:
                searchMovie();

        }
    }







}
