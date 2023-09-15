/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Candidate;
import Model.ExpCandidate;
import Model.FreshCandidate;
import Model.InternCandidate;
import View.Validation;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Manager {

    Scanner scanner = new Scanner(System.in);
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    ArrayList<ExpCandidate> Exp = new ArrayList<>();
    ArrayList<FreshCandidate> Fresh = new ArrayList<>();
    ArrayList<InternCandidate> Intern = new ArrayList<>();

    // Phương thức chung để nhập thông tin ứng viên
   private Candidate inputCandidateInfo() {
    System.out.println("Enter ID:");
    String ID = Validation.checkInputString();

    System.out.println("Enter First Name:");
    String Fname = Validation.checkInputString();

    System.out.println("Enter Last Name:");
    String Lname = Validation.checkInputString();

    System.out.println("Enter Date of Birth (yyyy-MM-dd):");
    Date Dob = Validation.checkInputDob();
   

    System.out.println("Enter Address:");
    String Address = Validation.checkInputString();

    System.out.println("Enter Phone Number:");
    String phoneInput = Validation.checkInputPhone();
    int Phone = Integer.parseInt(phoneInput);

    System.out.println("Enter Email:");
    String Email = Validation.checkInputEmail();

    return new Candidate(ID, Fname, Lname, Dob, Address, Phone, Email, 0);
}


    public void createExp() {
        Candidate baseInfo = inputCandidateInfo();
        if (baseInfo != null) {
            System.out.println("Enter Years of Experience:");
            int ExpInYear = Validation.checkInputExprience(baseInfo.getDob().getYear() + 1900);

            System.out.println("Enter Professional Skill:");
            String ProSkill = scanner.nextLine();

            ExpCandidate expCandidate = new ExpCandidate(ExpInYear, ProSkill, baseInfo.getID(), baseInfo.getFname(), baseInfo.getLname(), baseInfo.getDob(), baseInfo.getAddreess(), baseInfo.getPhone(), baseInfo.getEmail());
            Exp.add(expCandidate);

            System.out.println("ExpCandidate added successfully!");
        }
    }

    public void createFresh() {
        Candidate baseInfo = inputCandidateInfo();
        if (baseInfo != null) {
            System.out.println("Enter Graduation Date (yyyy-MM-dd):");
            Date GraduationDate = null;
            try {
                GraduationDate = dateFormat.parse(scanner.nextLine());
            } catch (ParseException e) {
                System.out.println("Invalid date format. Please use yyyy-MM-dd.");
                return;
            }

            System.out.println("Enter Graduation Rank:");
            
    String GraduationRank = Validation.checkInputGraduationRank();

            System.out.println("Enter Education:");
            String Education = scanner.nextLine();

            FreshCandidate freshCandidate = new FreshCandidate(GraduationDate, GraduationRank, Education, baseInfo.getID(), baseInfo.getFname(), baseInfo.getLname(), baseInfo.getDob(), baseInfo.getAddreess(), baseInfo.getPhone(), baseInfo.getEmail());
            Fresh.add(freshCandidate);

            System.out.println("FreshCandidate added successfully!");
        }
    }

    public void createIntern() {
        Candidate baseInfo = inputCandidateInfo();
        if (baseInfo != null) {
            System.out.println("Enter Major:");
            String Majors = scanner.nextLine();

            System.out.println("Enter Semester:");
            String Semester = scanner.nextLine();

            System.out.println("Enter University:");
            String University = scanner.nextLine();

            InternCandidate internCandidate = new InternCandidate(Majors, Semester, University, baseInfo.getID(), baseInfo.getFname(), baseInfo.getLname(), baseInfo.getDob(), baseInfo.getAddreess(), baseInfo.getPhone(), baseInfo.getEmail());
            Intern.add(internCandidate);

            System.out.println("InternCandidate added successfully!");
        }
    }

   public void searchCandidates(String candidateName, int candidateType) {
    System.out.println("Search Results:");
    searchInList(Exp, candidateName, candidateType);
    searchInList(Fresh, candidateName, candidateType);
    searchInList(Intern, candidateName, candidateType);
}

private void searchInList(ArrayList<? extends Candidate> candidateList, String candidateName, int candidateType) {
    for (Candidate candidate : candidateList) {
        if (candidateMatches(candidate, candidateName) && candidate.getType() == candidateType) {
            displayCandidateInfo(candidate);
        }
    }
}

private boolean candidateMatches(Candidate candidate, String candidateName) {
    return candidate.getFname().equalsIgnoreCase(candidateName) || candidate.getLname().equalsIgnoreCase(candidateName);
}

private void displayCandidateInfo(Candidate candidate) {
    System.out.println("Candidate Name: " + candidate.getFname() + " " + candidate.getLname());
    System.out.println("Birth Date: " + dateFormat.format(candidate.getDob()));
    System.out.println("Address: " + candidate.getAddreess());
    System.out.println("Phone: " + candidate.getPhone());
    System.out.println("Email: " + candidate.getEmail());
    System.out.println("Candidate Type: " + getCandidateType(candidate.getType()));
    System.out.println();
}

// ... (other existing methods)

private String getCandidateType(int type) {
    switch (type) {
        case 0:
            return "Exp";
        case 1:
            return "Fresh";
        case 2:
            return "Intern";
        default:
            return "Unknown";
    }
}
public void displayAllCandidates() {
    System.out.println("All Candidates:");
    System.out.println("===================================");

    System.out.println("Experienced Candidates:");
    displayCandidates(Exp);

    System.out.println("Fresh Candidates:");
    displayCandidates(Fresh);

    System.out.println("Intern Candidates:");
    displayCandidates(Intern);

    System.out.println("===================================");
}
private void displayCandidates(ArrayList<? extends Candidate> candidates) {
    for (Candidate candidate : candidates) {
        displayCandidateInfo(candidate);
    }
}
}


// ... (other existing methods)

