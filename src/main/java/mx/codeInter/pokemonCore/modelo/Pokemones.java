package mx.codeInter.pokemonCore.modelo;

public class Pokemones{
   private int id;
    private String apodo;
    private String tipos;
    private String especie;
    private int ataque;
    private int defensa;
    private int salud;
    private int numero;

    public Pokemones(){}

    public Pokemones(int id, String apodo, String tipos, String especie, int ataque, int defensa, int salud, int numero) {
        this.id = id;
        this.apodo = apodo;
        this.tipos = tipos;
        this.especie = especie;
        this.ataque = ataque;
        this.defensa = defensa;
        this.salud = salud;
        this.numero = numero;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public void setTipos(String tipos) {
        this.tipos = tipos;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getId() {
        return id;
    }

    public String getApodo() {
        return apodo;
    }

    public String getTipos() {
        return tipos;
    }

    public String getEspecie() {
        return especie;
    }

    public int getAtaque() {
        return ataque;
    }

    public int getDefensa() {
        return defensa;
    }

    public int getSalud() {
        return salud;
    }

    public int getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return "Pokemones{" +
                "id=" + id +
                ", apodo='" + apodo + '\'' +
                ", tipos='" + tipos + '\'' +
                ", especie='" + especie + '\'' +
                ", ataque=" + ataque +
                ", defensa=" + defensa +
                ", salud=" + salud +
                ", numero=" + numero +
                '}';
    }
}