public class Mage extends Character {
    public Mage(String name, Arena arena) {
        super("Маг", name, 100, 40, arena);
    }

    @Override
    public void attack(Character target) {
        System.out.println(type + " " + name + " використовує магію проти " + target.getName() + "!");
        target.takeDamage(attackPower);
    }
}
