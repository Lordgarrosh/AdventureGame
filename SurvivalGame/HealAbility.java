package AdventureGame.SurvivalGame;

public class HealAbility extends Abilities{
    private int heal;
    
    HealAbility(String ability, String description, boolean isUltimate) {
        super(ability,  description, isUltimate);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void activate(PlayerHero playerHero, Enemy enemy) {
       
       playerHero.heal(heal);
    }

    //getters   
    public int getHeal() {
        return heal;
    }
    
}
