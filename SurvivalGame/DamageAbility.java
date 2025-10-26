package AdventureGame.SurvivalGame;

public class DamageAbility extends Abilities{
    private int damage;
    private String damageType;
    private int delay;
    private int duration;
    DamageAbility(String ability, int energyCost, String description, boolean isUltimate) {
        super(ability, energyCost, description, isUltimate);

    }

    @Override
    public void activate(PlayerHero playerHero, Enemy enemy) {
        System.out.println(playerHero + " used " + getAbility());
        
    }

    
}
