package org.example.pojoclass;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="eventtickets")
public class EventTickets {

    @Id
    @Column(name="IDeventTickets")
    private int IDeventTickets;

    @Column(name="place")
    private int place;

    @Column(name="eventPlace")
    private String eventPlace;

    @Column(name="city")
    private String city;

    @Column(name="beginningDate")
    private String beginningDate;

    @Column(name="beginningTime")
    private String beginningTime;

    public EventTickets() {
    }

    public EventTickets(int place, String eventPlace, String city, String beginningDate, String beginningTime) {
        this.place = place;
        this.eventPlace = eventPlace;
        this.city = city;
        this.beginningDate = beginningDate;
        this.beginningTime = beginningTime;
    }

    public int getIDeventTickets() {
        return IDeventTickets;
    }

    public void setIDeventTickets(int IDeventTickets) {
        this.IDeventTickets = IDeventTickets;
    }

    public int getPlace() {
        return place;
    }

    public void setPlace(int place) {
        this.place = place;
    }

    public String getEventPlace() {
        return eventPlace;
    }

    public void setEventPlace(String eventPlace) {
        this.eventPlace = eventPlace;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
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

    @Override
    public String toString() {
        return "EventTickets{" +
                "IDeventTickets=" + IDeventTickets +
                ", place=" + place +
                ", eventPlace='" + eventPlace + '\'' +
                ", city='" + city + '\'' +
                ", beginningDate='" + beginningDate + '\'' +
                ", beginningTime='" + beginningTime + '\'' +
                '}';
    }
}
