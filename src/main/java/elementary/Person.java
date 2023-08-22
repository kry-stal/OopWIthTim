package elementary;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Person {
    public static void main(String[] args) {
        Scanner scannerAge = new Scanner(System.in);
        LocalDate todaysDate = LocalDate.now();
        System.out.println("PLEASE ENTER YOUR D.O.B IN FORMAT YY-MM-DD: ");
        String dob = scannerAge.nextLine();
        LocalDate dobParse = LocalDate.parse(dob);
        int studentsAge = Period.between(dobParse, todaysDate).getYears();
        System.out.println(studentsAge);
    }
}

//        System.out.println(prompt);
//        System.out.println("(1=Wes Gibbins) (2=Kainene) (3=Richard ChurchHill): ");
//        int choice = scanner.nextInt();
//
//        if (choice == 1)
//    }



