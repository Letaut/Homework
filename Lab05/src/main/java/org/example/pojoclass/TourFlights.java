package org.example.pojoclass;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tourflights")
public class TourFlights {

    @Id
    @Column(name="IDtourFlights")
    private int IDtourFlights;

    @Column(name="airLine")
    private String airLine;

    @Column(name="ArrivalCity")
    private String arrivalCity;

    @Column(name="beginningDate")
    private String beginningDate;

    @Column(name="country")
    private String country;

    @Column(name="departureCity")
    private String departureCity;

    @Column(name="departureDate")
    private String departureDate;

    @Column(name="departureTime")
    private String departureTime;

    @Column(name="directions")
    private String directions;

    @Column(name="endingDate")
    private String endingDate;

    @Column(name="flightCode")
    private int flightCode;

    @Column(name="programNumber")
    private int programNumber;

    @Column(name="tourNumber")
    private int tourNumber;

    @Column(name="tourType")
    private String tourType;

    public TourFlights() {
    }

    public TourFlights(String airLine, String arrivalCity, String beginningDate, String country, String departureCity, String departureDate, String departureTime, String directions, String endingDate, int flightCode, int programNumber, int tourNumber, String tourType) {
        this.airLine = airLine;
        this.arrivalCity = arrivalCity;
        this.beginningDate = beginningDate;
        this.country = country;
        this.departureCity = departureCity;
        this.departureDate = departureDate;
        this.departureTime = departureTime;
        this.directions = directions;
        this.endingDate = endingDate;
        this.flightCode = flightCode;
        this.programNumber = programNumber;
        this.tourNumber = tourNumber;
        this.tourType = tourType;
    }

    public int getIDtourFlights() {
        return IDtourFlights;
    }

    public void setIDtourFlights(int IDtourFlights) {
        this.IDtourFlights = IDtourFlights;
    }

    public String getAirLine() {
        return airLine;
    }

    public void setAirLine(String airLine) {
        this.airLine = airLine;
    }

    public String getArrivalCity() {
        return arrivalCity;
    }

    public void setArrivalCity(String arrivalCity) {
        this.arrivalCity = arrivalCity;
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

    public String getDepartureCity() {
        return departureCity;
    }

    public void setDepartureCity(String departureCity) {
        this.departureCity = departureCity;
    }

    public String getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(String departureDate) {
        this.departureDate = departureDate;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getDirections() {
        return directions;
    }

    public void setDirections(String directions) {
        this.directions = directions;
    }

    public String getEndingDate() {
        return endingDate;
    }

    public void setEndingDate(String endingDate) {
        this.endingDate = endingDate;
    }

    public int getFlightCode() {
        return flightCode;
    }

    public void setFlightCode(int flightCode) {
        this.flightCode = flightCode;
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
        return "TourFlights{" +
                "IDtourFlights=" + IDtourFlights +
                ", airLine='" + airLine + '\'' +
                ", arrivalCity='" + arrivalCity + '\'' +
                ", beginningDate='" + beginningDate + '\'' +
                ", country='" + country + '\'' +
                ", departureCity='" + departureCity + '\'' +
                ", departureDate='" + departureDate + '\'' +
                ", departureTime='" + departureTime + '\'' +
                ", directions='" + directions + '\'' +
                ", endingDate='" + endingDate + '\'' +
                ", flightCode=" + flightCode +
                ", programNumber=" + programNumber +
                ", tourNumber=" + tourNumber +
                ", tourType='" + tourType + '\'' +
                '}';
    }
}
