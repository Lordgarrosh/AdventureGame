package AdventureGame.StoryGame;

public class Questions {
    private String questionName;
    private String correctAnswer;
    private int pointsGiven;
    private String correctAnswerResponse;
    private String incorrectAnswerResponse;

    Questions(String questionName, String correctAnswer, int pointsGiven, String correntAnswerResponse, String incorrectAnswerResponse) {
        this.questionName = questionName;
        this.correctAnswer = correctAnswer;
        this.pointsGiven = pointsGiven;
        this.correctAnswer = correctAnswer;
        this.incorrectAnswerResponse = incorrectAnswerResponse;
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
    public String getCorrectResponse() {
        return correctAnswerResponse;
    }
    public String getIncorrectResponse() {
        return incorrectAnswerResponse;
    }
}
