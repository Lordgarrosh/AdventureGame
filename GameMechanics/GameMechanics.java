package AdventureGame.GameMechanics;
import java.util.Scanner;
public interface GameMechanics {
  
    DifficultyMode chooseMode(Scanner scan);
    boolean programRunning(Scanner scan);

    int computeTotalWins();
    
    void narrate();
}
