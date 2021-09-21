package mx.codeInter.pokemonCore.service;

import mx.codeInter.pokemonCore.modelo.Pokemones;

import java.util.List;

public interface IPkmnService {
    List<Pokemones> listarPkmnEspecie(String especie);
    Pokemones mostrarPkmnApodo(String apodo);
    int capturarPkmn(Pokemones p);
}
