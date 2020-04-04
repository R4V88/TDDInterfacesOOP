import java.io.*;
import java.sql.SQLOutput;
import java.util.Scanner;

public class WriteReadFile {
    private Scanner scanner = new Scanner(System.in);

    public void writeNumbersToFile() throws IOException {
        int[] numbers = getNumbersFromUserInput();
        String fileName = "NumbersFromUserInput.txt";
        FileOutputStream fos = new FileOutputStream(fileName, true);
        PrintWriter pw = new PrintWriter(fos);
        for (int i = 0; i < numbers.length; i++) {
            pw.write("Id: " + i + ", wartość: " + numbers[i] + "\n");
        }
        pw.close();
    }

    public int[] getNumbersFromUserInput() {
        System.out.println("Podaj ilość liczb: ");
        int iloscLiczb = Integer.parseInt(scanner.nextLine());
        int[] liczby = new int[iloscLiczb];

        for (int i = 0; i < iloscLiczb; i++) {
            System.out.println("Podaj " + (i + 1) + " liczbe");
            liczby[i] = Integer.parseInt(scanner.nextLine());
        }
        return liczby;
    }
}
