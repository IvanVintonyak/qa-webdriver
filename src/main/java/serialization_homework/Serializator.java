package serialization_homework;

import java.io.*;

public class Serializator {
    private static final File FILE = new File("src/main/java/serialization_homework/person.dat");

    public boolean serialize(Person person) {
        boolean bo = false;
        try (FileOutputStream fileOutput = new FileOutputStream(FILE);
             ObjectOutputStream objectOutput = new ObjectOutputStream(fileOutput)) {
            objectOutput.writeObject(person);
            System.out.println("Person serialized");
            bo = true;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return bo;

    }

    public Person deserialize() throws IOException, ClassNotFoundException {
        Person person = null;
        FileInputStream inputFile = new FileInputStream(FILE);
        ObjectInputStream inputObject = new ObjectInputStream(inputFile);

        person = (Person) inputObject.readObject();
        System.out.println("Person deserialized");
        return person;
    }
}
