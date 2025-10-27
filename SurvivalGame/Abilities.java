package AdventureGame.SurvivalGame;

public abstract class Abilities implements AbilityEffect {
    private String ability;

    private String description;
    private boolean isUltimate;
    private double cooldown;

    Abilities(String ability, String description,  boolean isUltimate, double cooldown) {
        this.ability = ability;
        this.description = description;
        this.isUltimate = isUltimate;
        this.cooldown = cooldown;
    }

    //getters
    public String getAbility() {
        return ability;
    }

    public String getDescription() {
        return description;
    }
    public boolean getIsUltimate() {
        return isUltimate;
    }
    public double getCooldown() {
        return cooldown;
    }

    @Override
    public String toString() {
        return "Player Uses " + getAbility();
    }
    
}
