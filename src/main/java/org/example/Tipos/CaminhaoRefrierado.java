package org.example.Tipos;

public class CaminhaoRefrierado extends Caminhao{

    private double temperaturaMinima;
    private double consumo;

    public CaminhaoRefrierado(String marca, String modelo, int ano, int capacidadePassageiro, double combustivel, double capacidadeCarga, double temperaturaMinima) {
        super(marca, modelo, ano, capacidadePassageiro, combustivel, capacidadeCarga);
        this.consumo = 6;
        this.temperaturaMinima = temperaturaMinima;
    }

    @Override
    public void calcularAutonomia() {
        double autonomia;

        if(capacidadeCarga > 25){
            autonomia = (consumo * 0.75) * combustivel;
        }
        else{
            autonomia = (consumo * ( (100 - capacidadeCarga) / 100  )) * combustivel;
        }

        System.out.println("Autonomia: " + autonomia * 0.9 + " km");
    }


}
