import java.util.Random;
import java.util.Scanner;
public class ServerNameGenerator {




  public static   String[] adjectives ={
            "adorable",
            "busy",
            "calm",
            "bored",
            "nice",
           " rich",
           " real",
            "super",
           " successful",
            "nice"};

  public static   String[] nouns ={
            "Actor",
            "Gold",
            " Painting",
            "Airport",
            "Guitar",
            "Piano",
            "Ambulance",
            "Hair",
            "Pillow",
          "  Animal",
    };

public static String Random(String[] string){
  double random =Math.floor(Math.random()*string.length);
  return string[(int)random];
}


    public static void main(String[] args) {
        System.out.println("Are you ready for your server name?? [y/n]");
        Scanner sc = new Scanner(System.in);
        String response = sc.nextLine();
        if(response.equalsIgnoreCase("y") || response.equalsIgnoreCase("yes") ){
            System.out.println("Here is your server name: "+Random(adjectives)+"-"+ Random(nouns));
        } else if (response.equalsIgnoreCase("n") || response.equalsIgnoreCase("no") ) {
            System.out.println("OK");
            System.exit(0);
        }
    }




}
