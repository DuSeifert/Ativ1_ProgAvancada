package org.example.Tipos;

import org.example.Veiculo;

public class Caminhao extends Veiculo {

    protected double capacidadeCarga;
    private double consumo;

    public Caminhao(String marca, String modelo, int ano, int capacidadePassageiro, double combustivel, double capacidadeCarga) {
        super(marca, modelo, ano, capacidadePassageiro, combustivel);
        this.capacidadeCarga = capacidadeCarga;
        this.combustivel = 300;
        this.consumo = 6;
    }

    @Override
    public void calcularAutonomia() {
        double autonomia;

        if(capacidadeCarga > 25){
            autonomia = (consumo * 0.75) * combustivel;
        }
        else{
            autonomia = (consumo *  (100 - capacidadeCarga) / 100) * combustivel;
        }

        System.out.println("Autonomia: " + autonomia + " km");
    }




}
