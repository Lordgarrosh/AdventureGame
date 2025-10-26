package AdventureGame;
import java.util.Scanner;

import AdventureGame.SurvivalGame.SurvivalGameManager;
//this wwill serve as just the main class of the program
public class Main {
    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
        SurvivalGameManager test = new SurvivalGameManager();
        test.startBattle(scan, null, null);
        
    }
}
