import java.util.ArrayList;
import java.util.List;

public class Arena {
    private List<Character> characters = new ArrayList<>();

    public void addCharacter(Character character) {
        characters.add(character);
        System.out.println(character.getName() + " приєднався до арени!");
    }

    public void startBattle() {
        if (characters.size() < 2) {
            System.out.println("На арені недостатньо персонажів для битви.");
            return;
        }

        // Перша взаємодія (атакують по черзі)
        Character attacker = characters.get(0);
        Character target = characters.get(1);

        while (target.getHealth() > 0) {
            attacker.attack(target);
            if (target.getHealth() <= 0) {
                System.out.println(target.getName() + " був переможений!");
                break;
            }

            // Поміняти ролі
            Character temp = attacker;
            attacker = target;
            target = temp;
        }
    }
}
