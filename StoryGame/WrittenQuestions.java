package AdventureGame.StoryGame;
import java.util.Scanner;
public class WrittenQuestions extends Questions implements CalculateActScore<WrittenQuestions>{

    WrittenQuestions(String questionName, String correctAnswer, int pointsGiven) {
        super(questionName, correctAnswer, pointsGiven);
    }
    WrittenQuestions() {

    }

    @Override
    public double processQuestion(WrittenQuestions[] question, Scanner scan) {
         int totalRecitationScores = 0;
             for (WrittenQuestions recitationQuestions : question) {
            System.out.print(recitationQuestions.getQuestionName() + ": ");
            String reciteAnswer = scan.nextLine();
            reciteAnswer = reciteAnswer.substring(0, 1).toUpperCase() + reciteAnswer.substring(1);
            if (recitationQuestions.getCorrectAnswer().equals(null)) {
                System.out.println(recitationQuestions.getCorrectAnswer());
            }
            else {
                if (recitationQuestions.getCorrectAnswer().equals(reciteAnswer)) {
                    totalRecitationScores+=recitationQuestions.getPointsGiven();
                }

            }
        }
        return totalRecitationScores;
    }
    
}
