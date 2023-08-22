package services;

import elementary.Students;

import java.util.ArrayList;
import java.util.List;

public class StudentServices {
        List<Students> studentList = new ArrayList<>();


        public List<Students> addStudentToSchool(Students student){
                studentList.add(student);
                return studentList;
        }


}
