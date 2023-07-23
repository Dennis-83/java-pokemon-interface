import java.util.List;

public abstract class Pokemon {

    final String name;
    Integer level;
    Integer hp;
    final String food;
    final String sound;




    protected Pokemon(String name, Integer level, Integer hp, String food, String sound) {
        this.name = name;
        this.level = level;
        this.hp = hp;
        this.food = food;
        this.sound = sound;
    }

    public String getName() {
        return name;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getHp() {
        return hp;
    }

    public void setHp(Integer hp) {
        this.hp = hp;
    }

    public String getFood() {
        return food;
    }

    public String getSound() {
        return sound;
    }

    abstract List<String> getAttacks();

    abstract String getType();
}
