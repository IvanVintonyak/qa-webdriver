package input_output_stream;

import java.io.*;

public class InputOutputStreamExample {
    public static void main(String[] args) {
        String path = "src/main/resources/testdata/";
        String fileName = "test.txt";
        String destination = path + "copy.txt";
        // String hugeFile = "C:\\Users\\Ivan\\IdeaProjects\\qa-webdriver\\src\\main\\resources\\testdata\\test.txt";
//        readFileViaByteArray(path + fileName);
//        readFileViaBufferedInputStream(path + fileName);
        //createFile(path, fileName);
//        checkReadingSpeed(new FileInputStream(hugeFile));
//        checkReadingSpeed(new BufferedInputStream(new FileInputStream(hugeFile)));
        //  redViaFileReader(path + fileName);
        copyFromOneFileToAnotherViaBufferedWriter(path + fileName, destination);
    }

    private static void copyFromOneFileToAnotherViaBufferedWriter(String source, String destination) {
        try (BufferedReader reader = new BufferedReader(new FileReader(source));
             BufferedWriter writer = new BufferedWriter(new FileWriter(destination))) {
            while (reader.ready()) {
                String line = reader.readLine();
                writer.write(line);
                writer.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
//    private static void createFile(String path, String fileName) throws IOException {
//        File dir = new File(path);
//        if(!dir.exists()){
//            dir.mkdirs();
//        }
//        File[] files =dir.listFiles();
//        File file =new File(dir, fileName);
//        if (files.length == 0){
//            file.createNewFile();
//        }
//    }

//
//    private static void readFileViaBufferedInputStream(String filePath) throws IOException {
//        FileInputStream fis = new FileInputStream(filePath);
//        BufferedInputStream bis = new BufferedInputStream(fis);
//
//        byte[] buffer = new byte[1024];
//        while (bis.available() > 0) {
//            bis.read(buffer);
//        }
//        System.out.println(new String(buffer));
//        fis.close();
//        bis.close();
//    }
//
//    public static void readFileViaByteArray(String filePath) throws IOException {
//        InputStream inputStream = new FileInputStream(filePath);
//
//        byte[] buffer = new byte[1024];
//        while (inputStream.available() > 0) {
//            inputStream.read(buffer);
//        }
//        System.out.println(new String(buffer));
//        inputStream.close();
//
//    }

//    public static void checkReadingSpeed(InputStream fileInputStream) throws IOException {
//        Date startDate = new Date();
//
//        int i;
//
//        while ((i = fileInputStream.read()) !=-1){
//            //print or save
//        }
//        System.out.println("====================================== " );
//
//        Date endDate = new Date();
//
//        System.out.println(endDate.getTime() - startDate.getTime());
//        fileInputStream.close();
//
//    }

//        public static void redViaFileReader (String source){
//            try (BufferedReader reader = new BufferedReader(new FileReader(source))) {
//                while (reader.ready()) {
//                    String s = reader.readLine();
//                    System.out.println(s);
//                }
//
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }
//
//        }
    }
}
