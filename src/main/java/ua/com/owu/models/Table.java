package ua.com.owu.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class Table {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int tableId;
    private int capacity;/*кількість людей*/
    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY,mappedBy = "table")
    List<Order> orders;

    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    Place place;

    public Table() {
    }

    public Table(int capacity) {
        this.capacity = capacity;
    }

    public Table(int capacity, List<Order> orders, Place place) {
        this.capacity = capacity;
        this.orders = orders;
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
        return "Table{" +
                "tableId=" + tableId +
                ", capacity=" + capacity +
                '}';
    }
}
