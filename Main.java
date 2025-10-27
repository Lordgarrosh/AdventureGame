package AdventureGame;
import java.util.Scanner;

import AdventureGame.SurvivalGame.Abilities;
import AdventureGame.SurvivalGame.SurvivalGameManager;
//this wwill serve as just the main class of the program
public class Main {
    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
         while (true) {
            try {
                long now = System.currentTimeMillis();

                // Skill ready?
                long lastSkillTime = System.currentTimeMillis();
                if (now - lastSkillTime >= 4) {
                    System.out.println();
                } else {
                    // Basic attack every second
                    System.out.println(enemy.getName() + " performs a basic attack!");
                    player.takeDamage(enemy.getAttackDamage(), "basicattack", 1);
                }

                Thread.sleep(1000); // 1-second delay between attacks

            } catch (InterruptedException e) {
                System.out.println(enemy.getName() + " was interrupted.");
                break;
            }
        }
    }
}
