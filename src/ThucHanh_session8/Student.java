package ThucHanh_session8;

public class Student {
    private String id;
    private String name;
    private double score;

    public Student() {}

    public Student(String id, String name, double score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
    public String getRank(){
        if (score >= 8.5){
            return "Giỏi";
        } else if (6.5 <= score && score < 8) {
            return "Khá";
        } else {
            return "Trung bình";
        }
    }
    @Override
    public String toString(){
        return String.format("%s - %s - %.2f - %s", id, name, score, getRank());
    }
}


