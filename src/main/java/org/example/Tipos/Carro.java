package org.example.Tipos;

import org.example.Veiculo;

public class Carro extends Veiculo {

    protected TipoCarro tipoCarro;
    protected double consumo;

    public Carro(String marca, String modelo, int ano, int capacidadePassageiros, double combustivel, TipoCarro tipoCarro) {
        super(marca, modelo, ano, capacidadePassageiros, combustivel );
        this.tipoCarro = tipoCarro;
        this.consumo = 12;
        this.combustivel = 50;
    }


    @Override
    public void calcularAutonomia() {
        double autonomia = this.combustivel * this.consumo;

        System.out.println("Autonomia: " + autonomia + " km");
    }








}
