package AdventureGame.StoryGame;

public class Student {
    private String name;
    private double quizscore;
    private double recitationScore;
    private double examScore;
    private double prelimGrade;
    private double midtermGrade;
    private double preFinalsGrade;
    private double finalsGrade;

    //maxscores
    private final static int maxQuizScores = 25;
    private final static int maxExamScores = 60;
    private final static int maxRecitationScores = 30;

    //percentages
    private final static int quizPercentage = 20;
    private final static int recitationPercentage = 30;
    private final static int examPercentage = 50;
    private final static int prelimPercentage = 20;
    private final static int midtermPercentage = 20;
    private final static int preFinalsPercentage = 20;
    private final static int finalsPercentage = 40;
    //getters
    public String getName() {
        return name;
    }
    public double getQuizScore() {
        return (quizscore / maxQuizScores) * quizPercentage;
    }
    public double getRecitationScore() {
        return (recitationScore / maxRecitationScores) * recitationPercentage;
    }
    public double getExamScore() {
        return (examScore / maxExamScores) * examPercentage;
    }
    public double getPrelimGrade() {
        return prelimGrade;
    }
    public double getMidtermGrade() {
        return midtermGrade;
    }
    public double getPreFinalsGrade() {
        return preFinalsGrade;
    }
    public double getFinalsGrade() {
        return finalsGrade;
    }

    //setters 
    public void setName(String name) {
        this.name = name;
    }
    public void setQuizScore(double quizscore) {
        this.quizscore = quizscore;
    }
    public void setRecitationScore(double recitationScore) {
        this.recitationScore = recitationScore;
    }
    public void setExamScore(double examScore) {
        this.examScore = examScore;
    }
    public void setPrelimGrade() {
        this.prelimGrade = ((getExamScore() + getQuizScore() + getRecitationScore()) / 100) * prelimPercentage;
    }
    public void setMidtermGrade() {
        this.midtermGrade = ((getExamScore() + getQuizScore() + getRecitationScore()) / 100) * midtermPercentage;
    }
    public void setPreFinalsGrade() {
        this.preFinalsGrade = ((getExamScore() + getQuizScore() + getRecitationScore()) / 100) * preFinalsPercentage;
    }
    public void setFinalsGrade() {
        this.finalsGrade = ((getExamScore() + getQuizScore() + getRecitationScore()) / 100) * finalsPercentage;
    }
}
