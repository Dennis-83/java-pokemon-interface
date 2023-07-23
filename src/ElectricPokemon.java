import java.util.Arrays;
import java.util.List;

public class ElectricPokemon extends Pokemon{

    private final String type = "electric";
    List<String> attacks = Arrays.asList("thunderpunch", "electroball", "thunder", "voltTackle");
    protected ElectricPokemon(String name, Integer level, Integer hp, String food, String sound) {
        super(name, level, hp, food, sound);
    }

        void thunderPunch(Pokemon name, Pokemon enemy) {
            System.out.println(name.getName() + " attacks " + enemy.getName() + " with thunderpunch");
            // check type + determine damage
            int  dmg;
            switch (enemy.getType()){
                case "water":
                    dmg = 10;
                    break;
                case "grass":
                    dmg = 8;
                    break;
                case "fire":
                    dmg = 6;
                    break;
                default:
                    dmg = 5;
            }
            System.out.println(enemy.getName() + " loses " + dmg + " hp");
            enemy.hp -= dmg;
            System.out.println(enemy.getName() + " has " + enemy.getHp() + " left");
        }
    void electroBall(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with electroball");
        // check type + determine damage
        int  dmg;
        switch (enemy.getType()){
            case "water":
                dmg = 15;
                break;
            case "grass":
                dmg = 13;
                break;
            case "fire":
                dmg = 11;
                break;
            default:
                dmg = 10;
        }
        System.out.println(enemy.getName() + " loses " + dmg + " hp");
        enemy.hp -= dmg;
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " left");
    }
    void thunder(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with thunder");
        // check type + determine damage
        int  dmg;
        if (enemy.getType() == "electric") {
            System.out.println("heals " + enemy.getName() + " for 15 hp");
            enemy.hp += 15;
        } else {
            switch (enemy.getType()) {
                case "water":
                    dmg = 20;
                    System.out.println(enemy.getName() + " loses " + dmg + " hp");
                    enemy.hp -= dmg;
                    break;
                case "grass":
                    dmg = 18;
                    System.out.println(enemy.getName() + " loses " + dmg + " hp");
                    enemy.hp -= dmg;
                    break;
                case "fire":
                    dmg = 16;
                    System.out.println(enemy.getName() + " loses " + dmg + " hp");
                    enemy.hp -= dmg;
                    break;
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " left");
    }
    void voltTackle(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with volttackle");
        // check type + determine damage
        int  dmg;
        switch (enemy.getType()){
            case "water":
                dmg = 5;
                break;
            case "grass":
                dmg = 4;
                break;
            case "fire":
                dmg = 3;
                break;
            default:
                dmg = 2;
        }
        System.out.println(enemy.getName() + " loses " + dmg + " hp");
        enemy.hp -= dmg;
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
