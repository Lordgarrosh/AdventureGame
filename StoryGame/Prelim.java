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
    public double recitation(RecitationQuestions[] recitation, Scanner scan) {
       System.out.println("Now that we are done with the discussion now let us have some recitation for today");
        recitation.calculateScore();
        return totalRecitationScores;
    }

 
}
