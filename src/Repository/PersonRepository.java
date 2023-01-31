package Repository;

import Entity.Person;

import java.util.ArrayList;
import java.util.List;

public class PersonRepository implements IPersonRepository{

    List<Person> personList = new ArrayList<Person>();
    @Override
    public boolean save(Person person) {

        try {
            personList.add(person);
        }catch (Exception e){
            return false;
        }
        return true;
    }

    @Override
    public boolean delete(int id) {
        for(Person person: personList){
            if (person.getId()==id){
                personList.remove(person);
            }
        }
        return false;
    }

    @Override
    public List<Person> listPerson() {
        return this.personList;
    }

    @Override
    public boolean change(Person person) {
        for(Person person1: personList){
            if (person1.getId() == person.getId()){
                personList.remove(person1);
                personList.add(person);
            }
        }
        return false;
    }
}
