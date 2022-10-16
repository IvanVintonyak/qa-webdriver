package input_output_stream;

import java.io.File;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) {
        String path = "src/main/resources/testdata/";
        String bigPath = "C:\\Users\\Ivan\\IdeaProjects\\qa-webdriver\\src\\main\\resources\\testdata\\test_data.yaml";


        File testdata = new File(path);
        File test_data_yaml = new File(bigPath);
        System.out.println(testdata.exists());
        System.out.println(test_data_yaml.exists());



        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");

        System.out.println("Last modified at : " + simpleDateFormat.format(test_data_yaml.lastModified()));

    }
}
