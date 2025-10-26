package AdventureGame.SurvivalGame;

import java.util.Random;



import AdventureGame.GameMechanics.DifficultyMode;

public class Enemy extends Hero{
    private DifficultyMode difficultyMode; 
    Enemy(String name, Abilities[] abilities, int attackDamage, String country, String characterDescription, int characterHealth, DifficultyMode difficultyMode) {
        super(name, abilities, attackDamage, country, characterDescription, characterHealth);
        this.difficultyMode = difficultyMode;
    }

    @Override
    public void heroAssault(PlayerHero character, Enemy enemy) {
            Random random = new Random();

            while (getCurrentHealth() >= 0) {
            int chooseRandomSkill = 0;
            int delay = 0;
            switch (difficultyMode) {
                case EASY:
                chooseRandomSkill = random.nextInt(3) + 2;
                delay = 1000;
                    break;
                case NORMAL :
                break;
                case HARD :
                break;
                default:
                    break;
            }
       
            }
    }

    //getter
    public DifficultyMode getDifficultyMode() {
        return difficultyMode;
    }
    @Override
    public void dialogue(Hero character, String[] dialogue) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'dialogue'");
    }


}
