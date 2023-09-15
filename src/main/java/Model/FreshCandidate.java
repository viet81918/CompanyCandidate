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
public class FreshCandidate  extends Candidate{
    private Date Graduation_date;
    private String Graduation_rank;
    private String Education;

    public FreshCandidate(Date Graduation_date, String Graduation_rank, String Education, String ID, String Fname, String Lname, Date Dob, String Addreess, int Phone, String Email) {
        super(ID, Fname, Lname, Dob, Addreess, Phone, Email, 1);
        this.Graduation_date = Graduation_date;
        this.Graduation_rank = Graduation_rank;
        this.Education = Education;
    }

    public Date getGraduation_date() {
        return Graduation_date;
    }

    public void setGraduation_date(Date Graduation_date) {
        this.Graduation_date = Graduation_date;
    }

    public String getGraduation_rank() {
        return Graduation_rank;
    }

    public void setGraduation_rank(String Graduation_rank) {
        this.Graduation_rank = Graduation_rank;
    }

    public String getEducation() {
        return Education;
    }

    public void setEducation(String Education) {
        this.Education = Education;
    }

    @Override
    public String toString() {
        return "FreshCandidate{" + "Graduation_date=" + Graduation_date + ", Graduation_rank=" + Graduation_rank + ", Education=" + Education + '}';
    }
    
}
