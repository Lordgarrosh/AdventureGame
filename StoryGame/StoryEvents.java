package AdventureGame.StoryGame;
import java.util.Scanner;

import AdventureGame.GameMechanics.DifficultyMode;
public abstract class StoryEvents implements SchoolEvents {
    private DifficultyMode difficulty;
    
    StoryEvents(DifficultyMode difficulty) {
        this.difficulty = difficulty;
    }

    public DifficultyMode getDifficulty() {
        return difficulty;
    }
    public void narrate(String[] narrateSentences) {
        try {
        for (String narrate: narrateSentences) {
           Thread.sleep(500);
           System.out.println(narrate);
            }
        }catch (InterruptedException e) {
            e.printStackTrace();
           }
    }


    public void interactiveDialogue(String[] teacherChat, Scanner scan) {

    }
    

    public double quizDuration() {
        switch (difficulty) {
            case EASY : return 0;
            case NORMAL : return 60;
            case HARD : return 30;
            default : return 0;
        }
    }

    public double recitationDuration() {
        switch (difficulty) {
            case EASY : return 0;
            case NORMAL : return 30;
            case HARD : return 15;
            default : return 0;
        }
    }
}
