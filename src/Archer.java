public class Archer extends Character {
    public Archer(String name, Arena arena) {
        super("Лучник", name, 120, 30, arena);
    }

    @Override
    public void attack(Character target) {
        System.out.println(type + " " + name + " стріляє у " + target.getName() + "!");
        target.takeDamage(attackPower);
    }
}
