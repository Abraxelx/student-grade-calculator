import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentGenerator {


    public List<Student> generateStudent(){
        List<Student> studentList = new ArrayList<>();
        StudentDegreeCalculator degreeCalculator = new StudentDegreeCalculator();
        boolean resume = false;
        while (resume == false) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("*******Öğrenci Bilgilerini Giriniz******");
            System.out.print("Öğrenci No : ");
            int studentNo = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Öğrenci İsim - Soyisim : ");
            String nameSurname = scanner.nextLine();


            System.out.print("Öğrenci Vize Notu: ");
            int vizeDegree = scanner.nextInt();

            System.out.print("Öğrenci Final Notu : ");
            int finalDegree = scanner.nextInt();

            Student student = new Student(studentNo, nameSurname, vizeDegree, finalDegree);
            student.setSuccessGrade(degreeCalculator.successGradeCalculator(student.getVizeDegree(), student.getFinalDegree()));
            student.setFinalGrade(degreeCalculator.finalGradeCalculator(student.getSuccessGrade()));
            System.out.println("Yeni Öğrenci Kaydetmek İster misiniz? E - H: ");
            String resumeParam = scanner.next();

            if(resumeParam.equals("H")){
                resume = true;
                //studentList.add(student);
            }
            studentList.add(student);
        }
        return studentList;
    }
}
