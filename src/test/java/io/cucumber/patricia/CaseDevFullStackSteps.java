package io.cucumber.patricia;


import org.openqa.selenium.By;

import static org.junit.Assert.*;
import org.openqa.selenium.WebElement;

import io.cucumber.java.pt.*;
import io.cucumber.patricia.services.Configuracao;

public class CaseDevFullStackSteps{
    @Dado("cliclo na opção Dev Full Stack")
    public void cliclo_na_opção_Dev_Full_Stack() {
        Configuracao.cssSelector(".bt-chamada.btc-alt").click();
    }

    @Então("deve ver os itens do Crie seu portfolio, Acompanhamento de Carreira, Professores de surf que sabem surfar, Estude na Melhor Startup de Educacao")
    public void deve_ver_os_itens_do_Crie_seu_portfolio_Acompanhamento_de_Carreira_Professores_de_surf_que_sabem_surfar_Estude_na_Melhor_Startup_de_Educacao() {
        Configuracao.cssSelectors("h6.heading-18.benefits-item-title");
        Configuracao.fechar();
    }
      
}


