import java.util.List;

public class PokemonGymOwner {

    private final String name;
    private final String town;
    private List<Pokemon> pokemons;

    public PokemonGymOwner(String name, String town, List<Pokemon> pokemons) {
        this.name = name;
        this.town = town;
        this.pokemons = pokemons;
    }

    public String getName() {
        return name;
    }

    public List<Pokemon> getPokemons() {
        return pokemons;
    }

    public String getTown() {
        return town;
    }

}
