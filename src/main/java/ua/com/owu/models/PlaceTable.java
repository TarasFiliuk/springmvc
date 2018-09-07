package ua.com.owu.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class PlaceTable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int tableId;
    private int capacity;/*кількість людей*/
    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY,mappedBy = "placeTable")
    List<UserOrder> userOrders;

    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    Place place;

    public PlaceTable() {
    }

    public PlaceTable(int capacity) {
        this.capacity = capacity;
    }

    public PlaceTable(int capacity, List<UserOrder> userOrders, Place place) {
        this.capacity = capacity;
        this.userOrders = userOrders;
        this.place = place;
    }

    public int getTableId() {
        return tableId;
    }

    public void setTableId(int tableId) {
        this.tableId = tableId;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "PlaceTable{" +
                "tableId=" + tableId +
                ", capacity=" + capacity +
                '}';
    }
}