package ua.com.owu.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString(exclude = {"people","authors"})
@Getter
public class Books {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String namebook;
    @ManyToMany(
            fetch = FetchType.LAZY,
            mappedBy = "books"
    )
    private List<Author> authors;
    @ManyToOne(fetch =  FetchType.LAZY)
    private Person people;


}
