package grocery;




import util.Input;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class GroceryApplication {

    public static void main(String[] args) {
        ArrayList<String> showCategories = new ArrayList<String>();
        showCategories.add("Beverages");
        showCategories.add("Canned");
        showCategories.add("Dairy");
        showCategories.add("Meat");
        showCategories.add("Frozen Foods");


Scanner sc = new Scanner(System.in);
        ArrayList<Grocery> grocery = new ArrayList<>();


boolean Continue = false;

        Firstprompt();
      String reply = Input.getString();
      if(reply.equalsIgnoreCase("n") || reply.equalsIgnoreCase("no" )){System.exit(0);}
        else{    ItemPrompt();}

      do{
          System.out.println("Enter yes to continue");
        String response = sc.nextLine();
        if (response.equalsIgnoreCase("y") || response.equalsIgnoreCase("yes")) {

            for (int i = 0; i < showCategories.size(); i++) {
                System.out.println(i + 1+ ": " + showCategories.get(i));
            }
        }else {System.exit(0);}






            int chosecat = Input.getInt();

            System.out.println("Enter the name of the item");
            String item = sc.nextLine();
          System.out.println("How many of " + item + " do u want?");
int quantity = Input.getInt();
          switch (chosecat) {
                case 1:
                   Grocery name =  new Grocery(quantity,item,showCategories.get(0));
                   grocery.add(name);
                    break;
                case 2:
                     name =  new Grocery(quantity,item,showCategories.get(1));
                    grocery.add(name);
                    break;
                case 3:
                    name =  new Grocery(quantity,item,showCategories.get(2));
                    grocery.add(name);
                    break;
                case 4:
                    name =  new Grocery(quantity,item,showCategories.get(3));
                    grocery.add(name);
                    break;
                case 5:
                    name =  new Grocery(quantity,item,showCategories.get(4));
                    grocery.add(name);
          }
            ask();
            int answer = Input.getInt();
            if (answer == 1) {

                grocery.sort(new Comparator<Grocery>() {
                    @Override
                    public int compare(Grocery o1, Grocery o2) {
                        return o1.getName().compareTo(o2.getName());
                    }
                });

               for(Grocery items:grocery){
                   System.out.println(items);
               }
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


    public static void ask(){
        System.out.println("finalize the list or add an item");
        System.out.println("Enter 1 to Finalize or  2 to add more items");
    }


}
