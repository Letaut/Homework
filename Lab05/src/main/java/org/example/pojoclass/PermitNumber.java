package org.example.pojoclass;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="permitnumber")
public class PermitNumber {

    @Id
    @Column(name="IDpermitNumber")
    private int IDpermitNumber;

    @Column(name="agreementDate")
    private String agreementDate;

    @Column(name="arrivalDate")
    private String arrivalDate;

    @Column(name="category")
    private String category;

    @Column(name="city")
    private String city;

    @Column(name="clientAddress")
    private String clientAddress;

    @Column(name="clientFullName")
    private String clientFullNumber;

    @Column(name="name")
    private String name;

    @Column(name="PasswortID")
    private int passwortID;

    @Column(name="tourNumber")
    private int tourNumber;

    public PermitNumber() {
    }

    public PermitNumber(String agreementDate, String arrivalDate, String category, String city, String clientAddress, String clientFullNumber, String name, int passwortID, int tourNumber) {
        this.agreementDate = agreementDate;
        this.arrivalDate = arrivalDate;
        this.category = category;
        this.city = city;
        this.clientAddress = clientAddress;
        this.clientFullNumber = clientFullNumber;
        this.name = name;
        this.passwortID = passwortID;
        this.tourNumber = tourNumber;
    }

    public int getIDpermitNumber() {
        return IDpermitNumber;
    }

    public void setIDpermitNumber(int IDpermitNumber) {
        this.IDpermitNumber = IDpermitNumber;
    }

    public String getAgreementDate() {
        return agreementDate;
    }

    public void setAgreementDate(String agreementDate) {
        this.agreementDate = agreementDate;
    }

    public String getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(String arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getClientAddress() {
        return clientAddress;
    }

    public void setClientAddress(String clientAddress) {
        this.clientAddress = clientAddress;
    }

    public String getClientFullNumber() {
        return clientFullNumber;
    }

    public void setClientFullNumber(String clientFullNumber) {
        this.clientFullNumber = clientFullNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        return "PermitNumber{" +
                "IDpermitNumber=" + IDpermitNumber +
                ", agreementDate='" + agreementDate + '\'' +
                ", arrivalDate='" + arrivalDate + '\'' +
                ", category='" + category + '\'' +
                ", city='" + city + '\'' +
                ", clientAddress='" + clientAddress + '\'' +
                ", clientFullNumber='" + clientFullNumber + '\'' +
                ", name='" + name + '\'' +
                ", passwortID=" + passwortID +
                ", tourNumber=" + tourNumber +
                '}';
    }
}
