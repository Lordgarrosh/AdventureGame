package AdventureGame.GameMechanics;
import java.util.Scanner;
public interface GameMechanics {
    default String inputUsername(Scanner scan) {
        System.out.print("Enter your name: ");
        String name = scan.nextLine();
        return name;
    };
    DifficultyMode chooseMode(Scanner scan);
    boolean programRunning(Scanner scan);

    int computeTotalWins();
    
    void narrate();
}
