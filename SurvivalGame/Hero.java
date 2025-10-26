package AdventureGame.SurvivalGame;

public abstract class Hero implements CharacterActions {
    private String name;
    private Abilities[] abilities;
    private String country;
    private String characterDescription;
    private int characterHealth;
    private int characterEnergy;
    private int currentHealth;
    
    Hero(String name, Abilities[] abilities, String country, String characterDescription, int characterHealth) {
        this.name = name;
        this.abilities = abilities;
        this.country = country;
        this.characterDescription = characterDescription;
        this.currentHealth = this.characterHealth = characterHealth;

    }

    //getters   
    public String getName() {
        return name;
    }
    public Abilities[] getAbilities() {
        return abilities;
    }
    public String getCountry() {
        return country;
    }
    public String getCharacterDescription() {
        return characterDescription;
    }
    public int getCharacterHealth() {
        return characterHealth;
    }
    public int getCharacterEnergy() {
        return characterEnergy;
    }
   

    public int getCurrentHealth() {
        return currentHealth;
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
    public void setCharacterHealth(int characterHealth) {
        this.characterHealth = characterHealth;
    }
    public void setCharacterEnergy(int characterEnergy) {
        this.characterEnergy = characterEnergy;
    }

    public synchronized boolean isDead() {
        if (currentHealth <= 0) {
             return true;
        }
       else {
        return false;
       }
    }
    

    public void increasedStat(double statAmount, String statType, double duration) {
        switch (statType) {
            case "attack" :
            break;
            case "totalHealth" :
            break;
        }
    }

    public void takeDamage(int damage, String damageType, int duration) throws InterruptedException {
        if (damageType.equals("overtime")) {
            while (duration <= 0) {
                currentHealth -= damage;
                if (currentHealth <= 0) {
                    currentHealth = 0;
                    break;
                }
                duration-=0.5;
                Thread.sleep(500);
            }
        }
        else {
            currentHealth -= damage;
            if (currentHealth <= 0) currentHealth = 0;
        }
    }

    public void heal(int heal) {
        currentHealth += heal;
        if (currentHealth > characterHealth) currentHealth = characterHealth;
    }

    
    

}
