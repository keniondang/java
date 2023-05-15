public class Student1 extends Person {
    private int id;
    private double score;

    public Student1(String name, int birthYear, int id, double score) {
        super(name, birthYear);
        this.id = id;
        this.score = score;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setScore(double score) {
        this.score = score;
    }

    public int getId() {
        return id;
    }
    public double getScore() {
        return score;
    }

    public String toString() {
        return super.toString() + ", ID: " + id + ", Score: " + score;
    }
}