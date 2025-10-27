package AdventureGame.StoryGame;
import java.util.Scanner;
public interface SchoolEvents {
 
    double quizzes(Questions[] questions,  Scanner scan);
    double examination(Questions[] questions, Scanner scan);
    double recitation(Questions[] questions, Scanner scan);
    
}
