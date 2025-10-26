package AdventureGame.SurvivalGame;
import java.util.Scanner;
public class PlayerHero extends Hero{
    private Scanner scan;
    PlayerHero(String name, Abilities[] abilities, int attackDamage, String country, String characterDescription, int characterHealth, Scanner scan) {
        super(name, abilities, attackDamage, country, characterDescription, characterHealth);
        this.scan = scan;
    }

    
    
    @Override
    public void dialogue(Hero character, String[] dialogue) {
                
    }



    @Override
    public void heroAssault(PlayerHero character, Enemy enemy) {
        System.out.println("Enter your attack input: ");
        System.out.println("1 - for basic attack");
        System.out.println("2 - for " + character.getAbilities()[0]);
        System.out.println("3 - for " + character.getAbilities()[1]);
        System.out.println("4 - for " + character.getAbilities()[2]);
        System.out.println("5 - for " + character.getAbilities()[3]);
        int chooseAttack = scan.nextInt();
        if (chooseAttack == 1) {
                System.out.println("Enemy " + enemy.getName() + " is attacked");
                enemy.takeDamage(getAttackDamage(), "basicattack", 1);
        }
        else {
             Abilities chosen = character.getAbilities()[chooseAttack];
                    chosen.activate(character, enemy);
        }
    }
    
}
