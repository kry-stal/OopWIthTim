package elementary;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Students {
    private String firstName;
    private String surname;
    private String dob;
    private boolean passedEntranceExams;
    private int entryYear;
    private boolean studentType;
    private String major;
    private String year;
    private int studentIdNo;
    private boolean studentInfoComplete;

    public String getFirstName() {
        return firstName;
    }

    public int getEntryYear() {
        return entryYear;
    }

    public boolean isPassedEntranceExams() {
        return passedEntranceExams;
    }

    public String getDob() {
        return dob;
    }

    public boolean isStudentType() {
        return studentType;
    }

    public String getSurname() {
        return surname;
    }

    public String getYear() {
        return year;
    }

    public String getMajor() {
        return major;
    }

    public int getStudentIdNo() {
        return studentIdNo;
    }

    public boolean isStudentInfoComplete() {
        return studentInfoComplete;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setEntryYear(int entryYear) {
        this.entryYear = entryYear;
    }

    public void setStudentType(boolean studentType) {
        this.studentType = studentType;
    }

    public void setStudentIdNo(int studentIdNo) {
        this.studentIdNo = studentIdNo;
    }

    public void setMajor(String major) {
        if (entryYear == 2023) {
            this.major = "Not Applicable";
        } else {
            String lowercaseMajor = major.toLowerCase();
            switch (lowercaseMajor) {
                case "science", "art", "commercial", "social science" -> this.major = major;
                default -> this.major = "Error: Major Undeclared";
            }
        }
    }

    public String setYear() {
        this.year = switch (entryYear) {
            case 2018 -> "Final Year";
            case 2019 -> "10th Grade";
            case 2020 -> "9th Grade";
            case 2021 -> "8th Grade";
            case 2022 -> "7th Grade";
            case 2023 -> "6th Grade";
            default -> "INVALID";
        };
        return this.year;
    }

    public Students(String firstName, String surname, String dob,
                    int entryYear, boolean studentType, String major, String year,
                    int studentIdNo) {
        this.firstName = firstName;
        this.surname = surname;
        this.dob = dob;
        this.entryYear = entryYear;
        this.studentType = studentType;
        this.major = major;
        this.year = year;
        this.studentIdNo = studentIdNo;

    }

    public void setDob() {
        Scanner scannerAge = new Scanner(System.in);
        LocalDate todaysDate = LocalDate.now();
//        System.out.println("PLEASE ENTER YOUR D.O.B IN FORMAT YY-MM-DD: ");
//        String dob = scannerAge.nextLine();
        LocalDate dobParse = LocalDate.parse(getDob());
        String studentsAge = String.valueOf(Period.between((dobParse), (todaysDate)).getYears());
        this.dob = String.valueOf(Integer.parseInt(studentsAge));
        System.out.println();
        scannerAge.close();
    }

        public void setPassedEntranceExams ( boolean passedEntranceExams){
            this.passedEntranceExams = passedEntranceExams;
        }

//    public void calculateAge(){
//        Scanner scannerAge = new Scanner(System.in);
//        LocalDate todaysDate = LocalDate.now();
//        System.out.println("PLEASE ENTER YOUR D.O.B IN FORMAT YY-MM-DD: ");
//        String dob = scannerAge.nextLine();
//        LocalDate dobParse = LocalDate.parse(dob);
//        int studentsAge = Period.between(dobParse, todaysDate).getYears();
//        System.out.println(studentsAge);
//        this.age = studentsAge;
//    }


        public void StudentInformation () {
            if (entryYear <= 2017 || entryYear == 0) {
                System.out.println("STUDENT IS NOT CURRENTLY ENROLLED");
            } else {
                System.out.println("STUDENT INFORMATION: \n" +
                        "Full Name: " + firstName + " " + surname + "\n" +
                        "Age: " + dob + " Years Old" + "\n" +
                        "Current Student Year: " + year + "\n" +
                        "Entry Year: " + entryYear + "\n" +
                        //  "Student ID No.: " + uniqueIdNo + "\n" +
                        "Student Type: " + (studentType ? "Boarding Student" : "Day Student") + "\n" +
                        "Major: " + major + "\n"
                );
            }

        }
//        public void ugly(Students students){
//        if(students.getFirstName() == null && students.getSurname() == null && students.getMajor() == null && students.entryYear == 0){
//            this.studentInfoComplete= studentInfoComplete;
//        }
    }



