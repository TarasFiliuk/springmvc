package ua.com.owu.models;

import javax.persistence.*;

@Entity
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int eventId;

    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    Place place;
}
