package AdventureGame.SurvivalGame;

public class HealAbility extends Abilities{
    private int heal;
    
    HealAbility(String ability, int energyCost, String description, boolean isUltimate) {
        super(ability, energyCost, description, isUltimate);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void activate(PlayerHero playerHero, Enemy enemy) {
       System.out.println(super.toString());
       playerHero.heal(heal);
    }

    //getters 
    public int getHeal() {
        return heal;
    }
    
}
