import java.util.Arrays;

public class Person {
    private String name;

    public Person(String name) {
        this.name = name;

    }

    public String getName(){
return this.name;
    }

    public void setName(String name){
this.name = name;
    }
    public void sayHello(){
   System.out.format("Hello this is %s\n", this.name);

    }

 public static Person[] addPerson(Person[] arr, Person person){

 Person[] newArr =  Arrays.copyOf(arr, arr.length+1);
 newArr[newArr.length-1] = person;

     return newArr;
 }




//*************************************************************
    public static void main(String[] args) {
        Person Mido = new Person("Amida");
        System.out.println(Mido.name);
      Mido.sayHello();

//      **********************************************************
//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);
//********************************************************************

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);


        Person person1 = new Person("John");
        Person person2 = person1;
        System.out.println(person1.getName());
        System.out.println(person2.getName());
        person2.setName("Jane");
        System.out.println(person1.getName());
        System.out.println(person2.getName());



    }
}

