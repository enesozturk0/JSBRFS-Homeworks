package week4.Pair;

public class Instructor extends User {
    private String courseName;

    public String getCourseName() {

        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Instructor(int id, String name, int age, String courseName) {
        this.setId(id);
        this.setName(name);
        this.setAge(age);
        this.courseName = courseName;
    }

}
