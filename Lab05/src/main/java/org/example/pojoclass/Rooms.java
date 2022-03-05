package org.example.pojoclass;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="rooms")
public class Rooms {

    @Id
    @Column(name="IDrooms")
    private int IDrooms;

    @Column(name="place")
    private int place;

    @Column(name="arrivalDate")
    private String arrivalDate;

    @Column(name = "category")
    private String category;

    @Column(name="city")
    private String city;

    @Column(name="departureDate")
    private String departureDate;

    @Column(name="hotelName")
    private String hotelName;

    public Rooms() {
    }

    public Rooms(int place, String arrivalDate, String category, String city, String departureDate, String hotelName) {
        this.place = place;
        this.arrivalDate = arrivalDate;
        this.category = category;
        this.city = city;
        this.departureDate = departureDate;
        this.hotelName = hotelName;
    }

    public int getIDrooms() {
        return IDrooms;
    }

    public void setIDrooms(int IDrooms) {
        this.IDrooms = IDrooms;
    }

    public int getPlace() {
        return place;
    }

    public void setPlace(int place) {
        this.place = place;
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

    public String getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(String departureDate) {
        this.departureDate = departureDate;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    @Override
    public String toString() {
        return "Rooms{" +
                "IDrooms=" + IDrooms +
                ", place=" + place +
                ", arrivalDate='" + arrivalDate + '\'' +
                ", category='" + category + '\'' +
                ", city='" + city + '\'' +
                ", departureDate='" + departureDate + '\'' +
                ", hotelName='" + hotelName + '\'' +
                '}';
    }
}
