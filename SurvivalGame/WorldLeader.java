package AdventureGame.SurvivalGame;

public enum WorldLeader {

    //if there is more time add special effects on following 
    //Fuherer's Wrath additional fire damage overtime
    //father of fascism add massive boost
    //banzai charge 50% health reduction to caster but dealing tons of damage to the target
//fix more the worldleaders here

    MUSSOLINI("Benito Mussolini",
              new Abilities[]{
                new DamageAbility("Fascist Blast", "Fires a fascist shotgun dealing 450 damage instantly.", false, 8, 450, 1),
                new BuffAbility("Iron Discipline", "Inspires himself as a fascist leader, increasing attack by 40 for 10 seconds.", false, 12, 40, 10),
                new DamageAbility("Glory of Rome", "Summons Italian soldiers to deal a total of 300 damage over 10 seconds.", false, 18, 300, 10),
                new HealAbility("Father of Fascism", "Assures his legacy, healing himself for 1200 HP.", true, 60, 1200)
              },
              "Italy",
              "The Roman Empire will be rebuilt again, Glory to the Roman Empire!!",
              7000,
              "Axis",
              200
    ),

    HITLER("Adolf Hitler",
              new Abilities[]{
                new HealAbility("Right Arm of the Forbidden One", "Raises his right hand commanding dark forces to heal him for 1000 HP.", false, 14, 1000),
                new DamageAbility("Fuhrer’s Wrath", "Fueled by rage, fires a tank shell at an enemy dealing 900 damage.", false, 18, 900, 1),
                new DamageAbility("Propaganda Surge", "Boosts German soldiers’ morale to attack enemies, dealing 350 total damage over 10 seconds.", false, 22, 350, 10),
                new DamageAbility("Operation Barbarossa", "Unleashes the full force of his army, dealing 2000 total damage over 15 seconds.", true, 80, 2000, 15)
              },
              "Germany",
              "If art school says nein, Europe shall be mein!",
              6500,
              "Axis",
              220
    ),

    HIROHITO("Emperor Hirohito",
              new Abilities[]{
                new HealAbility("Amaterasu’s Blessing", "Calls divine light to heal himself for 800 HP.", false, 12, 800),
                new DamageAbility("Banzai Charge", "Sacrifices 50% of his health to deal 1600 burst damage to his target.", false, 25, 1600, 1),
                new DamageAbility("Empire’s Wrath", "Orders bombers to deal 300 total damage over 8 seconds.", false, 20, 300, 8),
                new DamageAbility("Sun's Fury", "Summons the wrath of the Imperial Sun, dealing 3500 total damage in a massive explosion.", true, 90, 3500, 1)
              },
              "Imperial Japan",
              "The sun shall rise again, for in the glory of our empire we endure!",
              7200,
              "Axis",
              180
    ),

    CHURCHILL("Winston Churchill",
              new Abilities[]{
                new HealAbility("Iron Resolve", "His sheer willpower forces him to recover 900 HP.", false, 10, 900),
                new BuffAbility("Lion’s Roar", "Rallies allies and increases attack by 60 for 10 seconds.", false, 14, 60, 10),
                new DamageAbility("British Might", "Demonstrates British firepower, dealing 1200 damage instantly.", false, 20, 1200, 1),
                new BuffAbility("Spirit of Britain", "Increases attack by 180 for 15 seconds when allies are below half health.", true, 80, 180, 15)
              },
              "United Kingdom",
              "War is not won through fear, but by the courage to stand firm amidst the chaos.",
              8000,
              "Allied",
              190
    ),

    ROOSEVELT("Franklin D. Roosevelt",
              new Abilities[]{
                new DamageAbility("Liberty Strike", "Fires four precise shots dealing a total of 1300 damage.", false, 15, 1300, 1),
                new DamageAbility("Industrial Surge", "Unleashes America’s industrial might, bombarding the area for 500 damage per second for 5 seconds.", false, 25, 2500, 5),
                new BuffAbility("Operation Overdrive", "Increases attack damage by 100 for 10 seconds using allied cooperation.", false, 20, 100, 10),
                new DamageAbility("Manhattan Protocol", "Deploys the atomic bomb, annihilating enemies for 4000 damage in a large area.", true, 100, 4000, 1)
              },
              "United States of America",
              "Our strength lies not in one man, but in millions united for freedom.",
              7500,
              "Allied",
              210
    ),

    STALIN("Joseph Stalin",
              new Abilities[]{
                new HealAbility("Soviet Pride", "Taps into the pride of the Red Army, healing himself for 1400 HP.", false, 18, 1400),
                new DamageAbility("Communist Vengeance", "Commands comrades to attack, dealing 400 total damage over 15 seconds.", false, 22, 400, 15),
                new BuffAbility("Vodka, Soviet Bear", "Drinks vodka and channels the Soviet Bear, increasing attack by 150 for 12 seconds.", false, 25, 150, 12),
                new DamageAbility("Soviet Judgement", "Calls an unstoppable barrage of artillery dealing 3800 damage in one concentrated blast.", true, 100, 3800, 1)
              },
              "Soviet Union",
              "The Red Army will crush all that stands before it.",
              9000,
              "Allied",
              170
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
    private int attackDamage;
    
    WorldLeader(String name, Abilities[] abilities, String country, String characterDialogue, int characterHealth,  String powerType, int attackDamage) {
        this.name = name;
        this.abilities = abilities;

        this.country = country;
        this.characterDialogue = characterDialogue;
        this.characterHealth = characterHealth;
        this.powerType = powerType;
        this.attackDamage = attackDamage;
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
    public int getAttackDamage() {
        return attackDamage;
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
