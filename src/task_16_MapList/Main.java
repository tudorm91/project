package task_16_MapList;

public class Main {
    public static void main(String[] args) {
        PeopleAge manager = new PeopleAge();

        manager.addPerson(new Person("Alina", 44));
        manager.addPerson(new Person("John", 20));
        manager.addPerson(new Person("Cherry", 40));
        manager.addPerson(new Person("Cabron", 15));
        manager.addPerson(new Person("Pedro", 71));

        manager.displayPeople();

        System.out.println("Cabron's age is " + manager.findAge("Cabron"));
        manager.removePerson("Cherry");

        System.out.println("After deletion:");
        manager.displayPeople();
    }
}
