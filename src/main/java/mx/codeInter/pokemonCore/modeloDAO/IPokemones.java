package mx.codeInter.pokemonCore.modeloDAO;

import mx.codeInter.pokemonCore.modelo.Pokemones;

import java.util.List;

//Metodos para alamacenar un pokemon, consultar pokemon segun su apodo, consultar lista de capturados de misma especie
public interface IPokemones {
     List<Pokemones> listarPkmnEspecie(String especie);
     Pokemones mostrarPkmnApodo(String apodo);
     int capturarPkmn(Pokemones p);

}
