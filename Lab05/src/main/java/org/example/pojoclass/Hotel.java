package org.example.pojoclass;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="hotel")
public class Hotel {

    @Id
    @Column(name="IDhotel")
    private int IDhotel;

    @Column(name="beginningDate")
    private String beginningDate;

    @Column(name="city")
    private String city;

    @Column(name="class")
    private String classColumn;

    @Column(name="country")
    private String country;

    @Column(name="endingDate")
    private String endingDate;

    @Column(name="name")
    private String name;

    @Column(name="programNumber")
    private int programNumber;

    @Column(name="tourNumber")
    private int tourNumber;

    @Column(name="tourType")
    private String tourType;

    public Hotel() {
    }

    public Hotel(String beginningDate, String city, String classColumn, String country, String endingDate, String name, int programNumber, int tourNumber, String tourType) {
        this.beginningDate = beginningDate;
        this.city = city;
        this.classColumn = classColumn;
        this.country = country;
        this.endingDate = endingDate;
        this.name = name;
        this.programNumber = programNumber;
        this.tourNumber = tourNumber;
        this.tourType = tourType;
    }

    public int getIDhotel() {
        return IDhotel;
    }

    public void setIDhotel(int IDhotel) {
        this.IDhotel = IDhotel;
    }

    public String getBeginningDate() {
        return beginningDate;
    }

    public void setBeginningDate(String beginningDate) {
        this.beginningDate = beginningDate;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getClassColumn() {
        return classColumn;
    }

    public void setClassColumn(String classColumn) {
        this.classColumn = classColumn;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        return "Hotel{" +
                "IDhotel=" + IDhotel +
                ", beginningDate='" + beginningDate + '\'' +
                ", city='" + city + '\'' +
                ", classColumn='" + classColumn + '\'' +
                ", country='" + country + '\'' +
                ", endingDate='" + endingDate + '\'' +
                ", name='" + name + '\'' +
                ", programNumber=" + programNumber +
                ", tourNumber=" + tourNumber +
                ", tourType='" + tourType + '\'' +
                '}';
    }
}
