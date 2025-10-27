package AdventureGame.SurvivalGame;

public enum WorldLeader {

    //if there is more time add special effects on following 
    //Fuherer's Wrath additional fire damage overtime
    //father of fascism add massive boost
    //banzai charge 50% health reduction to caster but dealing tons of damage to the target
//fix more the worldleaders here
    MUSSOLINI("Benito Mussolini",
              new Abilities[]{
                new DamageAbility("Fascist Blast", "Fires a fascist shotgun ddealing 500 damage", false, 10, 500, 1),
                new BuffAbility("Iron Discipline", "Inspire himself as a fascist leader and increase his attack damage by 60", false, 12, 60, 15),
                new DamageAbility("Glory of Rome", "Inspired by the glory of roman empire calls several italian soldiers to deal total damage of 120 for 10 seconds", false, 15, 50, 10),
                new HealAbility("Father of Fascism", "Mussolini assuring that his fascist legacy will continue he will heal himself for 1800hp", false, 40, 1800)
              },
              "Italy",
              "The Roman Empire will be rebuilt again, Glory to the Roman Empire!!",
              6000,
              "Axis"
    ),
    HITLER("Adolf Hitler",
              new Abilities[]{
                new HealAbility("Right arm of the forbidden one", "Raise his rifght hand commanding many medication to heal him by 1200hp", false, 16, 1200),
                new DamageAbility("Fuherer's Wrath", "Fueled with rage fires a tank at an enemy dealing 1000 damage", false, 20, 1000, 1),
                new DamageAbility("Propaganda Surge", "Fueling the fighting spirit of german soldiers the german soldiers will fire a total of 130 damage in 10 seconds", false, 15, 130, 10),
                new DamageAbility("Operation Barbarrosa", "With a great determination to wipe out the allied forces hitler commands a great army dealing a total damage of 250 damage in 15 seconds", true, 60, 250, 15)
              },
              "Germany",
              "If art school says nein europe shall be mein",
              5000,
              "Axis"
    ),
    HIROHITO("Michinomiya Hirohito",
              new Abilities[]{
                new HealAbility("Right arm of the forbidden one", "Raise his rifght hand commanding many medication to heal him by 1200hp", false, 16, 1200),
                new DamageAbility("Fuherer's Wrath", "Fueled with rage fires a tank at an enemy dealing 1000 damage", false, 20, 1000, 1),
                new DamageAbility("Propaganda Surge", "Fueling the fighting spirit of german soldiers the german soldiers will fire a total of 130 damage in 10 seconds", false, 15, 130, 10),
                new DamageAbility("Operation Barbarrosa", "With a great determination to wipe out the allied forces hitler commands a great army dealing a total damage of 250 damage in 15 seconds", true, 60, 250, 15)
              },
              "Germany",
              "If art school says nein europe shall be mein",
              5000,
              "Axis"
    );
    // MUSSOLINI("Benito Mussolini", new String[]{"Fascist blast", "Iron Discipline", "Glory of Rome"}, "Father of Fascism", "Italy", "Il Duce commands victory!", 3500, 3300, "Axis"),
    // HITLER("Adolf Hitler", new String[]{"Dictators Shout", "Fuehrer’s Wrath", "Propaganda Surge"}, "Barbarrosa Reichstorm", "Nazi Germany", "Germany will Rise Again", 4000, 3000, "Axis"),
    // HIROHITO("Emperor Hirohito", new String[]{"Kamikaze spirit", "Amaterasu's Blessing", "Empires of the sun"}, "Banzai Charge", "Japan", "The enemy is stronger but heavens will not pardon their sins", 4000, 3000, "Axis"),
    // CHURCHILL("Winston Churchill", new String[]{"Iron Resolve", "Lion's roar", "British Might"} , "Bulldog Spirit", "British Empire" , "Our backs are to the wall, but our spirits are unbroken.", 4500, 3000, "Allies"),
    // ROOSEVELT("President Roosevelt", new String[]{"Liberty Strike", "Industrial Surge", "Operation Overdrive"}, "Manhattan Protocol", "United States of America", "The torch of liberty burns brightest in the darkest hour.", 4000, 5000, "Allies"),
    // STALIN("Joseph Stalin", new String[]{"Soviet Pride", "Cold Vengeance", "Soviet Judgement"}, "Communists Vengeance", "Soviet Union", "History is written by those who endure, not those who beg.", 11231, 13123, "Allies");

    private String name;
    private Abilities[] abilities;
    private String country;
    private String characterDialogue;
    private int characterHealth;
    private String powerType;
    
    WorldLeader(String name, Abilities[] abilities, String country, String characterDialogue, int characterHealth,  String powerType) {
        this.name = name;
        this.abilities = abilities;

        this.country = country;
        this.characterDialogue = characterDialogue;
        this.characterHealth = characterHealth;
        this.powerType = powerType;
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
    public String getCharacterDialogue() {
        return characterDialogue;
    }
    public int getCharacterHealth() {
        return characterHealth;
    }
    public String getPowerType() {
        return powerType;
    }
    //setters

    public void setName(String name) {
        this.name = name;
    }
    public void setAbilities(Abilities[] abilities) {
        this.abilities = abilities;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public void setCharacterDialogue(String characterDialogue) {
        this.characterDialogue = characterDialogue;
    }
    public void setPowerType(String powerType) {
        this.powerType = powerType;
    }

}
