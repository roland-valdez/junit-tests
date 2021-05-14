import java.util.ArrayList;

public class Student {
    private String name;
    private long id;
    private ArrayList<Integer> grades;

    public Student(String name, long id){
        ArrayList<Integer> grades = new ArrayList<>();
        this.name = name;
        this.id = id;
        this.grades = grades;
    }
    public static void main(String[] args) {
        Student roland = new Student("roland", 12345);
        System.out.println("roland.getName() = " + roland.getName());
        System.out.println("roland.getId() = " + roland.getId());
        roland.addGrade(50);
        roland.addGrade(100);
        System.out.println("roland.getGrades() = " + roland.getGrades());
        System.out.println("roland.getGradeAverage() = " + roland.getGradeAverage());

    }
    // returns the student's id
    public long getId(){
        return this.id;
    }

    // returns the student's name
    public String getName(){
        return this.name;
    }

    // adds the given grade to the grades list
    public void addGrade(int grade) {
        grades.add(grade);
    }
    // returns the list of grades
    public ArrayList<Integer> getGrades(){
        return this.grades;
    }

    // returns the average of the students grades
    public double getGradeAverage(){
        int total = 0;
        for (Integer grade: grades){
            total += grade;
        }
        return (double) total / grades.size();
    }
}
