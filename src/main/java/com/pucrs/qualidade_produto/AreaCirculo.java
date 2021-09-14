package com.pucrs.qualidade_produto;

public class AreaCirculo {
    private final double pi = 3.14159;
    private double raio;
    private double area;

    public AreaCirculo() {

    }

    public String calculaArea(double raio){
        this.raio = raio;
        this.area = pi * Math.pow(raio, 2);
        String resposta = "A=" + String.valueOf(area);
        return resposta;
    }

    public double getPi() {
        return pi;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
}
