package week4.Pair;

public class Main {
    public static void main(String[] args) {

        InstructorManager instructorManager = new InstructorManager();

        Instructor instructor1 = new Instructor(1, "Edefiye", 30, "Java Backend");
        Instructor instructor2 = new Instructor(2, "Lalegül", 33, "React Frontend");
        Student student1 = new Student(3, "Enes", 22, 101);
        Student student2 = new Student(4, "Ege", 21, 102);


        instructorManager.add(instructor1);
        instructorManager.add(instructor2);

        instructorManager.getList();
        System.out.println("--------------------");

        instructorManager.delete(instructor2);
        instructorManager.getList();
        System.out.println("--------------------");

        instructorManager.update(1, "Ahmet", 25, "Rapid application development");
        System.out.println(instructorManager.getById(1).getName() + " " + instructorManager.getById(1).getAge() + " " + instructorManager.getById(1).getCourseName());
        System.out.println("-------------------------");

        System.out.println(student1.getName()+ " " + student2.getName());
    }


}
