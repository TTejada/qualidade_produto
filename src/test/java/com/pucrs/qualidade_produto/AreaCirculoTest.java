package com.pucrs.qualidade_produto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AreaCirculoTest {

    private AreaCirculo ac;

    @BeforeEach
    void setup(){
        ac = new AreaCirculo();
    }

    @Test
    void teste1(){
        String resposta = ac.calculaArea(2);
        Assertions.assertEquals("A=12.5664", resposta);
    }

    @Test
    void teste2(){
        String resposta = ac.calculaArea(100.64);
        Assertions.assertEquals("A=31819.3103", resposta );
    }

    @Test
    void teste3(){
        String resposta = ac.calculaArea(150.00);
        Assertions.assertEquals("A=70685.7750", resposta);
    }

    @Test
    void teste4(){
        String resposta = ac.calculaArea(210.00);
        Assertions.assertEquals("A=138544.1190", resposta);
    }
        @Test
    void teste5(){
        String resposta = ac.calculaArea(3);
        Assertions.assertEquals("A=28.2743", resposta);
    }

}
