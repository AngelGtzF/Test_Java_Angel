package mx.codeInter.pokemonCore.modeloDAO;

import mx.codeInter.pokemonCore.modelo.Pokemones;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class PokemonesDao implements IPokemones{

    @Autowired
    private JdbcTemplate template;

    @Override
    public List<Pokemones> listarPkmnEspecie(String especie) {
        String sql="select * from pokemon where especie=" + especie;
        List<Pokemones>listaPokemones=template.query(sql, new BeanPropertyRowMapper<Pokemones>(Pokemones.class));
        return listaPokemones;
    }

    @Override
    public Pokemones mostrarPkmnApodo(String apodo) {
        return null;
    }

    @Override
    public int capturarPkmn(Pokemones p) {
        String sql="Insert into pokemon(apodo,especie,tipos,ataque,defensa,salud,numero)values(?,?,?,?,?,?,?)";
        int res =template.update(sql,p.getApodo(),p.getEspecie(),p.getTipos(),p.getAtaque(),p.getDefensa(),p.getSalud(),p.getNumero());
        return res;
    }
}
