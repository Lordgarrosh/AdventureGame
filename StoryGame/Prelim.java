package AdventureGame.StoryGame;

import java.util.Scanner;

import AdventureGame.GameMechanics.DifficultyMode;

public class Prelim extends StoryEvents{
    
    Prelim(DifficultyMode difficulty) {
        super(difficulty);
    }
    @Override
    public double quizzes(Questions[] questions, Scanner scan) {
        return 2.2;
    }

    @Override
    public double examination(Questions[] questions, Scanner scan) {
        
        return 2.2;
    }

    @Override
    public double recitation(Questions[] questions, Scanner scan) {
        int totalRecitationScores = 0;
        for (Questions recitationQuestions : questions) {
            System.out.println(recitationQuestions.getQuestionName());
            String reciteAnswer = scan.nextLine();
            reciteAnswer = reciteAnswer.substring(0, 1).toUpperCase() + reciteAnswer.substring(1);
            if (recitationQuestions.getCorrectAnswer().equals(null)) {
                System.out.println(recitationQuestions.getCorrectAnswer());
            }
            else {
                if (recitationQuestions.getCorrectAnswer().equals(reciteAnswer)) {
                    System.out.println(recitationQuestions.getCorrectResponse());
                    totalRecitationScores+=recitationQuestions.getPointsGiven();
                }
                else {
                    System.out.println(recitationQuestions.getIncorrectResponse());
                }
            }
        }
        return totalRecitationScores;
    }

 
}
