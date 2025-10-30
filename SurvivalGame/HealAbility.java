package AdventureGame.SurvivalGame;

public class HealAbility extends Abilities{
    private int heal;
    
    HealAbility(String ability, String description, boolean isUltimate, double cooldown, int heal) {
        super(ability,  description, isUltimate, cooldown);
        this.heal = heal;
    }

    @Override
    public void activate(PlayerHero playerHero, Enemy enemy) {
       System.out.println("Player used " + getAbility());
       playerHero.heal(heal);
    }

    //getters   
    public int getHeal() {
        return heal;
    }
    
}
