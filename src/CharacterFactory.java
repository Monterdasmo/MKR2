public class CharacterFactory {
    public static Character createCharacter(String type, String name, Arena arena) {
        switch (type) {
            case "Warrior":
                return new Warrior(name, arena);
            case "Mage":
                return new Mage(name, arena);
            case "Archer":
                return new Archer(name, arena);
            default:
                throw new IllegalArgumentException("Невідомий тип персонажа: " + type);
        }
    }
}
