import java.util.Arrays;

public class ArraysExercises {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(numbers);

        Person[] arr;
        arr = new Person[3];
        arr[0] = new Person("james");
        arr[1] = new Person("ricky");
        arr[2] = new Person("Jolie");

       for(Person array :arr){
           System.out.println(array.getName());

       }

        System.out.println("-------------------------------------------");
        Person man = new Person("mido");


        //using the addPerson method created
       Person[]arr1 = Person.addPerson(arr,man);

        for(Person array :arr1) {
            System.out.println(array.getName());
        }
    }
}


