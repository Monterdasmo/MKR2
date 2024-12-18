public abstract class Character {
    protected String type;  // Тип персонажа (воїн, маг тощо)
    protected String name;  // Ім'я персонажа
    protected int health;
    protected int attackPower;
    protected Arena arena;

    public Character(String type, String name, int health, int attackPower, Arena arena) {
        this.type = type;
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
        this.arena = arena;
    }

    public abstract void attack(Character target);

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void takeDamage(int damage) {
        this.health -= damage;
        System.out.println(type + " " + name + " отримав " + damage + " урону, здоров'я: " + health);
    }
}
