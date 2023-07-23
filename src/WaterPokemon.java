import java.util.Arrays;
import java.util.List;

public class WaterPokemon extends Pokemon {
    private final String type = "water";
    List<String> attacks = Arrays.asList("surf", "hydropump", "hydrocanon", "rainDance");

    protected WaterPokemon(String name, Integer level, Integer hp, String food, String sound) {
        super(name, level, hp, food, sound);
    }

    void surf(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with surf");
        // check type + determine damage
        int dmg;
        switch (enemy.getType()) {
            case "fire":
                dmg = 10;
                break;
            case "electric":
                dmg = 8;
                break;
            case "grass":
                dmg = 6;
                break;
            default:
                dmg = 5;
        }
        System.out.println(enemy.getName() + " loses " + dmg + " hp");
        enemy.hp -= dmg;
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " left");
    }

    void hydroPump(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with hydropump");
        // check type + determine damage
        int dmg;
        switch (enemy.getType()) {
            case "fire":
                dmg = 15;
                break;
            case "electric":
                dmg = 13;
                break;
            case "grass":
                dmg = 11;
                break;
            default:
                dmg = 10;
        }
        System.out.println(enemy.getName() + " loses " + dmg + " hp");
        enemy.hp -= dmg;
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " left");
    }

    void hydroCanon(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with hydrocanon");
        // check type + determine damage
        int dmg;
        switch (enemy.getType()) {
            case "fire":
                dmg = 20;
                break;
            case "electric":
                dmg = 18;
                break;
            case "grass":
                dmg = 16;
                break;
            default:
                dmg = 15;
        }
        System.out.println(enemy.getName() + " loses " + dmg + " hp");
        enemy.hp -= dmg;
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " left");
    }

    void rainDance(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with raindance");
        // check type + determine damage
        int dmg;

        switch (enemy.getType()) {
            case "fire":
                dmg = 5;
                System.out.println(enemy.getName() + " loses " + dmg + " hp");
                enemy.hp -= dmg;
                break;
            case "electric":
                System.out.println("has no effect on " + enemy.getName());
                break;
            case "grass":
                System.out.println(enemy.getName() + " heals for 3 hp");
                enemy.hp += 3;
                break;
            default:
                dmg = 2;
                System.out.println(enemy.getName() + " loses " + dmg + " hp");
                enemy.hp -= dmg;
        }
                System.out.println(enemy.getName() + " has " + enemy.getHp() + " left");
    }


    @Override
    List<String> getAttacks() {
        return attacks;
    }

    @Override
    String getType() {
        return type;
    }
}
