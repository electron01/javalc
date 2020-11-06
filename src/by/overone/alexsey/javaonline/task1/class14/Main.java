package by.overone.alexsey.javaonline.task1.class14;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
/*        int[][] array = {{1, 2}, {3, 4}};
        Matrix matrix = new Matrix();
        matrix.setArray(array);
        try {
            matrix.addInteger(1);
            matrix.addInteger(2);
            matrix.addInteger(2);
        } catch (AddElementException e) {
            e.printStackTrace();

        */
        Matrix matrix = new Matrix();
        System.out.println(matrix.getNumber());
        //change number
        matrix.setNumber(100);
        System.out.println(matrix.getNumber());
        System.out.println("==========");
        File file = new File("test.txt");
        try (FileWriter writer = new FileWriter(file, false)) {
            String text = "Hello World!";
            writer.write(text);
            writer.append('\n');
            writer.append('E');
            writer.append('\n');
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        try (FileReader reader = new FileReader("test.txt")) {
            int c;
            while ((c = reader.read()) != -1) {

                System.out.print((char) c);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("===========");
        int i = 1;
        try (FileReader reader = new FileReader("test.txt")) {
            Scanner scanner = new Scanner(reader);
            while (scanner.hasNextLine()) {
                System.out.println(i + ":" + scanner.nextLine());
                i++;
            }

        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }

//*
        List<String> fileLines = Files.lines(Paths.get("test" + ".txt"))
                .flatMap(str -> Stream.of(str.split("\\n")))
                //String str = "Hello World! \n E \n"
                .collect(Collectors.toList());
        System.out.println(fileLines);


        List<String> fileNoteBookLines = Files.lines(Paths.get("notebook" + ".txt"))
                .flatMap(str -> Stream.of(str.split("\\n")))
                //String str = "Hello World! \n E \n"
                .collect(Collectors.toList());
        System.out.println(fileNoteBookLines);
        ArrayList<NoteBook> noteBooks = new ArrayList<>();
        for (String param: fileNoteBookLines){
            String[] setup = param.split(" ");
            NoteBook noteBook = new NoteBook(setup[0],Integer.parseInt(setup[1]),setup[2]);
            noteBooks.add(noteBook);
        }
        System.out.println(noteBooks);



    }
}
