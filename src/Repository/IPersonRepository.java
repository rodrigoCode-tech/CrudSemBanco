package Repository;

import Entity.Person;

import java.util.List;

public interface IPersonRepository {


    public boolean save(Person person);
    public boolean deleteById(int id);
    public List<Person> listPerson();
    public boolean change(Person person);
}
