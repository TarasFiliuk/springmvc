package ua.com.owu.models;

import org.joda.time.DateTime;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class UserOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int orderId;
    private DateTime start;
    private DateTime end;
    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private User user;
    @ManyToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private List<Manager> managers;
    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private PlaceTable placeTable;
}
