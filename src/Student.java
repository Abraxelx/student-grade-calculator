public class Student {
    private int studentNo;
    private String nameSurname;
    private int vizeDegree;
    private int finalDegree;
    private double successGrade;
    private String finalGrade;

    public double getSuccessGrade() {
        return successGrade;
    }

    public void setSuccessGrade(double successGrade) {
        this.successGrade = successGrade;
    }

    public String getFinalGrade() {
        return finalGrade;
    }

    public void setFinalGrade(String finalGrade) {
        this.finalGrade = finalGrade;
    }


    public Student(int studentNo, String nameSurname, int vizeDegree, int finalDegree) {
        this.studentNo = studentNo;
        this.nameSurname = nameSurname;
        this.vizeDegree = vizeDegree;
        this.finalDegree = finalDegree;
    }

    public int getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(int studentNo) {
        this.studentNo = studentNo;
    }

    public String getNameSurname() {
        return nameSurname;
    }

    public void setNameSurname(String nameSurname) {
        this.nameSurname = nameSurname;
    }

    public int getVizeDegree() {
        return vizeDegree;
    }

    public void setVizeDegree(int vizeDegree) {
        this.vizeDegree = vizeDegree;
    }

    public int getFinalDegree() {
        return finalDegree;
    }

    public void setFinalDegree(int finalDegree) {
        this.finalDegree = finalDegree;
    }
}
