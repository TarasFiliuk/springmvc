package ua.com.owu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.com.owu.dao.PersonDAO;
import ua.com.owu.models.Person;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class PersonServiceImpl implements PersonService{

    @Autowired
    PersonDAO personDAO;

    public List<Person> findAll() {
        return personDAO.findAll();
    }

    @Override
    public Optional<Person> findById(int id) {
        return Optional.ofNullable(personDAO.findOne(id));
    }

    public void save(Person person) {
        personDAO.save(person);

    }

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        Person byUsername = personDAO.findByUsername(s);
        return byUsername;
    }
}
