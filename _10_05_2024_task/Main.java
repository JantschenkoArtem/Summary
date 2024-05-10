package org.example.summary._10_05_2024_task;

import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    //
    public static void main(String[] args) throws IOException {
        Scanner scanner=new Scanner(Path.of("Vocab.txt"));
        List<String>vocab=new ArrayList<>();
        while (scanner.hasNextLine()){
            vocab.add(scanner.nextLine());
        }
        System.out.println(vocab);
    }

}
