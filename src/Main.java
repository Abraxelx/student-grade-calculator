import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Main {


    public static void main(String[] args) throws IOException {
        FileJobs fileJobs = new FileJobs();
        StudentGenerator studentGenerator = new StudentGenerator();
        List<Student> students = studentGenerator.generateStudent();
        FrequencyCounter frequencyCounter = new FrequencyCounter();
        ClassStatistics statistics = frequencyCounter.calculateFrequency(students);
        frequencyCounter.setBestAndWorstStudent(students);
        String text = fileJobs.stringCreator(students,statistics,frequencyCounter);
        fileJobs.createFile();
        fileJobs.fileWriter(text);

    }
}
