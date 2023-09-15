/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Date;

/**
 *
 * @author viet
 */
public class InternCandidate extends Candidate {
    private String Majors;
    private String Semester;
    private String University;

    public InternCandidate(String Majors, String Semester, String University, String ID, String Fname, String Lname, Date Dob, String Addreess, int Phone, String Email) {
        super(ID, Fname, Lname, Dob, Addreess, Phone, Email, 2);
        this.Majors = Majors;
        this.Semester = Semester;
        this.University = University;
    }

    public String getMajors() {
        return Majors;
    }

    public void setMajors(String Majors) {
        this.Majors = Majors;
    }

    public String getSemester() {
        return Semester;
    }

    public void setSemester(String Semester) {
        this.Semester = Semester;
    }

    public String getUniversity() {
        return University;
    }

    public void setUniversity(String University) {
        this.University = University;
    }
    
}
