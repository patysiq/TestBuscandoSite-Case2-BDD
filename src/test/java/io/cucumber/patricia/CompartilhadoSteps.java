package io.cucumber.patricia;

import io.cucumber.patricia.services.Configuracao;
import io.cucumber.java.pt.*;

public class CompartilhadoSteps{
    @Dado("que eu estou no site da gama academy")
    public void que_eu_estou_no_site_da_gama_academy() {
        Configuracao.abrir("https://www.gama.academy");
        
    }
}