package person.service;

import person.domain.Person;

import javax.jws.WebService;

@WebService
public class PersonServiceImpl implements PersonService {


    @Override
    public Person getPersonById(String id) {


            return new Person("1", "Conor Macgregor");

    }
}
