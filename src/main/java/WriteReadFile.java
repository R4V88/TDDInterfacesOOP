import model.Student;

import java.io.*;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WriteReadFile {
    private Scanner scanner = new Scanner(System.in);

    //5 -------------------------------------------------------------------------------------------------
    public void writeStudentToFile() throws FileNotFoundException {
        List<Student> students = addStudents();
        String filename = "Students.txt";
        PrintWriter pw = new PrintWriter(new FileOutputStream(filename), true);
        for(Student student : students){
            pw.write(student.toString() + "\n");
        }
        pw.close();
    }

    public List<Student> addStudents() {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Teodor", "Teodorowicz", 50));
        students.add(new Student(2, "Michał", "Michałowicz", 51));
        students.add(new Student(3, "Karolina", "Karolowicz", 52));
        students.add(new Student(4, "Katarzyna", "Katarynowicz", 53));
        return students;
    }

    //4 -------------------------------------------------------------------------------------------------
    public void readNamesAndSurnames() throws IOException {
        List<String> namesAndSurnames = new ArrayList<>();
        BufferedReader bw = new BufferedReader(new FileReader("NamesAndSurnames.txt"));
        String nameAndSurname;
        ;
        while ((nameAndSurname = bw.readLine()) != null) {
            namesAndSurnames.add(nameAndSurname);
        }
        bw.close();
        System.out.println("Suma Imion i Nazwisk(linie): " + namesAndSurnames.size() + "\n");
        for (String nAndS : namesAndSurnames) {
            System.out.println("Imie i Nazwisko: " + nAndS);
        }
    }

    //3 -------------------------------------------------------------------------------------------------
    public void printSum() throws IOException {
        int[] numbers = getNumbersWithCount();
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println(sum);
    }

    public int[] getNumbersWithCount() throws IOException {
        String fileName = "NumbersWithCount.txt";
        FileReader fw = new FileReader(fileName);
        BufferedReader bw = new BufferedReader(fw);
        int[] numbers = new int[Integer.parseInt(bw.readLine())];
        int iterator = 0;
        while (iterator < numbers.length) {
            numbers[iterator] = Integer.parseInt(bw.readLine());
            iterator++;
        }
        bw.close();
        return numbers;
    }

    //Najpierw trzeba stworzyc plik, ktory na poczatku ma informacje na temat ilosc liczb (wierszy) dopiero mozna
    //wykonywac na nim operacje odczytu powyzszymi dwiema metodami ^^^^^^^^^^^^^^!
    public void writeNumbersWithCount() throws FileNotFoundException {
        int[] numbers = getNumbersFromUserInput();
        String fileName = "NumbersWithCount.txt";
        FileOutputStream fos = new FileOutputStream(fileName, false);
        PrintWriter pw = new PrintWriter(fos);

        pw.write(numbers.length + "\n");
        for (int i = 0; i < numbers.length; i++) {
            pw.write(numbers[i] + "\n");
        }
        pw.close();
    }

    //2 -------------------------------------------------------------------------------------------------
    public void writeNamesToFile() throws IOException {
        String[] names = getStringsFromUserInput();
        if (names.length != 0) {
            String fileName = "Names.txt";
            FileOutputStream fos = new FileOutputStream(fileName, true);
            PrintWriter pw = new PrintWriter(fos);
            for (int i = 0; i < names.length; i++) {
                pw.write("Podano imię: " + names[i] + "\n");
            }
            pw.close();
        }
    }

    public String[] getStringsFromUserInput() {
        System.out.println("Podaj ilość słów: ");
        int iloscSlow = Integer.parseInt(scanner.nextLine());
        String[] slowa = new String[iloscSlow];

        for (int i = 0; i < iloscSlow; i++) {
            System.out.println("Podaj " + (i + 1) + " słowo");
            slowa[i] = scanner.nextLine();
        }
        return slowa;
    }

    //1 -------------------------------------------------------------------------------------------------
    public void writeNumbersToFile() throws IOException {
        int[] numbers = getNumbersFromUserInput();
        if (numbers.length != 0) {
            String fileName = "NumbersFromUserInput.txt";
            FileOutputStream fos = new FileOutputStream(fileName, true);
            PrintWriter pw = new PrintWriter(fos);
            for (int i = 0; i < numbers.length; i++) {
                pw.write("Id: " + i + ", wartość: " + numbers[i] + "\n");
            }
            pw.close();
        }
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
