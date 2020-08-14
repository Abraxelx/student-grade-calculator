public class StudentDegreeCalculator {
    public double successGradeCalculator(int vizeDegree, int finalDegree){
        return vizeDegree*0.40 + finalDegree *0.60;
    }
    public String finalGradeCalculator(double successGrade){
        if(successGrade <= 100 && successGrade > 75){
            return "A";
        }else if(successGrade <=75 && successGrade > 50 ){
            return "B";
        }else if(successGrade <=50 && successGrade > 25){
            return "C";
        }else if(successGrade <=25 && successGrade > 0){
            return "D";
        }else{
            return null;
        }
    }
}
