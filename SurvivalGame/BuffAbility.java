package AdventureGame.SurvivalGame;

public class BuffAbility extends Abilities{
    private double buffAmount;
    private double buffDuration;
    BuffAbility(String ability, String description, boolean isUltimate, double cooldown,  double buffAmount, double buffDuration) {
        super(ability,  description, isUltimate, cooldown);
   
        this.buffAmount = buffAmount;
        this.buffDuration = buffDuration;
    }

    @Override
    public void activate(PlayerHero playerHero, Enemy enemy) {
        System.out.println("Player Uses " + getAbility() );
        playerHero.increasedStat(buffAmount,  buffDuration);
    }   
        
//getters
public double getBuffAmount() {
    return buffAmount;
}
public double getBuffDuration() {
    return buffDuration;
}
}
