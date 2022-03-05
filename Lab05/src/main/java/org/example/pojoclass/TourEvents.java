package org.example.pojoclass;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tourevents")
public class TourEvents {

    @Id
    @Column(name="IDtourEvents")
    private int IDtourEvents;

    @Column(name="beginningDate")
    private String beginningDate;

    @Column(name="beginningTime")
    private String beginningTime;

    @Column(name="city")
    private String city;

    @Column(name="country")
    private String country;

    @Column(name="endingDate")
    private String endingDate;

    @Column(name="name")
    private String name;

    @Column(name="place")
    private String place;

    @Column(name="tourNumber")
    private int programNumber;

    @Column(name="tourNumber")
    private int tourNumber;

    @Column(name="tourType")
    private String tourType;

    public TourEvents() {
    }

    public TourEvents(String beginningDate, String beginningTime, String city, String country, String endingDate, String name, String place, int programNumber, int tourNumber, String tourType) {
        this.beginningDate = beginningDate;
        this.beginningTime = beginningTime;
        this.city = city;
        this.country = country;
        this.endingDate = endingDate;
        this.name = name;
        this.place = place;
        this.programNumber = programNumber;
        this.tourNumber = tourNumber;
        this.tourType = tourType;
    }

    public int getIDtourEvents() {
        return IDtourEvents;
    }

    public void setIDtourEvents(int IDtourEvents) {
        this.IDtourEvents = IDtourEvents;
    }

    public String getBeginningDate() {
        return beginningDate;
    }

    public void setBeginningDate(String beginningDate) {
        this.beginningDate = beginningDate;
    }

    public String getBeginningTime() {
        return beginningTime;
    }

    public void setBeginningTime(String beginningTime) {
        this.beginningTime = beginningTime;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
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

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
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
        return "TourEvents{" +
                "IDtourEvents=" + IDtourEvents +
                ", beginningDate='" + beginningDate + '\'' +
                ", beginningTime='" + beginningTime + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", endingDate='" + endingDate + '\'' +
                ", name='" + name + '\'' +
                ", place='" + place + '\'' +
                ", programNumber=" + programNumber +
                ", tourNumber=" + tourNumber +
                ", tourType='" + tourType + '\'' +
                '}';
    }


}
