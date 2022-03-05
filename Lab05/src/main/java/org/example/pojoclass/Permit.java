package org.example.pojoclass;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="permit")
public class Permit {

    @Id
    @Column(name="IDpermit")
    private int IDpermit;

    @Column(name="agreementDate")
    private String agreementDate;

    @Column(name="clientAddress")
    private String clientAddress;

    @Column(name="clientFullName")
    private String clientFullName;

    @Column(name="PasswortID")
    private int passwortID;

    @Column(name="tourNumber")
    private int tourNumber;

    public Permit() {
    }

    public Permit(String agreementDate, String clientAddress, String clientFullName, int passwortID, int tourNumber) {
        this.agreementDate = agreementDate;
        this.clientAddress = clientAddress;
        this.clientFullName = clientFullName;
        this.passwortID = passwortID;
        this.tourNumber = tourNumber;
    }

    public int getIDpermit() {
        return IDpermit;
    }

    public void setIDpermit(int IDpermit) {
        this.IDpermit = IDpermit;
    }

    public String getAgreementDate() {
        return agreementDate;
    }

    public void setAgreementDate(String agreementDate) {
        this.agreementDate = agreementDate;
    }

    public String getClientAddress() {
        return clientAddress;
    }

    public void setClientAddress(String clientAddress) {
        this.clientAddress = clientAddress;
    }

    public String getClientFullName() {
        return clientFullName;
    }

    public void setClientFullName(String clientFullName) {
        this.clientFullName = clientFullName;
    }

    public int getPasswortID() {
        return passwortID;
    }

    public void setPasswortID(int passwortID) {
        this.passwortID = passwortID;
    }

    public int getTourNumber() {
        return tourNumber;
    }

    public void setTourNumber(int tourNumber) {
        this.tourNumber = tourNumber;
    }

    @Override
    public String toString() {
        return "Permit{" +
                "IDpermit=" + IDpermit +
                ", agreementDate='" + agreementDate + '\'' +
                ", clientAddress='" + clientAddress + '\'' +
                ", clientFullName='" + clientFullName + '\'' +
                ", passwortID=" + passwortID +
                ", tourNumber=" + tourNumber +
                '}';
    }
}
