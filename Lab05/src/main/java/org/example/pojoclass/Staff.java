package org.example.pojoclass;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="staff")
public class Staff {

    @Id
    @Column(name="IDstaff")
    private int IDstaff;

    @Column(name="address")
    private String address;

    @Column(name="fullName")
    private String fullName;

    @Column(name="passwortID")
    private int passwortID;

    @Column(name="position")
    private String position;

    public Staff() {
    }

    public Staff(String address, String fullName, int passwortID, String position) {
        this.address = address;
        this.fullName = fullName;
        this.passwortID = passwortID;
        this.position = position;
    }

    public int getIDstaff() {
        return IDstaff;
    }

    public void setIDstaff(int IDstaff) {
        this.IDstaff = IDstaff;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getPasswortID() {
        return passwortID;
    }

    public void setPasswortID(int passwortID) {
        this.passwortID = passwortID;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "IDstaff=" + IDstaff +
                ", address='" + address + '\'' +
                ", fullName='" + fullName + '\'' +
                ", passwortID=" + passwortID +
                ", position='" + position + '\'' +
                '}';
    }
}
