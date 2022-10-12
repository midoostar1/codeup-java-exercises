package grades;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grade;

    public Student(String name){
        this.name = name;
        this.grade = new ArrayList<>();

    }

    public String getName() {
        return this.name;
    }

    public void addGrade(int grade) {
        this.grade.add(grade);
    }

    public double getGradeAverage() {
        Integer sum = 0;
        if (!grade.isEmpty()) {
            for (Integer grade : grade) {
                sum += grade;
            }
            return sum.doubleValue() / grade.size();
        }
        return sum;
    }
}
