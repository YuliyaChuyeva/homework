public class GameCharacter {
    private String name;
    private int level;
    private int health;
    private int mana;
    boolean isAlive;

    public GameCharacter(String name, int level, int health, int mana) {
        setName(name);
        setLevel(level);
        setHealth(health);
        setMana(mana);
        this.isAlive = true;
    }

    public GameCharacter(String name) {
        setName(name);
        this.level = 1;
        this.health = 100;
        this.mana = 50;
        this.isAlive = true;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public int getHealth() {
        return health;
    }

    public int getMana() {
        return mana;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setLevel(int level) {
        if (level >= 1 && level < 100) {
            this.level = level;
        } else {
            System.out.println("Invalid level");
        }
    }

    public void setHealth(int health) {
        if (health > 0 && health < 100) {
            this.health = health;
        } else if (health > 100) {
            this.health = 100;
        } else if (health == 0) {
            this.isAlive = false;
        } else if (health < 0) {
            this.health = 0;
            this.isAlive = false;
        }
    }

    public void setMana(int mana) {
        if (mana >= 0 && mana <= 100) {
            this.mana = mana;
        }
    }

    public void setName(String name) {
        if (name != null || !name.isEmpty()) {
            this.name = name;
        }
    }

    public void takeDamage(int damage) {
        if (!isAlive) {
            System.out.println("Character " + name + " is already dead. No damage taken.");
            return;
        }
        setHealth(this.health - damage);
        System.out.println("Character" + name + " took" + damage + "damage. Health now:" + health);
    }

    public void castSpell(int manaCost) {

        if (mana < manaCost) {
            System.out.println("Character" + name + " does not have enough mana to cast the spell");

        } else if (!isAlive) {
            System.out.println("Character" + name + " is dead and cannot cast spells");
        } else {
            this.mana = this.mana - manaCost;
            System.out.println("Character" + name + " casted a spell for" + manaCost + " mana. Mana now: " + mana);
        }
    }

    public void heal(int amount) {
        if (!isAlive) {
            System.out.println("Character " + name + " is dead and cannot be healed.");
            return;
        }
        setHealth(this.health + amount);
        System.out.println("Character " + name + " healed for " + amount + " health. Health now: " + health + ".");
    }

    public static void main(String[] args) {
        GameCharacter arthur = new GameCharacter("Arthur", 10, 80, 60);
        GameCharacter morgana = new GameCharacter("Morgana", 20, 100, 90);

        arthur.takeDamage(50);
        morgana.castSpell(100);
        arthur.heal(30);
        morgana.castSpell(50);

    }

}
