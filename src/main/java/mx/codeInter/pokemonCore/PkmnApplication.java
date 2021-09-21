package mx.codeInter.pokemonCore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class PkmnApplication implements CommandLineRunner {
    @Autowired
    private JdbcTemplate template;
    public static void main(String... args){
        SpringApplication.run(PkmnApplication.class, args);

    }

    @Override
    public void run(String... args) throws Exception {
        template.execute("DROP TABLE POKEMON IF EXISTS");
        template.execute("CREATE TABLE POKEMON(id INTEGER(64) PRIMARY KEY auto_increment, apodo VARCHAR(255), especie VARCHAR(255), tipos VARCHAR(255), ataque INTEGER(64), defensa INTEGER(64), salud INTEGER(64), numero INTEGER(64))");


    }
}
