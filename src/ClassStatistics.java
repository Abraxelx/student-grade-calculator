public class ClassStatistics {
    private int ACounter;
    private int BCounter;
    private int CCounter;
    private int DCounter;
    private Student bestStudent;
    private Student worstStudent;

    public int getACounter() {
        return ACounter;
    }

    public ClassStatistics() {
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
