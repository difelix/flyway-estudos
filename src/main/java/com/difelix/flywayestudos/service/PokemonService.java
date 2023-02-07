package com.difelix.flywayestudos.service;

import com.difelix.flywayestudos.domain.Pokemon;
import com.difelix.flywayestudos.repository.PokemonRepository;
import org.springframework.stereotype.Service;

@Service
public class PokemonService {

  private final PokemonRepository pokemonRepository;

  public PokemonService(PokemonRepository pokemonRepository) {
    this.pokemonRepository = pokemonRepository;
  }

  public Pokemon save(Pokemon pokemon) {
    return pokemonRepository.save(pokemon);
  }
}
