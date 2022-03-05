package org.example.pojoclass;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tour")
public class Tour {

    @Id
    @Column(name="IDtour")
    private int IDtour;

    @Column(name="beginningDate")
    private String beginningDate;

    @Column(name="country")
    private String country;

    @Column(name="description")
    private String description;

    @Column(name="endingDate")
    private String endingDate;

    @Column(name="programNumber")
    private String programNumber;

    @Column(name="tourStatus")
    private String tourStatus;

    @Column(name="tourType")
    private String tourType;

    public Tour() {
    }

    public Tour(String beginningDate, String country, String description, String endingDate, String programNumber, String tourStatus, String tourType) {
        this.beginningDate = beginningDate;
        this.country = country;
        this.description = description;
        this.endingDate = endingDate;
        this.programNumber = programNumber;
        this.tourStatus = tourStatus;
        this.tourType = tourType;
    }

    public int getIDtour() {
        return IDtour;
    }

    public void setIDtour(int IDtour) {
        this.IDtour = IDtour;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getEndingDate() {
        return endingDate;
    }

    public void setEndingDate(String endingDate) {
        this.endingDate = endingDate;
    }

    public String getProgramNumber() {
        return programNumber;
    }

    public void setProgramNumber(String programNumber) {
        this.programNumber = programNumber;
    }

    public String getTourStatus() {
        return tourStatus;
    }

    public void setTourStatus(String tourStatus) {
        this.tourStatus = tourStatus;
    }

    public String getTourType() {
        return tourType;
    }

    public void setTourType(String tourType) {
        this.tourType = tourType;
    }

    @Override
    public String toString() {
        return "Tour{" +
                "IDtour=" + IDtour +
                ", beginningDate='" + beginningDate + '\'' +
                ", country='" + country + '\'' +
                ", description='" + description + '\'' +
                ", endingDate='" + endingDate + '\'' +
                ", programNumber='" + programNumber + '\'' +
                ", tourStatus='" + tourStatus + '\'' +
                ", tourType='" + tourType + '\'' +
                '}';
    }
}
