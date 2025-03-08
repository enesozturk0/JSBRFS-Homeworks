package week4.Pair;

import java.util.ArrayList;
import java.util.List;

public class InstructorManager {

    private List<Instructor> instructors = new ArrayList<>();

    public void getList() {

        for (Instructor instructor : instructors) {
            System.out.println(instructor.getId() + " Name: " + instructor.getName() + " Age: " + instructor.getAge() + " Course: " + instructor.getCourseName());
        }

    }

    public void add(Instructor instructor) {
        instructors.add(instructor);
    }

    public void delete(Instructor instructor) {
        instructors.remove(instructor);
    }

    public void update(int id, String newName, int newAge, String newCourse) {

        getById(id).setName(newName);
        getById(id).setAge(newAge);
        getById(id).setCourseName(newCourse);

    }

    public Instructor getById(int id) {
        for (Instructor instructor : instructors) {
            if (instructor.getId() == id) {
                return instructor;
            }
        }
        return null;
    }


}
