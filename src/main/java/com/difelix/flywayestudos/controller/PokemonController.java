package com.difelix.flywayestudos.controller;

import com.difelix.flywayestudos.controller.dto.PokemonRequest;
import com.difelix.flywayestudos.controller.dto.PokemonResponse;
import com.difelix.flywayestudos.domain.Pokemon;
import com.difelix.flywayestudos.mapper.PokemonMapper;
import com.difelix.flywayestudos.service.PokemonService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pokemon")
public class PokemonController {

  private final PokemonService pokemonService;

  public PokemonController(PokemonService pokemonService) {
    this.pokemonService = pokemonService;
  }

  @PostMapping
  @ResponseBody
  @ResponseStatus(HttpStatus.CREATED)
  public PokemonResponse create(@RequestBody PokemonRequest pokemonRequest) {
    final Pokemon pokemon = pokemonService.save(PokemonMapper.toEntity(pokemonRequest));
    return PokemonMapper.toResponse(pokemon);
  }
}
