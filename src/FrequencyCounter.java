import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FrequencyCounter {
    int ACounter = 0;
    int BCounter = 0;
    int CCounter = 0;
    int DCounter = 0;
    double vizeMean = 0;
    double finalMean = 0;
    double sucessMean = 0;


    ClassStatistics statistics = new ClassStatistics();
    public ClassStatistics calculateFrequency(List<Student> studentList){

        for (Student student: studentList){
            if(student.getFinalGrade().equals("A")){
                ACounter = ACounter + 1;
            }else if (student.getFinalGrade().equals("B")){
                BCounter = BCounter + 1;
            }else if (student.getFinalGrade().equals("C")) {
                CCounter = CCounter + 1;
            }else if (student.getFinalGrade().equals("D")) {
                DCounter = DCounter + 1;
            }
        }
        calculateMeans(studentList);
        statistics.setACounter(ACounter);
        statistics.setBCounter(BCounter);
        statistics.setCCounter(CCounter);
        statistics.setDCounter(DCounter);
        return statistics;

    }

    public void setBestAndWorstStudent(List<Student> studentList){
        Map<Double, Student> studentMap = new HashMap<>();
        double tempCounter = 0;
        double lowTempCounter = 100;
        for (Student student: studentList) {
            if (student.getSuccessGrade() > tempCounter) {
                tempCounter = student.getSuccessGrade();
                studentMap.put(tempCounter, student);
            }else if(student.getSuccessGrade() < lowTempCounter){
                lowTempCounter = student.getSuccessGrade();
                studentMap.put(lowTempCounter, student);
            }
        }

            double getLastElement = 0;
            double getFirstElement = 100;
            for (Map.Entry<Double,Student> entry: studentMap.entrySet()){
                double key = entry.getKey();
                if(key > getLastElement){
                    getLastElement = key;
                }
                if(key < getFirstElement){
                    getFirstElement = key;
                }
        }
            Student bestStudent = studentMap.get(getLastElement);
            statistics.setBestStudent(bestStudent);
            System.out.println("En başarılı Öğrenci :" + bestStudent.getNameSurname());
            Student worstStudent = studentMap.get(getFirstElement);
            statistics.setWorstStudent(worstStudent);
            System.out.println("En Başarısız Öğrenci : " + worstStudent.getNameSurname());
        }

        public String starGenerator(int count){
        String star ="";
        for(int i = 0; i<count; i++){
            star = star+"*";
        }
        return star;
        }
        public void calculateMeans(List<Student> studentList){
            int studentCount = studentList.size();
            for (Student student : studentList){
               vizeMean = vizeMean + student.getVizeDegree();
               finalMean = finalMean + student.getFinalDegree();
               sucessMean = sucessMean + student.getSuccessGrade();
            }

            statistics.setVizeMean(vizeMean/studentCount);
            statistics.setFinalMean(finalMean/studentCount);
            statistics.setSuccessGradeMean(sucessMean/studentCount);
        }

}
