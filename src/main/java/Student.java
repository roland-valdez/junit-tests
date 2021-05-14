



import java.util.ArrayList;

public class Student {
    private String name;
    private long id;
    private ArrayList<Integer> grades;

    public Student(long id, String name) {
        ArrayList<Integer> grades = new ArrayList<Integer>();
        this.id = id;
        this.name = name;
        this.grades = grades;

    }

    public long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }
    public ArrayList<Integer> getGrades(){
        return this.grades;
    }

    public void addGrade(int grade) {
        this.grades.add(grade);
    }
    public double getGradeAverage(){
        double total = 0;
        for (int grade : this.grades){

        }
        return total / this.grades.size();
    }
}