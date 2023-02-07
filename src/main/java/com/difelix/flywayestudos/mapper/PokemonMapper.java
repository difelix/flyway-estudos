package com.difelix.flywayestudos.mapper;

import com.difelix.flywayestudos.controller.dto.PokemonRequest;
import com.difelix.flywayestudos.controller.dto.PokemonResponse;
import com.difelix.flywayestudos.domain.Pokemon;
import org.springframework.stereotype.Component;

@Component
public class PokemonMapper {

  private PokemonMapper() {

  }

  public static Pokemon toEntity(PokemonRequest pokemonRequest) {
    return Pokemon.builder()
        .name(pokemonRequest.getName())
        .type(pokemonRequest.getType())
        .hasEvolution(pokemonRequest.isHasEvolution())
        .evolutions(pokemonRequest.getEvolutions())
        .build();
  }

  public static PokemonResponse toResponse(Pokemon pokemon) {
    return PokemonResponse.builder()
        .id(pokemon.getId())
        .name(pokemon.getName())
        .type(pokemon.getType())
        .hasEvolution(pokemon.isHasEvolution())
        .evolutions(pokemon.getEvolutions())
        .build();
  }
}
