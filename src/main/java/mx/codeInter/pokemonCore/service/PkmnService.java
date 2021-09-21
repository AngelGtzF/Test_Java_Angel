package mx.codeInter.pokemonCore.service;

import mx.codeInter.pokemonCore.modelo.Pokemones;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PkmnService implements IPkmnService {

    @Autowired
    private IPkmnService dao;
    @Override
    public List<Pokemones> listarPkmnEspecie(String especie) {
        return dao.listarPkmnEspecie(especie);
    }

    @Override
    public Pokemones mostrarPkmnApodo(String apodo) {
        return null;
    }

    @Override
    public int capturarPkmn(Pokemones p) {
        dao.capturarPkmn(p);
        return 0;
    }
}
