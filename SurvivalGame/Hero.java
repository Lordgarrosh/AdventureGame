package AdventureGame.SurvivalGame;

public abstract class Hero implements CharacterActions {
    private String name;
    private Abilities[] abilities;
    private int attackDamage;
    private String country;
    private String characterDescription;
    private int characterHealth;
    private int characterEnergy;
    private int currentHealth;
    
    Hero(String name, Abilities[] abilities, int attackDamage,  String country, String characterDescription, int characterHealth) {
        this.name = name;
        this.abilities = abilities;
        this.attackDamage = attackDamage;
        this.country = country;
        this.characterDescription = characterDescription;
        this.currentHealth = this.characterHealth = characterHealth;

    }

   public Hero() {

    }

    //getters   
    public String getName() {
        return name;
    }
    public Abilities[] getAbilities() {
        return abilities;
    }
    public int getAttackDamage() {
        return attackDamage;
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
    public void setAbilities(Abilities[] abilities) {
        this.abilities = abilities;
    }
    public void setAttackDamage(int attackDamage) {
        this.attackDamage = attackDamage;
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
    

    public void increasedStat(double statAmount, double duration)  {
         attackDamage+=statAmount;
        while (duration >= 0) {
            duration--;
            // System.out.println("Current Damage are: " + attackDamage);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
       if (duration == 0 ) {
        attackDamage -= statAmount;
       }
        System.out.println("Current Damage are: " + attackDamage);
    }
public synchronized void takeDamage(int damage, String attackType, int multiplier) {
    currentHealth -= (damage * multiplier);
    if (currentHealth < 0) currentHealth = 0;
    System.out.println(name + " takes " + damage + " damage! Current HP: " + currentHealth);
}


    public void heal(int heal) {
        currentHealth += heal;
        if (currentHealth > characterHealth) currentHealth = characterHealth;
    }

    
  

}
