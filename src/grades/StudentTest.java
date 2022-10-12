package grades;

public class StudentTest {

    public static void main(String[] args) {

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


        System.out.println(anthony.getGradeAverage());
    }


}
