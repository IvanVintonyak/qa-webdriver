package ua.it.ui.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class DataProvider {
    private static final List<String> userNames = Arrays.asList("Bob", "Ben", "Bin", "Sarah" );


    public static  String getUserName(){
        Random random = new Random();
        return userNames.get(random.nextInt(userNames.size()));
    }


    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(DataProvider.getUserName());
            
        }

    }
}
