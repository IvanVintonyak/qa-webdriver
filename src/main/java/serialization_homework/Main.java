package serialization_homework;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Person Person = new Person("Ivan", 32, new Pet("Bob"));

        Serializator serializator = new Serializator();
        serializator.serialize(Person);

        Person Person2 = serializator.deserialize();
        System.out.println("Person: " + "\nName: " + Person2.getName() + "; " + "Years: " + Person2.getAge() + "; " + "Pet: " + Person2.getPet().getName() + ";");
    }
}
