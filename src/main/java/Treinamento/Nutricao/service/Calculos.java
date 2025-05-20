package Treinamento.Nutricao.service;

import Treinamento.Nutricao.model.Exame;

public class Calculos {
    private Exame exame;

    public Calculos (Exame exame) {
        this.exame = exame;
    }
    
    public double getIMC() {
        double altura = exame.getAltura();
        double peso = exame.getPeso();
        return peso / (altura * altura);
    }
}
