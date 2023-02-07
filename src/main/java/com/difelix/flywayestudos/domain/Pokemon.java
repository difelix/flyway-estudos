package com.difelix.flywayestudos.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "pokemon")
public class Pokemon {

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pokemon_id_generator")
  @SequenceGenerator(name = "pokemon_id_generator", sequenceName = "pokemon_id_serial", allocationSize = 1)
  private Long id;

  @Column(name = "name", nullable = false, unique = true)
  private String name;

  @Column(name = "type", nullable = false)
  private String type;

  @Column(name = "has_evolution", nullable = false)
  private boolean hasEvolution;

  @Column(name = "evolutions")
  private List<String> evolutions;
}
