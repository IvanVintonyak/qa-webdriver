package input_output_stream_homework;

public class Main {
    final static String PATH = "src/main/java/input_output_stream_homework/user.txt";

    public static void main(String[] args) {
        UserDataSaver saver = new UserDataSaver();
        saver.saveUserData(PATH);

        UserDataReader reader = new UserDataReader();
        reader.readUserData(PATH);
    }

}
