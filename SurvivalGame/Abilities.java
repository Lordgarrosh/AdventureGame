package AdventureGame.SurvivalGame;

public abstract class Abilities implements AbilityEffect {
    private String ability;
    private int energyCost;
    private String description;
    private boolean isUltimate;

    Abilities(String ability, String description,  boolean isUltimate) {
        this.ability = ability;
        this.description = description;
        
        this.isUltimate = isUltimate;
    }

    //getters
    public String getAbility() {
        return ability;
    }
    public int getEnergyCost() {
        return energyCost;
    }
    public String getDescription() {
        return description;
    }
    public boolean getIsUltimate() {
        return isUltimate;
    }

    @Override
    public String toString() {
        return "Player Uses " + getAbility();
    }
    
}
