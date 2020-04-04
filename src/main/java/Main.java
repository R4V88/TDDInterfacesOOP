import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        //Zapis pliku
        String fileName = "Dane.txt";
        PrintWriter printWriter = new PrintWriter(fileName);
        printWriter.write("Zapisz moj plik. ");
        printWriter.write("Obłsuguje pliki tekstowe!. ");
        printWriter.close();

        //Odczyt pliku
        FileReader fileReader = new FileReader(fileName);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String readOneLineFromFile = bufferedReader.readLine();
        bufferedReader.close();
        bufferedReader.close();
        System.out.println("Wczytałem: " + readOneLineFromFile);

    }
}
