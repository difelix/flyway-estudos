CREATE SEQUENCE IF NOT EXISTS pokemon_id_serial;

CREATE TABLE IF NOT EXISTS pokemon (
  id bigint not null default nextval('pokemon_id_serial') primary key,
  name VARCHAR(100) not null unique,
  type VARCHAR(100) not null,
  has_evolution BOOLEAN not null
);

CREATE INDEX IF NOT EXISTS idx_pokemon_name ON pokemon(name);

