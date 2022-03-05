package org.example.pojoclass;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="hotelclass")
public class HotelClass {

    @Id
    @Column(name="class")
    private String hotelClass;

    public HotelClass() {
    }

    public HotelClass(String hotelClass) {
        this.hotelClass = hotelClass;
    }

    public String getHotelClass() {
        return hotelClass;
    }

    public void setHotelClass(String hotelClass) {
        this.hotelClass = hotelClass;
    }

    @Override
    public String toString() {
        return "HotelClass{" +
                "hotelClass='" + hotelClass + '\'' +
                '}';
    }
}
