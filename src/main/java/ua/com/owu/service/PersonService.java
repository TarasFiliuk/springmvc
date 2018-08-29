package ua.com.owu.service;


import org.springframework.security.core.userdetails.UserDetailsService;
import ua.com.owu.models.Person;

import java.util.List;
import java.util.Optional;


public interface PersonService extends UserDetailsService {

    List<Person> findAll();
    Optional<Person> findById(int id);
    void save(Person person);

}
