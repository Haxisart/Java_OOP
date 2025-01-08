package Matrix;

public class ObjectPassing {
    static class Person {
        String name;
        int age;

        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }

    public static void updatePerson(Person person) {
        person.age += 1;
        System.out.println("Updated Person - Name: " + person.name + ", Age: " + person.age);
    }

    public static void displayPerson(Person person) {
        System.out.println("Person - Name: " + person.name + ", Age: " + person.age);
    }

    public static void main(String[] args) {
        Person person = new Person("John", 25);
        displayPerson(person);
        updatePerson(person);
        displayPerson(person);
    }
}
