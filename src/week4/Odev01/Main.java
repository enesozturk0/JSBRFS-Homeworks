package week4.Odev01;

public class Main {
    public static void main(String[] args) {

    Developer developer1 = new Developer(1,"Enes",45000,"Software","Java & React");
    Developer developer2 = new Developer(2,"Ahmet",35000,"Security","Cyber Security");

    Manager manager1 = new Manager(3,"Emre",65500,"Software",50);
    Manager manager2 = new Manager(4,"Osman",55200,"Security",35);

        System.out.println(" Id : " + developer1.getId() +"\n name : "+ developer1.getName() +"\n salary : "+ developer1.getSalary() +"\n department : "+ developer1.getDepartment() +"\n about : "+ developer1.getAbout() + "\n bonus : "+ developer1.calculateBonus() );
        System.out.println("-------------");
        System.out.println(" Id : " + developer2.getId() +"\n name : "+ developer2.getName() +"\n salary : "+ developer2.getSalary() +"\n department : "+ developer2.getDepartment() +"\n about : "+ developer2.getAbout() + "\n bonus : "+ developer2.calculateBonus());
        System.out.println("-------------");
        System.out.println(" Id : " + manager1.getId() + "\n name : "+ manager1.getName() +"\n salary : "+ manager1.getSalary() +"\n department : "+ manager1.getDepartment() +"\n teamSize : "+ manager1.getTeamSize() + "\n bonus : "+ manager1.calculateBonus());
        System.out.println("-------------");
        System.out.println(" Id : " +manager2.getId() + "\n name : "+ manager2.getName() +"\n salary : "+ manager2.getSalary() +"\n department : "+ manager2.getDepartment() +"\n teamSize : "+ manager2.getTeamSize()+ "\n bonus : "+ manager2.calculateBonus());


    }
}
