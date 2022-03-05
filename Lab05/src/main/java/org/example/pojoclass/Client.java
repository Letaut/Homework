package org.example.pojoclass;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="client")
public class Client {

    @Id
    @Column(name="IDclient")
    private int IDclient;

    @Column(name="fullName")
    private String fullName;

    @Column(name="address")
    private String address;

    @Column(name="phoneNumber")
    private int phoneNumber;

    public Client() {
    }

    public Client(String fullName, String address, int phoneNumber) {
        this.fullName = fullName;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public int getIDclient() {
        return IDclient;
    }

    public void setIDclient(int IDclient) {
        this.IDclient = IDclient;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Client{" +
                "IDclient=" + IDclient +
                ", fullName='" + fullName + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}
