package exceptionhadling;

public abstract class Character {
    private int defense;
    private int attack;
    private int HP;
    
    Character(int h, int a, int d){
        this.defense = d;
        this.attack = a;
        this.HP =  h;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public abstract boolean attack();

    public void receiveDamage(int damage){
        setHP(HP - (damage - getDefense()));
        if (HP <= 0){
            setHP(0);
        }
    }

    public void info(){
        System.out.printf("%-20s: %d%n", "HP", getHP() );
        System.out.printf("%-20s: %d%n", "Attack", getAttack() );
        System.out.printf("%-20s: %d%n", "Defense", getDefense() );
    }

}

