package AdventureGame.SurvivalGame;

import java.util.Scanner;

import AdventureGame.GameMechanics.DifficultyMode;
import AdventureGame.GameMechanics.GameEngine;

public class SurvivalGameManager extends GameEngine implements Survival{

    @Override
    public DifficultyMode chooseLevel(Scanner scan) {
        System.out.println("1 - Commander");
        System.out.println("2 - Dictator ");
        System.out.println("3 - Emperor");
         System.out.print("Enter the difficulty that you want: ");
        int chooseDifficulty = scan.nextInt();
        DifficultyMode difficultyChosen = DifficultyMode.values()[chooseDifficulty - 1];
        System.out.println(difficultyChosen);
        return difficultyChosen;
    }

   

    @Override
    public int computeTotalWins() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'computeTotalWins'");
    }

    @Override
    public void narrate() {
try {
    String[] narrationSentences = {"The world once dreamed of peace... but the dream burned to ashes.", 
                                    "In the aftermath of ambition and fear, nations turned their eyes toward domination.",
                                    "One spark… and the world ignited.",
                                    "From the ashes of empires rose new titans — bound by pride, ideology, and vengeance.",
                                    "The Allies fought for freedom.",
                                    "The Axis fought for power.",
                                    "A Brutal War that will shape the modern world and destiny of mankind",
                                    "Cities crumbled beneath steel rain.",
                                    "Oceans turned black with oil and blood.",
                                    "The blue skies turned black and red with the destruction of their enemies",
                                    "Men became weapons.",
                                    "Leaders became legends.",
                                    "And the world... becomes a stagin ground for the great conflict",
                                    "But one questions still remains",
                                    "Who will win",
                                    "Who will decide the fate of the world",
                                    "A battle that will decide the fate of this world",
                                    "Let battle be joined"
                                };
    for (String narrate : narrationSentences) {
        Thread.sleep(2000);
        System.out.println(narrate);
    }
    Thread.sleep(30000);
} catch (InterruptedException e) {
    e.printStackTrace();
}
    }

    @Override
    public PlayerHero chooseHeroLeader(Scanner scan, String powerType) {
    boolean isHeroFound = false;
    String chooseLeader = "";
    while (!isHeroFound) {
       
       
        for (WorldLeader listWorldLeader : WorldLeader.values()) {
            if (listWorldLeader.getPowerType().equals(powerType)) {
System.out.println(listWorldLeader.getName() + " from the country of " + listWorldLeader.getCountry() +  " his abilities are " + listWorldLeader.getAbilities());
            }
            
        }
         System.out.print("Enter the last name of your hero leader: ");
        chooseLeader = scan.nextLine();
        for (WorldLeader heroLeader : WorldLeader.values()) {
            if (heroLeader.getPowerType().equals(powerType) && heroLeader.getName().equals(chooseLeader))  {
                System.out.println(heroLeader.getName() + " has been chosen");
                isHeroFound = true;
                break;
            }
        }
        if (!isHeroFound) {
            System.out.println("Please choose only from the hero given");
        }
        }
        return WorldLeader.valueOf(chooseLeader);
    }

    @Override
    public String choosePower(Scanner scan) {
        System.out.print("Enter the power that you want to join: ");
        String powerChosen = scan.nextLine();
        return powerChosen;
    }



    @Override
    public int computeGameScore() {
        return 334;
    }

q

    @Override
    public void startBattle(Scanner scan, PlayerHero playerHero, Enemy enemy) {
    for (WorldLeader enemyHero : WorldLeader.values()) {
        
    }
    System.out.println("The player hero are " + playerHero.getName());
    }



    @Override
    public int startGame(Scanner scan) {
        this.chooseLevel(scan);
        this.narrate();
       String power = this.choosePower(scan);
       PlayerHero hero = this.chooseHeroLeader(scan, power);
       this.startBattle(scan, hero, null);
        return 2;
    }
}
