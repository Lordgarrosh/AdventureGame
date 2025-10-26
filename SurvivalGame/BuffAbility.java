package AdventureGame.SurvivalGame;

public class BuffAbility extends Abilities{
    private String buffType;
    private double buffAmount;
    private double buffDuration;
    BuffAbility(String ability, int energyCost, String description, boolean isUltimate, String buffType, double buffAmount, double buffDuration) {
        super(ability, energyCost, description, isUltimate);
        this.buffType = buffType;
        this.buffAmount = buffAmount;
        this.buffDuration = buffDuration;
    }

    @Override
    public void activate(PlayerHero playerHero, Enemy enemy) {
        System.out.println("Player Uses " + getAbility() );
        playerHero.increasedStat(buffAmount, buffType, buffDuration);
    }
        
//getters
public String getBuffType() {
    return buffType;
}
public double getBuffAmount() {
    return buffAmount;
}
public double getBuffDuration() {
    return buffDuration;
}
}
