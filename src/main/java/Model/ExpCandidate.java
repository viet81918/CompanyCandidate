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
public class ExpCandidate extends Candidate {
    private int ExpInYear;
    private String ProSkill;

    public ExpCandidate(int ExpInYear, String ProSkill, String ID, String Fname, String Lname, Date Dob, String Addreess, int Phone, String Email) {
        super(ID, Fname, Lname, Dob, Addreess, Phone, Email, 0);
        this.ExpInYear = ExpInYear;
        this.ProSkill = ProSkill;
    }


    public int getExpInYear() {
        return ExpInYear;
    }

    public void setExpInYear(int ExpInYear) {
        this.ExpInYear = ExpInYear;
    }

    public String getProSkill() {
        return ProSkill;
    }

    public void setProSkill(String ProSkill) {
        this.ProSkill = ProSkill;
    }

    
    @Override
    public String toString() {
        return "ExpCandidate{" + "ExpInYear=" + ExpInYear + ", ProSkill=" + ProSkill + '}';
    }
    
}
