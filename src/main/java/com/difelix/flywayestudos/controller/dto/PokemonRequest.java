package com.difelix.flywayestudos.controller.dto;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PokemonRequest {

  private String name;
  private String type;
  private boolean hasEvolution;
  private List<String> evolutions;
}
