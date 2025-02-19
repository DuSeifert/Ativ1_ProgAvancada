package org.example.Tipos;

import org.example.Veiculo;

public class Onibus extends Veiculo {

    private double consumo;
    private int quantidadeEixos;


    public Onibus(String marca, String modelo, int ano, int capacidadePassageiro, double combustivel, int eixos) {
        super(marca, modelo, ano, capacidadePassageiro, combustivel);
        this.combustivel = 200;
        this.consumo = 5;
        this.quantidadeEixos = eixos;
    }

    @Override
    public void calcularAutonomia() {
        if(quantidadeEixos < 6 || quantidadeEixos > 8){
            System.out.println("Quantidade de eixos não permitida");
        }
        else{
            System.out.println("Autonomia: " + consumo*combustivel);
        }
    }
}
