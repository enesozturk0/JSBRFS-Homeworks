package week5.presentation;

import week5.entity.ProgrammingLanguage;
import week5.entity.Technology;
import week5.repository.concretes.ProgrammingLanguageRepository;
import week5.repository.concretes.TechnologyRepository;
import week5.service.ProgrammingLanguageService;
import week5.service.TechnologyService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        boolean loop = true;
        Scanner scanner = new Scanner(System.in);
        ProgrammingLanguageService programmingLanguageManager = new ProgrammingLanguageService(new ProgrammingLanguageRepository());
        TechnologyService technologyManager = new TechnologyService(new TechnologyRepository());


        while (loop) {
            System.out.println("1 - Add Programming Language");
            System.out.println("2 - Delete Programming Language");
            System.out.println("3 - Update Programming Language");
            System.out.println("4 - List Programming Languages");
            System.out.println("5 - Add Technology ");
            System.out.println("6 - Delete Technology ");
            System.out.println("7 - Update Technology ");
            System.out.println("8 - List Technologies ");
            System.out.println("9 - Exit");

            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Enter programming language Id : ");
                    int addedProgrammingLanguageId = scanner.nextInt();

                    System.out.print("Enter programming language: ");
                    scanner.nextLine();
                    String programminngLanguageName = scanner.nextLine();

                    programmingLanguageManager.addProgrammingLanguage(new ProgrammingLanguage(addedProgrammingLanguageId, programminngLanguageName));
                    System.out.println(programminngLanguageName + " added");

                    break;

                case 2:
                    System.out.println("Enter programming language Id : ");
                    int deletedProgrammingLanguageId = scanner.nextInt();

                    ProgrammingLanguage deletedLanguage = programmingLanguageManager.getProgrammingLanguageById(deletedProgrammingLanguageId);
                    if (deletedLanguage != null) {
                        String deletedName = programmingLanguageManager.getProgrammingLanguageById(deletedProgrammingLanguageId).getName();
                        programmingLanguageManager.deleteProgrammingLanguage(programmingLanguageManager.getProgrammingLanguageById(deletedProgrammingLanguageId));

                        System.out.println(deletedName + " deleted");
                    } else {
                        System.out.println("Programming Language not found");
                    }


                    break;

                case 3:
                    System.out.println("Enter the Id of the program to be updated : ");
                    int updatedProgrammingLanguageId = scanner.nextInt();

                    System.out.println("Enter the new name of the programming language : ");
                    scanner.nextLine();
                    String updatedName = scanner.nextLine();

                    programmingLanguageManager.updateProgrammingLanguage(updatedProgrammingLanguageId, updatedName);
                    System.out.println("Updated to: " + updatedName);

                    break;

                case 4:
                    for (ProgrammingLanguage programmingLanguage : programmingLanguageManager.getAllProgrammingLanguages()) {
                        System.out.println("ID: " + programmingLanguage.getId() + " Name : " + programmingLanguage.getName());
                    }

                    break;

                case 5:
                    System.out.println("Enter technology Id : ");
                    int addedTechnologyId = scanner.nextInt();

                    System.out.print("Enter technology name: ");
                    scanner.nextLine();
                    String technologyName = scanner.nextLine();

                    System.out.println("Enter programming language Id to add Technology : ");
                    int addedLanguageId = scanner.nextInt();


                    technologyManager.addTechnology(new Technology(addedTechnologyId, technologyName ,programmingLanguageManager.getProgrammingLanguageById(addedLanguageId) ));
                    System.out.println(technologyName + " added");

                    break;



                case 6:
                    System.out.println("Enter technology Id : ");
                    int deletedTechnologyId = scanner.nextInt();

                    Technology deletedTech = technologyManager.getTechnologyById(deletedTechnologyId);
                    if (deletedTech != null) {
                        String deletedName = technologyManager.getTechnologyById(deletedTechnologyId).getName();
                        technologyManager.deleteTechnology(technologyManager.getTechnologyById(deletedTechnologyId));

                        System.out.println(deletedName + " deleted");
                    } else {
                        System.out.println("Technology not found");
                    }

                    break;

                case 7:
                    System.out.println("Enter the Id of the technology to be updated : ");
                    int updatedTechnologyId = scanner.nextInt();

                    System.out.println("Enter the new name of the technology : ");
                    scanner.nextLine();
                    String updatedTechName = scanner.nextLine();

                    technologyManager.updateTechnology(updatedTechnologyId, updatedTechName);
                    System.out.println("Updated to: " + updatedTechName);

                    break;

                case 8:
                    for (Technology technology : technologyManager.getAllTechnologies()) {
                        System.out.println("ID: " + technology.getId() + "-  Name : " + technology.getName() +" - Technology : " + technology.getProgrammingLanguage().getName());
                    }

                    break;


                case 9:
                    loop = false;
                    System.out.println("Program Terminated. ");
                    break;

                default:
                    System.out.println("Invalid option");
                    break;
            }


        }


    }
}
