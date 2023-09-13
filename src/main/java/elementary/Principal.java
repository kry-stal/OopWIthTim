package elementary;

public class Principal {

    public void admitStudents(Students student){
        if(student.getDob() == "12" && student.getEntryYear() == 2023){
            System.out.println("Student admitted");
        }
        else System.out.println("Student ineligible");
    }

}
