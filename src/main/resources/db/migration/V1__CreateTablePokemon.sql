CREATE TABLE IF NOT EXISTS pokemon (
  id bigint primary key,
  name VARCHAR(100) not null unique,
  type VARCHAR(100) not null,
  has_evolution BOOLEAN not null
);

CREATE INDEX IF NOT EXISTS idx_pokemon_name ON pokemon(name);

