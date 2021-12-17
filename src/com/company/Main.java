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

public class Main {
    public static  void main(String[] args) throws IOException {

        FileReader file = new FileReader("C:\\Users\\alsut\\IdeaProjects\\Laba4\\src\\Work\\foreign_names.csv");
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
}
