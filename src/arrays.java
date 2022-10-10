import java.util.Arrays;
public class arrays {

    public static void main(String[] args) {
      //arrays in java are stored in curly braces
      char[] vowels = {'a','e','i','o','u'};

        System.out.println(Arrays.toString(vowels));
        System.out.println(vowels.length);

        String[][] arr = {
                {"cameroon","nigeria","kenya",},
                {"usa","mexico","portico"},
                {"france","britain"}
        };

       for(String[] continent :arr){
           for (String country:continent){
               System.out.println(country);
           }
           System.out.println("\n");
       }
    }


}
