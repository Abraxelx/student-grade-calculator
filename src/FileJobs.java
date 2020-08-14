import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class FileJobs {
    String tempWord ="";

    public void createFile(){
        try {
            File myObj = new File("Students.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            System.out.println(e.getMessage());
        }
    }

    public void fileWriter(String text) throws IOException{
            FileWriter myWriter = new FileWriter("Students.txt");
            myWriter.write(text);
            System.out.println("Successfully wrote to the file.");
            myWriter.close();
        }
    public String stringCreator(List<Student> studentList, ClassStatistics statistics, FrequencyCounter frequencyCounter){
        for(Student student: studentList){
            tempWord = tempWord + "No : " + student.getStudentNo() +"\n"
                    +"İsim Soyisim :"+ student.getNameSurname() +"\n"
                    +"Vize Notu :" + student.getVizeDegree() +"\n"
                    +"Final Notu :" + student.getFinalDegree() +"\n"
                    +"Başarı Notu: " + student.getSuccessGrade() +"\n"
                    +"Harf Notu: " + student.getFinalGrade() +"\n"
                    +"********************************************"+"\n";
        }
             tempWord = tempWord
                +"En iyi Öğrenci :" + statistics.getBestStudent().getNameSurname() +"\n"
                +"En Başarısız Öğrenci :" + statistics.getWorstStudent().getNameSurname() +"\n"
                +"A : "+ frequencyCounter.starGenerator(statistics.getACounter()) +"\n"
                +"B : "+ frequencyCounter.starGenerator(statistics.getBCounter()) +"\n"
                +"C : "+ frequencyCounter.starGenerator(statistics.getCCounter()) +"\n"
                +"D :"+ frequencyCounter.starGenerator(statistics.getDCounter()) +"\n";
        return tempWord;
    }
    }
