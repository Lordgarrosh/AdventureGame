package AdventureGame.SurvivalGame;

public class BuffAbility extends Abilities{
    private int buffAmount;
    private int buffDuration;
    BuffAbility(String ability, String description, boolean isUltimate, double cooldown,  double buffAmount, int buffDuration) {
        super(ability,  description, isUltimate, cooldown);
   
        this.buffAmount = buffAmount;
        this.buffDuration = buffDuration;
    }

    @Override
    public void activate(PlayerHero playerHero, Enemy enemy) {
        if (!this.isInCooldown()) {
            playerHero.setAttackDamage(this.buffAmount);
               System.out.println("Player Uses " + getAbility());  
               new Thread(() -> {
                try {
                    Thread.sleep(getBuffDuration());
                    playerHero.setAttackDamage(this.buffAmount);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
               }).start();
            }
        playerHero.increasedStat(buffAmount,  buffDuration);
    }   
        
//getters
public double getBuffAmount() {
    return buffAmount * 1000;
}
public int getBuffDuration() {
    return buffDuration;
}



}
