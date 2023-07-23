import java.util.Arrays;
import java.util.List;

public class GrassPokemon extends Pokemon{

    private final String type = "grass";
    List<String> attacks = Arrays.asList("leafstorm", "solarbeam", "leechseed", "leaveBlade");
    protected GrassPokemon(String name, Integer level, Integer hp, String food, String sound) {
        super(name, level, hp, food, sound);
    }

        public void leafStorm(Pokemon name, Pokemon enemy) {
            System.out.println(name.getName() + " attacks " + enemy.getName() + " with leafstorm");
            // check type + determine damage
            int  dmg;
            switch (enemy.getType()){
                case "electric":
                    dmg = 10;
                    break;
                case "fire":
                    dmg = 8;
                    break;
                case "water":
                    dmg = 6;
                    break;
                default:
                    dmg = 5;
            }
            System.out.println(enemy.getName() + " loses " + dmg + " hp");
            enemy.hp -= dmg;
            System.out.println(enemy.getName() + " has " + enemy.getHp() + " left");
        }
    public void solarBeam(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with solarbeam");
        // check type + determine damage
        int  dmg;
        switch (enemy.getType()){
            case "electric":
                dmg = 15;
                break;
            case "fire":
                dmg = 13;
                break;
            case "water":
                dmg = 11;
                break;
            default:
                dmg = 10;
        }
        System.out.println(enemy.getName() + " loses " + dmg + " hp");
        enemy.hp -= dmg;
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " left");
    }
    public void leechSeed(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with leechseed");
        // check type + determine damage
        int  dmg;
        switch (enemy.getType()){
            case "electric":
                dmg = 20;
                break;
            case "fire":
                dmg = 18;
                break;
            case "water":
                dmg = 16;
                break;
            default:
                dmg = 15;
        }
        System.out.println(enemy.getName() + " loses " + dmg + " hp");
        enemy.hp -= dmg;
        name.hp += dmg;
        System.out.println("You gain " + dmg + "hp, you now have " + name.hp + "hp");

        System.out.println(enemy.getName() + " has " + enemy.getHp() + " left");
    }
    public void leaveBlade(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with leaveblade");
        // check type + determine damage
        int  dmg;
        switch (enemy.getType()){
            case "electric":
                dmg = 5;
                break;
            case "fire":
                dmg = 4;
                break;
            case "water":
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
