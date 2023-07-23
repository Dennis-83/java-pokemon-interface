import java.util.Arrays;
import java.util.List;

public class FirePokemon extends Pokemon{

    private final String type = "fire";
    List<String> attacks = Arrays.asList("firelash", "pyroball", "inferno", "flameThrower");

    protected FirePokemon(String name, Integer level, Integer hp, String food, String sound) {
        super(name, level, hp, food, sound);

    }

    void fireLash(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with firelash");
        // check type + determine damage
        int  dmg;
        switch (enemy.getType()){
            case "grass":
                dmg = 10;
                break;
            case "water":
                dmg = 8;
                break;
            case "electric":
                dmg = 6;
                break;
            default:
                dmg = 5;
        }
        System.out.println(enemy.getName() + " loses " + dmg + " hp");
        enemy.hp -= dmg;
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " left");
    }

        void pyroBall(Pokemon name, Pokemon enemy) {
            System.out.println(name.getName() + " attacks " + enemy.getName() + " with pyroball");
            // check type + determine damage
            int  dmg;
            switch (enemy.getType()){
                case "grass":
                    dmg = 15;
                    break;
                case "water":
                    dmg = 13;
                    break;
                case "electric":
                    dmg = 11;
                    break;
                default:
                    dmg = 10;
            }
            System.out.println(enemy.getName() + " loses " + dmg + " hp");
            enemy.hp -= dmg;
            System.out.println(enemy.getName() + " has " + enemy.getHp() + " left");
        }
    void inferno(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with inferno");
        // check type + determine damage
        int  dmg;
        switch (enemy.getType()){
            case "grass":
                dmg = 20;
                break;
            case "water":
                dmg = 18;
                break;
            case "electric":
                dmg = 16;
                break;
            default:
                dmg = 15;
        }
        System.out.println(enemy.getName() + " loses " + dmg + " hp");
        enemy.hp -= dmg;
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " left");
    }
    void flameThrower(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with flamethrower");
        // check type + determine damage
        int  dmg;
        switch (enemy.getType()){
            case "grass":
                dmg = 5;
                break;
            case "water":
                dmg = 4;
                break;
            case "electric":
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

    public String getType() {
        return type;
    }
}
