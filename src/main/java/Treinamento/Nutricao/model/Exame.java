package Treinamento.Nutricao.model;

import Treinamento.Nutricao.service.Calculos;

public class Exame {
    private Paciente paciente;
    private double imc;
    private double kcal;

    
    private String classificacao;
    private String recomendacao;
    
    public Exame (String name, double altura, double peso, Paciente paciente) {
        this.paciente = paciente;
        
        Calculos calc = new Calculos(this);
        this.imc = calc.getIMC();
        getClassificacao(imc);
    }
    
    public String getResult() {
        return String.format(
            "Resultado do Exame\n" +
            "Nome: %s\n" +
            "Altura: %.2f\n" +
            "Peso: %.2f\n" +
            "IMC: %.2f\n" +
            "Classificação: %s\n" +
            "Recomendação: %s",
            name, altura, peso, imc, classificacao, getRecomendacao());
        }
        
        private void getClassificacao(double imc) {
            /*Aqui vc faz as condições para eterminar as recomendações.
            * abaixo do peso (IMC abaixo de 18,5), peso normal (entre 18,5 e 24,9), sobrepeso (entre 25 e 29,9) e obesidade (IMC de 30 ou mais). 
         */
        if (imc < 18.5) {
            classificacao = "Abaixo do peso.";
        } else if (18.5 < imc && imc < 24.9) {
            classificacao = "Peso normal.";
        } else if (25 < imc && imc < 29.9) {
            classificacao = "Sobrepeso.";
        } else if (imc > 30) {
            classificacao = "Obesidade.";
        }
    }
    
    public String getRecomendacao () {
        if (imc < 18.5) {
            recomendacao = "Abaixo do peso.";
        } else if (18.5 < imc && imc < 24.9) {
            recomendacao = "Peso normal.";
        } else if (25 < imc && imc < 29.9) {
            recomendacao = "Sobrepeso.";
        } else if (imc > 30) {
            recomendacao = "Obesidade.";
        }
        return recomendacao;
    }
    
    public double getKcal() {
        return kcal;
    }
    
    public double getPeso() {
        return peso;
    }
    
    public double getAltura() {
        return altura;
    }
}
