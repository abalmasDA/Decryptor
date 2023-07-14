import java.io.*;
import java.util.Scanner;

/**
 * Напишіть жартівливу програму «Дешифратор», яка в текстовому файлі могла б замінити всі прийменники на слово «Java».
 * * Завдання із зірочкою - перезаписати вміст файлу
 */

public class Main {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = null;
        String textWithJava = "";

        try {
            File fileToScan = new File("C:\\Users\\abalm\\odrive\\Google Drive IT\\IteaJavaPro\\Decryptor\\src\\SomeFile.txt");
            Scanner textScanner = textScanner = new Scanner(fileToScan);
            while (textScanner.hasNextLine()) {
                String word = textScanner.nextLine();
                textWithJava += word.replaceAll("\\b[ВвуУз]\\b", "Java") + "\n";
            }
            System.out.println("Файл змінений!");
            textScanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            fileWriter = new FileWriter("C:\\Users\\abalm\\odrive\\Google Drive IT\\IteaJavaPro\\Decryptor\\src\\SomeFile.txt");
            for (int i = 0; i < textWithJava.length(); i++) {
                fileWriter.write(textWithJava.charAt(i));
            }
            System.out.println("Файл записаний!");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            fileWriter.close();
        }


    }
}
