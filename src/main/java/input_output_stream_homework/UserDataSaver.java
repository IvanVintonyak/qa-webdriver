package input_output_stream_homework;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class UserDataSaver {
    public static void saveUserData(String path) {
        Scanner scanner = new Scanner(System.in);
       System.out.println("Enter your data \n\"If the user sends \"exit\" - the program should finish reading data from the console and save all the data to file. \n\"If the user sends \"write\" - the program should write all the data from the cache to file. ");
        String input = "";
        while (!input.equalsIgnoreCase("exit")) {
            input = scanner.nextLine();
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(path, true))) {
                if (input.equalsIgnoreCase("write")) {
                    writer.flush();
                }
                writer.write(input);
                writer.newLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        scanner.close();

    }
}
