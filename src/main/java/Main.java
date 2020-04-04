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

//        //inny przykład
//        int[] numbers = {1, 2, 5, 2, 1};
//        String fileName2 = "Liczby.txt ";
//        printWriter = new PrintWriter(fileName2);
//        for (int i = 0; i < numbers.length; i++) {
//            printWriter.write("Jestem liczbą numer: " + i + ", a moja wartość to: " +
//                    //\n dodaje znak konca linii dlatego tresc nie jest zapisana w "ciągu".
//                    numbers[i] + "\n");
//        }
        printWriter.close();

        //dopisanie do pliku  true(dopisanie), false(nadpisanie).
        int[] numbersTab = {1, 2, 3, 4, 5};
        String fileName3 = "Liczby.txt";
        FileOutputStream fos = new FileOutputStream(fileName3, true);
        PrintWriter pw = new PrintWriter(fos);
        for(int i = 0; i< numbersTab.length; i++){
            pw.write("Jestem liczba numer: " + i + ", a moja wartosc to: " +
                    numbersTab[i] + "\n");
        }
        pw.close();

        //wczytywanie pliku z wieloma liniami tekstu (całego pliku);
        FileReader fw = new FileReader(fileName3);
        BufferedReader reader = new BufferedReader(fw);
        String readOneLineFromInputFile = reader.readLine();
        while(readOneLineFromInputFile != null) {
            System.out.println("Wczytalem wartosc: " + readOneLineFromInputFile);
            readOneLineFromInputFile = reader.readLine();
        }
        reader.close();

        WriteReadFile writeReadFile = new WriteReadFile();
        writeReadFile.writeNumbersToFile();

    }
}
