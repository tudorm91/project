package task_16_MapList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PeopleAge {
    private List<Person> peopleNames;
    private Map<String, Integer> ageMap;

    public PeopleAge() {
        peopleNames = new ArrayList<>();
        ageMap = new HashMap<>();
    }

    public void addPerson(Person person) {
        peopleNames.add(person);
        ageMap.put(person.getName(), person.getAge());
    }

    public void removePerson(String name) {
        peopleNames.removeIf(person -> person.getName().equals(name));
        ageMap.remove(name);
    }

    public void displayPeople() {
        System.out.println("Peoples are:");
        for (Person person : peopleNames) {
            System.out.println(person);
        }
    }

    public int findAge(String name) {
        return ageMap.getOrDefault(name, -1);
    }
}
