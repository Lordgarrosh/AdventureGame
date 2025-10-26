package AdventureGame.SurvivalGame;

public class Enemy extends Hero{

    Enemy(String name, String[] abilities, String country, String characterDescription, int characterHealth,
            int characterEnergy) {
        super(name, abilities, country, characterDescription, characterHealth, characterEnergy);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void skillsAttack(Hero character) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'skillsAttack'");
    }

    @Override
    public void basicAttack(Hero character) {
        
    }

    @Override
    public void dialogue(Hero character, String[] dialogue, String enemy) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'dialogue'");
    }
    
}
