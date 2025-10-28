package AdventureGame.StoryGame;

import java.util.Scanner;

public class RecitationQuestions extends Questions implements CalculateActScore<RecitationQuestions>{
    private String correctAnswerResponse;
    private String incorrectAnswerResponse;
        RecitationQuestions(String questionName, String correctAnswer, int pointsGiven, String correctAnswerResponse, String incorrectAnswerResponse) {
        super(questionName, correctAnswer, pointsGiven);
        this.correctAnswerResponse = correctAnswerResponse;
        this.incorrectAnswerResponse = incorrectAnswerResponse;
    }
    RecitationQuestions() {
    }
    
    //getters
        public String getCorrectResponse() {
        return correctAnswerResponse;
    }
    public String getIncorrectResponse() {
        return incorrectAnswerResponse;
    }
    
    @Override
    public double processQuestion(RecitationQuestions[] question, Scanner scan) {
       int totalRecitationScores = 0;
       
             for (RecitationQuestions recitationQuestions : question) {
            System.out.print(recitationQuestions.getQuestionName() + ": ");
            String reciteAnswer = scan.nextLine();
            reciteAnswer = reciteAnswer.substring(0, 1).toUpperCase() + reciteAnswer.substring(1);
            if (recitationQuestions.getCorrectAnswer() == null) {
                System.out.println(recitationQuestions.getCorrectResponse());
            }
            else {
                if (recitationQuestions.getCorrectAnswer().equals(reciteAnswer)) {
                    totalRecitationScores+=recitationQuestions.getPointsGiven();
                    System.out.println(recitationQuestions.getCorrectResponse());
                }
                else {
                    System.out.println(recitationQuestions.getIncorrectResponse());
                }
            }
        }
        return totalRecitationScores;
    }
}
