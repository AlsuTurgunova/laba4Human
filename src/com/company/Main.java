package com.company;

/**
 * @author Alsu
 *
 */

import com.opencsv.CSVReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.List;
import java.util.Scanner;

//"C:\\Users\\alsut\\IdeaProjects\\Laba4\\src\\Work\\foreign_names.csv"
public class Main {
    public static  void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the directory to the desired file, including the csv file itself -> ");
        String directory = scanner.next();
        try {
        FileReader file = new FileReader(directory);
        CSVReader reader = new CSVReader(file, ';');
        String[] column;
        List<Human> person = new ArrayList<>();

        while ((column = reader.readNext()) != null) {
            Random rand = new Random();
            int genId = rand.nextInt(25000);
            person.add(new Human(column[0], column[1], column[2], column[5], column[3], column[4], genId));

        }

        System.out.println(person.toString());
    }
        catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
