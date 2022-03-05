package org.example.pojoclass;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "airticketstours")
public class AirTicketsTours {

    @Column(name="agreementDate")
    private String agreementDate;

    @Column(name="airLine")
    private String airLine;

    @Column(name="clientAddress")
    private String clientAddress;

    @Column(name="clientFullName")
    private String clientFullName;

    @Column(name="flightCode")
    private int flightCode;

    @Id
    @Column(name="IDairTicketsTours")
    private int IDairTicketsTours;

    @Column(name="PasswordID")
    private int passwordID;

    @Column(name="place")
    private int place;

    @Column(name="tourNumber")
    private int tourNumber;

    public AirTicketsTours() {
    }

    public AirTicketsTours(String agreementDate, String airLine, String clientAddress, String clientFullName, int flightCode, int passwordID, int place, int tourNumber) {

        this.agreementDate = agreementDate;
        this.airLine = airLine;
        this.clientAddress = clientAddress;
        this.clientFullName = clientFullName;
        this.flightCode = flightCode;
        this.passwordID = passwordID;
        this.place = place;
        this.tourNumber = tourNumber;
    }

    public String getAgreementDate() {
        return agreementDate;
    }

    public void setAgreementDate(String agreementDate) {
        this.agreementDate = agreementDate;
    }

    public String getAirLine() {
        return airLine;
    }

    public void setAirLine(String airLine) {
        this.airLine = airLine;
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

    public int getFlightCode() {
        return flightCode;
    }

    public void setFlightCode(int flightCode) {
        this.flightCode = flightCode;
    }

    public int getIDairTicketsTours() {
        return IDairTicketsTours;
    }

    public void setIDairTicketsTours(int IDairTicketsTours) {
        this.IDairTicketsTours = IDairTicketsTours;
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
        return "AirTicketsTours{" +
                "agreementDate='" + agreementDate + '\'' +
                ", airLine='" + airLine + '\'' +
                ", clientAddress='" + clientAddress + '\'' +
                ", clientFullName='" + clientFullName + '\'' +
                ", flightCode=" + flightCode +
                ", IDairTicketsTours=" + IDairTicketsTours +
                ", passwordID=" + passwordID +
                ", place=" + place +
                ", tourNumber=" + tourNumber +
                '}';
    }
}
