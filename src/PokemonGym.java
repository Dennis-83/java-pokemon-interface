import java.util.List;

public interface PokemonGym {

    default void enteredTheGym(PokemonTrainer player) {
    }

    default void printPokemon(List<Pokemon> pokemons) {
    }

    default Pokemon selectPokemon(String pokemon, PokemonTrainer trainer){
        return trainer.getPokemons().get(0);
    }

    default void fightRound(PokemonTrainer trainer, PokemonGymOwner owner, Pokemon pokemon, Pokemon gymPokemon) {
    }

    default Pokemon chooseGymPokemon(PokemonGymOwner gymOwner) {
        return gymOwner.getPokemons().get(0);
    }

    default Pokemon choosePokemon(PokemonTrainer trainer) {
        return trainer.getPokemons().get(0);
    }

    default int randomAttackByGymOwner(){
        return 1;
    }

    default String chooseAttackPlayer(Pokemon pokemon) {
        return "";
    }

    default void performAttackPlayer(Pokemon pokemon, Pokemon gymPokemon, String attack){
    }

    default void gymOwnerAttacks(Pokemon gymPokemon, Pokemon pokemon) {
    }

    default void attackOrChange(Pokemon pokemon, Pokemon gymPokemon, PokemonTrainer trainer, PokemonGymOwner owner) {
    }



}
