package week4.Odev01;

public class Manager extends Employee{

    private  int teamSize;

    public Manager(int id, String name, int salary, String department, int teamSize) {
        super(id, name, salary, department);
        this.teamSize = teamSize;
    }

    public int getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }

    double calculateBonus(){
        return getSalary()*(0.2);
    }

}
