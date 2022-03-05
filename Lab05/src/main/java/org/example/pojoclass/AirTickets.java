package org.example.pojoclass;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="air_tickets")
public class AirTickets {

    @Id
    @Column(name="IDairTickets")
    private int idAirTickets;

    @Column(name="airline")
    private String airline;

    @Column(name="class")
    private String classColumn;

    @Column(name="fligheCode")
    private int flightCode;

    @Column(name="place")
    private int place;

    public AirTickets() {
    }

    public AirTickets(String airline, String classColumn, int flightCode, int place) {
        this.airline = airline;
        this.classColumn = classColumn;
        this.flightCode = flightCode;
        this.place = place;
    }

    public int getIdAirTickets() {
        return idAirTickets;
    }

    public void setIdAirTickets(int idAirTickets) {
        this.idAirTickets = idAirTickets;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public String getClassColumn() {
        return classColumn;
    }

    public void setClassColumn(String classColumn) {
        this.classColumn = classColumn;
    }

    public int getFlightCode() {
        return flightCode;
    }

    public void setFlightCode(int flightCode) {
        this.flightCode = flightCode;
    }

    public int getPlace() {
        return place;
    }

    public void setPlace(int place) {
        this.place = place;
    }

    @Override
    public String toString() {
        return "AirTickets{" +
                "idAirTickets=" + idAirTickets +
                ", airline='" + airline + '\'' +
                ", classColumn='" + classColumn + '\'' +
                ", flightCode=" + flightCode +
                ", place=" + place +
                '}';
    }
}
