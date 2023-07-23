import java.util.ArrayList;
import java.util.List;

public class PokemonTrainer {

    private List<Pokemon> pokemons;
    private final String name;


    public PokemonTrainer(String name,List<Pokemon> pokemons) {
        this.pokemons = pokemons;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Pokemon> getPokemons() {
        return pokemons;
    }

}
