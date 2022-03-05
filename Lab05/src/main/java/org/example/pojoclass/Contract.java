package org.example.pojoclass;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="contract")
public class Contract {

    @Id
    @Column(name="IDcontract")
    private int IDcontract;

    @Column(name="agreementDate")
    private String agreementDate;

    @Column(name="beginningDate")
    private String beginningDate;

    @Column(name="clientAddress")
    private String clientAddress;

    @Column(name="clientFullName")
    private String clientFullName;

    @Column(name="country")
    private String country;

    @Column(name="endingDate")
    private String endingDate;

    @Column(name="programNumber")
    private int programNumber;

    @Column(name="tourNumber")
    private int tourNumber;

    @Column(name="tourType")
    private String tourType;

    public Contract() {
    }

    public Contract(String agreementDate, String beginningDate, String clientAddress, String clientFullName, String country, String endingDate, int programNumber, int tourNumber, String tourType) {
        this.agreementDate = agreementDate;
        this.beginningDate = beginningDate;
        this.clientAddress = clientAddress;
        this.clientFullName = clientFullName;
        this.country = country;
        this.endingDate = endingDate;
        this.programNumber = programNumber;
        this.tourNumber = tourNumber;
        this.tourType = tourType;
    }

    public int getIDcontract() {
        return IDcontract;
    }

    public void setIDcontract(int IDcontract) {
        this.IDcontract = IDcontract;
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
        return "Contract{" +
                "IDcontract=" + IDcontract +
                ", agreementDate='" + agreementDate + '\'' +
                ", beginningDate='" + beginningDate + '\'' +
                ", clientAddress='" + clientAddress + '\'' +
                ", clientFullName='" + clientFullName + '\'' +
                ", country='" + country + '\'' +
                ", endingDate='" + endingDate + '\'' +
                ", programNumber=" + programNumber +
                ", tourNumber=" + tourNumber +
                ", tourType='" + tourType + '\'' +
                '}';
    }
}
