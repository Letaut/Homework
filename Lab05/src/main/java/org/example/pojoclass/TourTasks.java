package org.example.pojoclass;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tourtasks")
public class TourTasks {

    @Id
    @Column(name="IDtourTasks")
    private int IDtourTasks;

    @Column(name="beginningDate")
    private String beginningDate;

    @Column(name="country")
    private String country;

    @Column(name="deadline")
    private String deadline;

    @Column(name="description")
    private String description;

    @Column(name="endingDate")
    private String endingDate;

    @Column(name="PassportID")
    private int passwortID;

    @Column(name="programNumber")
    private int programNumber;

    @Column(name="taskNumber")
    private int taskNumber;

    @Column(name="taskStatus")
    private boolean taskStatus;

    @Column(name="tourNumber")
    private int tourNumber;

    @Column(name="tourType")
    private String tourType;

    public TourTasks() {
    }

    public TourTasks(String beginningDate, String country, String deadline, String description, String endingDate, int passwortID, int programNumber, int taskNumber, boolean taskStatus, int tourNumber, String tourType) {
        this.beginningDate = beginningDate;
        this.country = country;
        this.deadline = deadline;
        this.description = description;
        this.endingDate = endingDate;
        this.passwortID = passwortID;
        this.programNumber = programNumber;
        this.taskNumber = taskNumber;
        this.taskStatus = taskStatus;
        this.tourNumber = tourNumber;
        this.tourType = tourType;
    }

    public int getIDtourTasks() {
        return IDtourTasks;
    }

    public void setIDtourTasks(int IDtourTasks) {
        this.IDtourTasks = IDtourTasks;
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

    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
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

    public int getPasswortID() {
        return passwortID;
    }

    public void setPasswortID(int passwortID) {
        this.passwortID = passwortID;
    }

    public int getProgramNumber() {
        return programNumber;
    }

    public void setProgramNumber(int programNumber) {
        this.programNumber = programNumber;
    }

    public int getTaskNumber() {
        return taskNumber;
    }

    public void setTaskNumber(int taskNumber) {
        this.taskNumber = taskNumber;
    }

    public boolean isTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(boolean taskStatus) {
        this.taskStatus = taskStatus;
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
        return "TourTasks{" +
                "IDtourTasks=" + IDtourTasks +
                ", beginningDate='" + beginningDate + '\'' +
                ", country='" + country + '\'' +
                ", deadline='" + deadline + '\'' +
                ", description='" + description + '\'' +
                ", endingDate='" + endingDate + '\'' +
                ", passwortID=" + passwortID +
                ", programNumber=" + programNumber +
                ", taskNumber=" + taskNumber +
                ", taskStatus=" + taskStatus +
                ", tourNumber=" + tourNumber +
                ", tourType='" + tourType + '\'' +
                '}';
    }


}
