package week4.Pair;

public class Student extends User {
    public int studentId;

    public int getGrade() {
        return studentId;
    }

    public Student(int id, String name, int age, int studentId) {
        this.setId(id);
        this.setName(name);
        this.setAge(age);
        this.studentId = studentId;
    }

}
