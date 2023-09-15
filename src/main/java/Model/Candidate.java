
package Model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Candidate {
    private String ID;
    private String Fname;
    private String Lname;
    private Date Dob;
    private String Addreess;
    private int Phone;
    private String Email;
    private int Type;

    public Candidate(String ID, String Fname, String Lname, Date Dob, String Addreess, int Phone, String Email,int type) {
        this.ID = ID;
        this.Fname = Fname;
        this.Lname = Lname;
        this.Dob = Dob;
        this.Addreess = Addreess;
        this.Phone = Phone;
        this.Email = Email;
        this.Type=type;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getFname() {
        return Fname;
    }

    public void setFname(String Fname) {
        this.Fname = Fname;
    }

    public String getLname() {
        return Lname;
    }

    public void setLname(String Lname) {
        this.Lname = Lname;
    }

    public Date getDob() {
        return Dob;
    }

    public void setDob(Date Dob) {
        this.Dob = Dob;
    }

    public String getAddreess() {
        return Addreess;
    }

    public void setAddreess(String Addreess) {
        this.Addreess = Addreess;
    }

    public int getPhone() {
        return Phone;
    }

    public void setPhone(int Phone) {
        this.Phone = Phone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public int getType() {
        return Type;
    }

    public void setType(int Type) {
        this.Type = Type;
    }

    @Override
    public String toString() {
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    String dobString = dateFormat.format(Dob);
    return "Candidate{" +
            "ID='" + ID + '\'' +
            ", Fname='" + Fname + '\'' +
            ", Lname='" + Lname + '\'' +
            ", Dob='" + dobString + '\'' +
            ", Address='" + Addreess + '\'' +
            ", Phone=" + Phone +
            ", Email='" + Email + '\'' +
            ", Type=" + Type +
            '}';
}
    
}
