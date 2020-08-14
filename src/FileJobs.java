import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class FileJobs {
    String tempWord ="";

    public void createFile(){
        try {
            File myObj = new File("src/outFile/Students.txt");
            if (myObj.createNewFile()) {
                System.out.println("Dosya olusturuldu : " + myObj.getName());
            } else {
                System.out.println("Bu dosya zaten mevcut.");
            }
        } catch (IOException e) {
            System.out.println("Hata.");
            System.out.println(e.getMessage());
        }
    }

    public void fileWriter(String text) throws IOException{
            FileWriter myWriter = new FileWriter("src/outFile/Students.txt");
            myWriter.write(text);
            System.out.println("Veriler dosyaya basariyla yazildi.");
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
                +"En Başarılı Öğrenci :" + statistics.getBestStudent().getNameSurname() +"\n"
                +"En Başarısız Öğrenci :" + statistics.getWorstStudent().getNameSurname() +"\n"
                +"Sınıf Vize Ortalaması : "+ statistics.getVizeMean() +"\n"
                +"Sınıf Final Ortalaması : "+ statistics.getFinalMean() +"\n"
                +"Sınıf Başarı Ortalaması : "+ statistics.getSuccessGradeMean() +"\n"
                +"A : "+ frequencyCounter.starGenerator(statistics.getACounter()) +"\n"
                +"B : "+ frequencyCounter.starGenerator(statistics.getBCounter()) +"\n"
                +"C : "+ frequencyCounter.starGenerator(statistics.getCCounter()) +"\n"
                +"D :"+ frequencyCounter.starGenerator(statistics.getDCounter()) +"\n";
        System.out.println("Sinif Vize Ortalamasi : "+ statistics.getVizeMean() +"\n"
                +"Sinif Final Ortalamasi : "+ statistics.getFinalMean() +"\n"
                +"Sinif Basari Ortalamasi : "+ statistics.getSuccessGradeMean() +"\n"
                +"A : "+ frequencyCounter.starGenerator(statistics.getACounter()) +"\n"
                +"B : "+ frequencyCounter.starGenerator(statistics.getBCounter()) +"\n"
                +"C : "+ frequencyCounter.starGenerator(statistics.getCCounter()) +"\n"
                +"D :"+ frequencyCounter.starGenerator(statistics.getDCounter()) +"\n");
        return tempWord;

    }
    }