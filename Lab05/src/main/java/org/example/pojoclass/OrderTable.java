package org.example.pojoclass;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ordertable")
public class OrderTable {

    @Id
    @Column(name="IDorder")
    private int IDorder;

    @Column(name="beginningDate")
    private String beginningDate;

    @Column(name="country")
    private String country;

    @Column(name="endingDate")
    private String endingDate;

    @Column(name="PassportID")
    private int passportID;

    @Column(name="programNumber")
    private int programNumber;

    @Column(name="tourNumber")
    private int tourNumber;

    @Column(name="tourType")
    private String tourType;

    public OrderTable() {
    }

    public OrderTable(String beginningDate, String country, String endingDate, int passportID, int programNumber, int tourNumber, String tourType) {
        this.beginningDate = beginningDate;
        this.country = country;
        this.endingDate = endingDate;
        this.passportID = passportID;
        this.programNumber = programNumber;
        this.tourNumber = tourNumber;
        this.tourType = tourType;
    }

    public int getIDorder() {
        return IDorder;
    }

    public void setIDorder(int IDorder) {
        this.IDorder = IDorder;
    }

    public String getBeginningDate() {
        return beginningDate;
    }

    public void setBeginningDate(String beginningDate) {
        this.beginningDate = beginningDate;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getEndingDate() {
        return endingDate;
    }

    public void setEndingDate(String endingDate) {
        this.endingDate = endingDate;
    }

    public int getPassportID() {
        return passportID;
    }

    public void setPassportID(int passportID) {
        this.passportID = passportID;
    }

    public int getProgramNumber() {
        return programNumber;
    }

    public void setProgramNumber(int programNumber) {
        this.programNumber = programNumber;
    }

    public int getTourNumber() {
        return tourNumber;
    }

    public void setTourNumber(int tourNumber) {
        this.tourNumber = tourNumber;
    }

    public String getTourType() {
        return tourType;
    }

    public void setTourType(String tourType) {
        this.tourType = tourType;
    }

    @Override
    public String toString() {
        return "OrderTable{" +
                "IDorder=" + IDorder +
                ", beginningDate='" + beginningDate + '\'' +
                ", country='" + country + '\'' +
                ", endingDate='" + endingDate + '\'' +
                ", passportID=" + passportID +
                ", programNumber=" + programNumber +
                ", tourNumber=" + tourNumber +
                ", tourType='" + tourType + '\'' +
                '}';
    }
}
