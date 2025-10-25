package AdventureGame.GameMechanics;
import java.util.Scanner;
public abstract class GameStart implements GameMechanics{
    public String inputName(Scanner scan) {
        System.out.print("Enter your name: ");
        String name = scan.nextLine();
        return name;
    }
}
