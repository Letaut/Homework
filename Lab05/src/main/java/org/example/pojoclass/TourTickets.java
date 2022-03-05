package org.example.pojoclass;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tourtickets")
public class TourTickets {

    @Id
    @Column(name="IDtourTickets")
    private int IDtourTickets;

    @Column(name="agreementDate")
    private String agreementDate;

    @Column(name="beginningDate")
    private String beginningDate;

    @Column(name="beginningTime")
    private String beginningTime;

    @Column(name="city")
    private String city;

    @Column(name="clientAddress")
    private String clientAddress;

    @Column(name="clientFullName")
    private String clientFullName;

    @Column(name="eventPlace")
    private String eventPlace;

    @Column(name="passwordID")
    private int passwordID;

    @Column(name="place")
    private int place;

    @Column(name="tourNumber")
    private int tourNumber;

    public TourTickets() {
    }

    public TourTickets(String agreementDate, String beginningDate, String beginningTime, String city, String clientAddress, String clientFullName, String eventPlace, int passwordID, int place, int tourNumber) {
        this.agreementDate = agreementDate;
        this.beginningDate = beginningDate;
        this.beginningTime = beginningTime;
        this.city = city;
        this.clientAddress = clientAddress;
        this.clientFullName = clientFullName;
        this.eventPlace = eventPlace;
        this.passwordID = passwordID;
        this.place = place;
        this.tourNumber = tourNumber;
    }

    public int getIDtourTickets() {
        return IDtourTickets;
    }

    public void setIDtourTickets(int IDtourTickets) {
        this.IDtourTickets = IDtourTickets;
    }

    public String getAgreementDate() {
        return agreementDate;
    }

    public void setAgreementDate(String agreementDate) {
        this.agreementDate = agreementDate;
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

    public String getEventPlace() {
        return eventPlace;
    }

    public void setEventPlace(String eventPlace) {
        this.eventPlace = eventPlace;
    }

    public int getPasswordID() {
        return passwordID;
    }

    public void setPasswordID(int passwordID) {
        this.passwordID = passwordID;
    }

    public int getPlace() {
        return place;
    }

    public void setPlace(int place) {
        this.place = place;
    }

    public int getTourNumber() {
        return tourNumber;
    }

    public void setTourNumber(int tourNumber) {
        this.tourNumber = tourNumber;
    }


    @Override
    public String toString() {
        return "TourTickets{" +
                "IDtourTickets=" + IDtourTickets +
                ", agreementDate='" + agreementDate + '\'' +
                ", beginningDate='" + beginningDate + '\'' +
                ", beginningTime='" + beginningTime + '\'' +
                ", city='" + city + '\'' +
                ", clientAddress='" + clientAddress + '\'' +
                ", clientFullName='" + clientFullName + '\'' +
                ", eventPlace='" + eventPlace + '\'' +
                ", passwordID=" + passwordID +
                ", place=" + place +
                ", tourNumber=" + tourNumber +
                '}';
    }
}
