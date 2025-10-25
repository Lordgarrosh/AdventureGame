package AdventureGame.SurvivalGame;

public abstract class Hero implements CharacterActions {
    private String name;
    private String[] abilities;
    private String country;
    private String characterDescription;
    private double characterHealth;
    private int characterEnergy;
    
    Hero(String name, String[] abilities, String country, String characterDescription, double characterHealth, int characterEnergy) {
        this.name = name;
        this.abilities = abilities;
        this.country = country;
        this.characterDescription = characterDescription;
        this.characterHealth = characterHealth;
        this.characterEnergy = characterEnergy;
    }

    //getters   
    public String getName() {
        return name;
    }
    public String[] getAbilities() {
        return abilities;
    }
    public String getCountry() {
        return country;
    }
    public String getCharacterDescription() {
        return characterDescription;
    }
    public double getCharacterHealth() {
        return characterHealth;
    }
    public int getCharacterEnergy() {
        return characterEnergy;
    }

    //setters

    public void setName(String name) {
        this.name = name;
    }
    public void setAbilities(String[] abilities) {
        this.abilities = abilities;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public void setCharacterDescription(String characterDescription) {
        this.characterDescription = characterDescription;
    }
    public void setCharacterHealth(double characterHealth) {
        this.characterHealth = characterHealth;
    }
    public void setCharacterEnergy(int characterEnergy) {
        this.characterEnergy = characterEnergy;
    }
}
