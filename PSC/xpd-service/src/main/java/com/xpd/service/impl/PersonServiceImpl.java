package com.xpd.service.impl;

import com.xpd.commons.exception.XPDException;
import com.xpd.model.Person;
import com.xpd.persistence.PersonRepository;
import com.xpd.service.PersonService;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PersonServiceImpl implements PersonService {

    @Resource
    private PersonRepository personRepository;

    @Transactional
    public Person create(Person person) {
        Person createdPerson = person;
        return personRepository.save(createdPerson);
    }

    @Transactional(rollbackFor = XPDException.class)
    public Person delete(Long id) throws XPDException {
        Person deletedPerson = personRepository.findOne(id);
        if (deletedPerson == null) {
            throw new XPDException();
        }
        personRepository.delete(deletedPerson);
        return deletedPerson;
    }

    public List<Person> findAll() {
        return personRepository.findAll();
    }

    @Transactional(rollbackFor = XPDException.class)
    public Person update(Person person) throws XPDException {
        Person updatedPerson = personRepository.findOne(person.getId());
        if (updatedPerson == null) {
            throw new XPDException();
        }
        updatedPerson.setName(person.getName());
        updatedPerson.setLocation(person.getLocation());
        return updatedPerson;
    }

    @Transactional
    public Person findById(Long id) {
        return personRepository.findOne(id);
    }

}
