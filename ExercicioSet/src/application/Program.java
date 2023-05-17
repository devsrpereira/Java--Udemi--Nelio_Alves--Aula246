package application;

import entities.Line;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import java.util.Set;

public class Program {
    public static void main(String[] args) {
        String path = "..\\input.txt";
        Set<Line> lineSet = new HashSet<>();
        DateTimeFormatter datefmt = DateTimeFormatter.ISO_ZONED_DATE_TIME;
        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            String line = br.readLine();
            System.out.println("Itens no conjunto lineSet:");

            int logs = 0;

            while(line != null){
                String [] field = line.split(" ");
                String name = field[0];
                LocalDateTime moment = LocalDateTime.parse(field[1], datefmt);

                Line obj = new Line(name,moment);
                lineSet.add(obj);
                logs ++;

                System.out.println(obj);
                line = br.readLine();
            }

            System.out.println();
            System.out.println("Total of logs: " + logs);
            System.out.println("Total of users: " + lineSet.size());
        }
        catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
