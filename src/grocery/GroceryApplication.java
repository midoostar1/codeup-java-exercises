package grocery;


import java.util.Scanner;
import util.Input;

import java.util.ArrayList;
import java.util.HashMap;

public class GroceryApplication {

    public static void main(String[] args) {
        ArrayList<String> categories = new ArrayList<String>();
        categories.add("Beverages");
        categories.add("Canned");
        categories.add("Dairy");
        categories.add("Meat");
        categories.add("Frozen Foods");


Scanner sc = new Scanner(System.in);
        HashMap<String, String> grocery = new HashMap<>();


boolean Continue = false;

        Firstprompt();
      String reply = Input.getString();
      if(reply.equalsIgnoreCase("n") || reply.equalsIgnoreCase("no" )){System.exit(0);}
        else{    ItemPrompt();}

      do{
          System.out.println("Enter yes to continue");
        String response = sc.nextLine();
        if (response.equalsIgnoreCase("y") || response.equalsIgnoreCase("yes")) {

            for (int i = 0; i < categories.size(); i++) {
                System.out.println(i + 1+ ": " + categories.get(i));
            }
        }else {System.exit(0); }






            int chosecat = Input.getInt();

            System.out.println("Enter the name of the item");
            String name = sc.nextLine();
          System.out.println("How many of " + name + " do u want?");
int quantity = Input.getInt();
          switch (chosecat) {
                case 1:
                    add(quantity, name, categories.get(0), grocery);
                    break;
                case 2:
                    add(quantity,name, categories.get(1), grocery);
                    break;
                case 3:
                    add(quantity,name, categories.get(2), grocery);
                    break;
                case 4:
                    add(quantity,name, categories.get(3), grocery);
                    break;
                case 5:
                    add(quantity,name, categories.get(4), grocery);
            }
            ask();
            int answer = Input.getInt();
            if (answer == 1) {
                System.out.println(grocery);
Continue = true;

            } else if (answer == 2) {

            }
        }while(!Continue);
    }







public static void ItemPrompt(){
    System.out.println("would you like to enter a new item");

}



    public static void Firstprompt(){
        System.out.println("would you like to create a grocery list");

    }


    public void groceryCat(){
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
    }

public static HashMap<String,String> add(int num, String st1, String st2, HashMap <String,String> hashMap ){
      String main = num+" ";
    hashMap.put(main+st1,st2);
    return hashMap;
}


    public static void ask(){
        System.out.println("finalize the list or add an item");
        System.out.println("Enter 1 to Finalize or  2 to add more items");
    }


}
