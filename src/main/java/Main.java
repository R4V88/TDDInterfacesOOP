import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        String fileName = "Dane.txt";
        PrintWriter printWriter = new PrintWriter(fileName);
        printWriter.write("Wczytaj moj plik. ");
        printWriter.write("Obłsuguje je trudne plki!. ");
        printWriter.close();


    }
}
