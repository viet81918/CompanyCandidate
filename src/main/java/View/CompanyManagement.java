package View;

import Controller.Manager;
import java.util.Scanner;

public class CompanyManagement extends Menu<String> {
    public static Scanner sc = new Scanner(System.in);
    static String[] mc = {"Experience", "Fresher", "Internship","Searching", "Exit"};
  protected Manager managers;
  public CompanyManagement() {
        super("CONVERT", mc);
        managers = new Manager();
    }
    @Override
   public void execute(String n) {
    switch (n) {
        case "1":
            createCandidates("Exp", managers::createExp);
            break;
        case "2":
            createCandidates("Fresh", managers::createFresh);
            break;
        case "3":
            createCandidates("Intern", managers::createIntern);
            break;
        case "4":
            managers.displayAllCandidates();
            searchCandidates();
            break;
        case "5":
            System.exit(0);
    }
}

private void createCandidates(String candidateType, Runnable createMethod) {
    boolean continueCreating = true;

    while (continueCreating) {
        createMethod.run();
        System.out.println("Do you want to create another " + candidateType + " Candidate (Y/N)?");
        boolean validInput = false;
        while (!validInput) {
            String input = scanner.nextLine();
            if (Validation.checkInputYN()) {
                validInput = true;
                if (input.equalsIgnoreCase("N")) {
                    continueCreating = false;
                }
            } else {
                System.out.println("Invalid input. Please enter Y or N.");
            }
        }
    }
}
   
    private void searchCandidates() {
    System.out.println("Enter Candidate Name (First Name or Last Name):");
    String candidateName = Validation.checkInputString();
    System.out.println("Enter Candidate Type (0 for Exp, 1 for Fresh, 2 for Intern):");
    int candidateType = Validation.checkInputIntLimit(0, 2);
    managers.searchCandidates(candidateName, candidateType);
}
}
