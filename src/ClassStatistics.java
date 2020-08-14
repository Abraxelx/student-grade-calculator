public class ClassStatistics {
    private int ACounter;
    private int BCounter;
    private int CCounter;
    private int DCounter;
    private double vizeMean;
    private double finalMean;
    private double successGradeMean;
    private Student bestStudent;

    public ClassStatistics() {
    }

    public double getVizeMean() {
        return vizeMean;
    }

    public void setVizeMean(double vizeMean) {
        this.vizeMean = vizeMean;
    }

    public double getFinalMean() {
        return finalMean;
    }

    public void setFinalMean(double finalMean) {
        this.finalMean = finalMean;
    }

    public double getSuccessGradeMean() {
        return successGradeMean;
    }

    public void setSuccessGradeMean(double successGradeMean) {
        this.successGradeMean = successGradeMean;
    }

    private Student worstStudent;

    public int getACounter() {
        return ACounter;
    }


    public void setACounter(int ACounter) {
        this.ACounter = ACounter;
    }

    public int getBCounter() {
        return BCounter;
    }

    public void setBCounter(int BCounter) {
        this.BCounter = BCounter;
    }

    public int getCCounter() {
        return CCounter;
    }

    public void setCCounter(int CCounter) {
        this.CCounter = CCounter;
    }

    public int getDCounter() {
        return DCounter;
    }

    public void setDCounter(int DCounter) {
        this.DCounter = DCounter;
    }

    public Student getBestStudent() {
        return bestStudent;
    }

    public void setBestStudent(Student bestStudent) {
        this.bestStudent = bestStudent;
    }

    public Student getWorstStudent() {
        return worstStudent;
    }

    public void setWorstStudent(Student worstStudent) {
        this.worstStudent = worstStudent;
    }
}