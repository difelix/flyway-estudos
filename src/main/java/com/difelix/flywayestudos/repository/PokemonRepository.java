package com.difelix.flywayestudos.repository;

import com.difelix.flywayestudos.domain.Pokemon;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PokemonRepository extends CrudRepository<Pokemon, Long> {

}
