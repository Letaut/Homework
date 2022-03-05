package org.example.pojoclass;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="program")
public class Program {

    @Id
    @Column(name="IDprogram")
    private int IDprogram;

    @Column(name="description")
    private String description;

    public Program() {
    }

    public Program(String description) {
        this.description = description;
    }

    public int getIDprogram() {
        return IDprogram;
    }

    public void setIDprogram(int IDprogram) {
        this.IDprogram = IDprogram;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Program{" +
                "IDprogram=" + IDprogram +
                ", description='" + description + '\'' +
                '}';
    }
}
