import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Main {


    public static void main(String[] args) throws IOException {
        FileWriter writer = null;
        FileWriter writer2 = null;
        FileJobs fileJobs = new FileJobs();
        fileJobs.createFile();
        ClassStatistics statistics = new ClassStatistics();

        StudentGenerator studentGenerator = new StudentGenerator();
        List<Student> students = studentGenerator.generateStudent();
        FrequencyCounter frequencyCounter = new FrequencyCounter();
        frequencyCounter.calculateFrequency(students);
        frequencyCounter.setBestAndWorstStudent(students);

        for(Student student: students){
            writer = fileJobs.fileWriter("No : " + student.getStudentNo() +"\n"
                    +"İsim Soyisim :"+ student.getNameSurname() +"\n"
                    +"Vize Notu :" + student.getVizeDegree() +"\n"
                    +"Final Notu :" + student.getFinalDegree() +"\n"
                    +"Başarı Notu: " + student.getSuccessGrade() +"\n"
                    +"Harf Notu: " + student.getFinalGrade());
        }
        writer2 = fileJobs.fileWriter(
                "En iyi Öğrenci :" + statistics.getBestStudent().getNameSurname() +"\n"
                +"En Başarısız Öğrenci :" + statistics.getWorstStudent().getNameSurname() +"\n"
                +"A : "+ frequencyCounter.starGenerator(statistics.getACounter()) +"\n"
                +"B : "+ frequencyCounter.starGenerator(statistics.getBCounter()) +"\n"
                +"C : "+ frequencyCounter.starGenerator(statistics.getCCounter()) +"\n"
                +"D :"+ frequencyCounter.starGenerator(statistics.getDCounter()) +"\n");
        writer.close();
        writer2.close();


    }
}
