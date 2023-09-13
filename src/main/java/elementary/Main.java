package elementary;

import services.StudentServices;

import java.util.List;

public class Main {
    public static void main(String[] args) {

//        System.out.println();
//        Students studentPaul = new Students();
//        studentPaul.setFirstName("Paul");
//        studentPaul.setSurname("Ahindero");
//        studentPaul.setEntryYear(2018);
//        studentPaul.setStudentType(false);
//        studentPaul.setMajor("Science");
//        studentPaul.setYear();
//        studentPaul.StudentInformation();
//
//        System.out.println();
//
//        Students studentVera = new Students();
//        studentVera.setFirstName("Vera");
//        studentVera.setSurname("Ejeh");
//        studentVera.setEntryYear(2023);
//        studentVera.setStudentType(true);
//        studentVera.setMajor("NA");
//        studentVera.setYear();
//        studentVera.StudentInformation();
//
//        System.out.println();
//
//        Students studentDesmond = new Students();
//        studentDesmond.setFirstName("Desmond");
//        studentDesmond.setSurname("Olaoluwa");
//        studentDesmond.setEntryYear(2010);
//        studentDesmond.setStudentType(false);
//        studentDesmond.setMajor("WES");
//        studentDesmond.setYear();
//        studentDesmond.StudentInformation();
//
//        System.out.println();
//
//        Principal principal = new Principal();
//        principal.admitStudents(studentPaul);
//        System.out.println();
//        Students studentAmara = new Students();
//        studentAmara.setFirstName("Amarachi");
//        studentAmara.setSurname("Garba");
//        studentAmara.setEntryYear(2019);
//        studentAmara.setAge();
//        studentAmara.setYear();
//        studentAmara.setMajor("Science");
//        studentAmara.StudentInformation();
//
//
//
//
//
//
////        studentServices.addStudentToSchool(studentPaul);
////        List<Students> studentAdded =  studentServices.addStudentToSchool(studentPaul);
////        System.out.println(studentAdded);
//
        Students studentAnna = new Students("Anna", "Wesley", "2001-12-29",
                2019, false, "science", "", 123);
        studentAnna.StudentInformation();




    }


}
