package AdventureGame.SurvivalGame;

public interface CharacterActions {
    void skillsAttack(Hero character);
    void basicAttack(Hero character);
    
   void dialogue(Hero character, String[] dialogue, String enemy);
}