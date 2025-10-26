package AdventureGame.SurvivalGame;

public enum WorldLeader {
    MUSSOLINI("Benito Mussolini", new String[]{"Fascist blast", "Iron Discipline", "Glory of Rome"}, "Father of Fascism", "Italy", "Il Duce commands victory!", 3500, 3300, "Axis"),
    HITLER("Adolf Hitler", new String[]{"Dictators Shout", "Fuehrer’s Wrath", "Propaganda Surge"}, "Barbarrosa Reichstorm", "Nazi Germany", "Germany will Rise Again", 4000, 3000, "Axis"),
    HIROHITO("Emperor Hirohito", new String[]{"Kamikaze spirit", "Amaterasu's Blessing", "Empires of the sun"}, "Banzai Charge", "Japan", "The enemy is stronger but heavens will not pardon their sins", 4000, 3000, "Axis"),
    CHURCHILL("Winston Churchill", new String[]{"Iron Resolve", "Lion's roar", "British Might"} , "Bulldog Spirit", "British Empire" , "Our backs are to the wall, but our spirits are unbroken.", 4500, 3000, "Allies"),
    ROOSEVELT("President Roosevelt", new String[]{"Liberty Strike", "Industrial Surge", "Operation Overdrive"}, "Manhattan Protocol", "United States of America", "The torch of liberty burns brightest in the darkest hour.", 4000, 5000, "Allies"),
    STALIN("Joseph Stalin", new String[]{"Soviet Pride", "Cold Vengeance", "Soviet Judgement"}, "Communists Vengeance", "Soviet Union", "History is written by those who endure, not those who beg.", 11231, 13123, "Allies");

    private String name;
    private String[] abilities;
    private String ultimate;
    private String country;
    private String characterDialogue;
    private int characterHealth;
    private int characterEnergy;
    private String powerType;
    
    WorldLeader(String name, String[] abilities, String ultimate,String country, String characterDialogue, int characterHealth, int characterEnergy, String powerType) {
        this.name = name;
        this.abilities = abilities;
        this.ultimate = ultimate;
        this.country = country;
        this.characterDialogue = characterDialogue;
        this.characterHealth = characterHealth;
        this.characterEnergy = characterEnergy;
        this.powerType = powerType;
    }

  //getters   
    public String getName() {
        return name;
    }
    public String[] getAbilities() {
        return abilities;
    }
    public String ultimate() {
        return ultimate;
    }
    public String getCountry() {
        return country;
    }
    public String getCharacterDialogue() {
        return characterDialogue;
    }
    public int getCharacterHealth() {
        return characterHealth;
    }
    public int getCharacterEnergy() {
        return characterEnergy;
    }
    public String getPowerType() {
        return powerType;
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
    public void setCharacterDialogue(String characterDialogue) {
        this.characterDialogue = characterDialogue;
    }
    public void setUltimate(String ultimate) {
        this.ultimate = ultimate;
    }
    public void setPowerType(String powerType) {
        this.powerType = powerType;
    }

}
