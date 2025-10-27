package AdventureGame.SurvivalGame;

public class DamageAbility extends Abilities{
    private int damage;
    private String damageType;

    private int duration;
    DamageAbility(String ability,  String description, boolean isUltimate, double cooldown, int damage, int duration) {
        super(ability,  description, isUltimate, cooldown);
        this.damage = damage;
        this.duration = duration;
    }

    @Override
    public void activate(PlayerHero playerHero, Enemy enemy) {
        System.out.println(playerHero + " used " + getAbility());
        
    }

    
}
