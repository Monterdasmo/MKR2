public class Warrior extends Character {
    public Warrior(String name, Arena arena) {
        super("Воїн", name, 150, 20, arena);
    }

    @Override
    public void attack(Character target) {
        System.out.println(type + " " + name + " атакує " + target.getName() + " з мечем!");
        target.takeDamage(attackPower);
    }
}
