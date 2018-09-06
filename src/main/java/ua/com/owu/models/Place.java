package ua.com.owu.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class Place {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int placeId;
    private String name;
    private String adress;
    private String city;
    private String specification;
    @OneToMany
    List<Manager> managers;

    @OneToMany
    List<Table> tables;

    @OneToMany
    List<Event> events;


    public Place() {
    }

    public Place(String name, String adress, String city, String specification) {
        this.name = name;
        this.adress = adress;
        this.city = city;
        this.specification = specification;
    }

    public Place(String name, String adress, String city, String specification, List<Manager> managers, List<Table> tables, List<Event> events) {
        this.name = name;
        this.adress = adress;
        this.city = city;
        this.specification = specification;
        this.managers = managers;
        this.tables = tables;
        this.events = events;
    }

    public int getPlaceId() {
        return placeId;
    }

    public void setPlaceId(int placeId) {
        this.placeId = placeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    public List<Manager> getManagers() {
        return managers;
    }

    public void setManagers(List<Manager> managers) {
        this.managers = managers;
    }

    public List<Table> getTables() {
        return tables;
    }

    public void setTables(List<Table> tables) {
        this.tables = tables;
    }

    public List<Event> getEvents() {
        return events;
    }

    public void setEvents(List<Event> events) {
        this.events = events;
    }

    @Override
    public String toString() {
        return "Place{" +
                "placeId=" + placeId +
                ", name='" + name + '\'' +
                ", adress='" + adress + '\'' +
                ", city='" + city + '\'' +
                ", specification='" + specification + '\'' +
                '}';
    }
}
