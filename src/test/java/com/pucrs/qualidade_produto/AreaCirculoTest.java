package com.pucrs.qualidade_produto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class AreaCirculoTest {
    private AreaCirculo ac = new AreaCirculo();

    @Test
    void teste(){
        String resposta = ac.calculaArea(2);
        Assertions.assertEquals(resposta, "A=12.56636");
    }
}
