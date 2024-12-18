public class Main {
    public static void main(String[] args) {
        Arena arena = new Arena();

        // Створення персонажів з іменами
        Character warrior = CharacterFactory.createCharacter("Warrior", "Олекса", arena);
        Character mage = CharacterFactory.createCharacter("Mage", "Мирослава", arena);
        Character archer = CharacterFactory.createCharacter("Archer", "Іванко", arena);

        // Додавання персонажів на арену
        arena.addCharacter(warrior);
        arena.addCharacter(mage);
        arena.addCharacter(archer);

        // Взаємодія персонажів
        System.out.println("Гра починається!");
        arena.startBattle();
    }
}
