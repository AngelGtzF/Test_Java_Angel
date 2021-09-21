package mx.codeInter.pokemonCore.controller;

import mx.codeInter.pokemonCore.modelo.Pokemones;
import mx.codeInter.pokemonCore.service.IPkmnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PkmnController {

    @Autowired
    private IPkmnService service;

    @RequestMapping("/pokemonEspecies")
    public String listaEspeciess(Model model){
      //  model.addAllAttributes("pokemones", service.listarPkmnEspecie(especie));
        return "index";
    }

    @GetMapping("/capturar")
    public String formCaptura(){
        return "agregar";
    }
    @PostMapping("/capturarPokemon")
    public String capturarPkmn(@Validated Pokemones p){
        service.capturarPkmn(p);
        return "redirect:/pokemonEspecies";
    }
    /*
    @RequestMapping("fase1")
    public String parte1(){
        return "Mama huevo";

    }
    */
}
