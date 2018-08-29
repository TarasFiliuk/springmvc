package ua.com.owu.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.com.owu.models.Person;

@Repository
public interface PersonDAO extends JpaRepository<Person,Integer> {
    Person findByUsername(String username);
}
