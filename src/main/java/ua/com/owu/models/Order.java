package ua.com.owu.models;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Entity
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int orderId;
    private Date date;

    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private User user;
    @ManyToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private List<Manager>managers;
    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private Table table;
}
