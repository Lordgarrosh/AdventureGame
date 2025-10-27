package AdventureGame.StoryGame;

public class Student {
    private String name;
    private double quizscore;
    private double performanceScore;
    private double examScore;
    private double prelimGrade;
    private double midtermGrade;
    private double preFinalsGrade;
    private double finalsGrade;
 
    //getters
    private String getName() {
        return name;
    }
    private double getQuizScore() {
        return quizscore;
    }
    private double getPerformanceScore() {
        return performanceScore;
    }
    private double getExamScore() {
        return examScore;
    }
    private double getPrelimGrade() {
        return prelimGrade;
    }
    private double getMidtermGrade() {
        return midtermGrade;
    }
    private double getPreFinalsGrade() {
        return preFinalsGrade;
    }
    private double getFinalsGrade() {
        return finalsGrade;
    }

    //setters 
    private void setName(String name) {
        this.name = name;
    }
    private void setQuizScore(double quizscore) {
        this.quizscore = quizscore;
    }
    private void setPerformanceScore(double performanceScore) {
        this.performanceScore = performanceScore;
    }
    private void setExamScore(double examScore) {
        this.examScore = examScore;
    }
    private void setPrelimGrade(double prelimGrade) {
        this.prelimGrade = prelimGrade;
    }
    private void setMidtermGrade(double midtermGrade) {
        this.midtermGrade = midtermGrade;
    }
    private void setPreFinalsGrade(double preFinalsGrade) {
        this.preFinalsGrade = preFinalsGrade;
    }
    private void setFinalsGrade(double finalsGrade) {
        this.finalsGrade = finalsGrade;
    }
}
