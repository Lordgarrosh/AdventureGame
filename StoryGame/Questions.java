package AdventureGame.StoryGame;

public abstract class Questions {
    private String questionName;
    private String correctAnswer;
    private int pointsGiven;

    Questions(String questionName, String correctAnswer, int pointsGiven) {
        this.questionName = questionName;
        this.correctAnswer = correctAnswer;
        this.pointsGiven = pointsGiven;
    }

    //getters
    public String getQuestionName() {
        return questionName;
    }
    public String getCorrectAnswer() {
        return correctAnswer;
    }
    public int getPointsGiven() {
        return pointsGiven;
    }
}
