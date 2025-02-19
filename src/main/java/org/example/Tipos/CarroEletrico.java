package org.example.Tipos;

public class CarroEletrico extends Carro{

    private double bateriakWh;
    private double consumo;


    public CarroEletrico(String marca, String modelo, int ano, int capacidadePassageiros, double combustivel, TipoCarro tipoCarro, double bateria) {
        super(marca, modelo, ano, capacidadePassageiros, combustivel, tipoCarro);
        this.bateriakWh = bateria;
        this.consumo = 5;
    }

    @Override
    public void calcularAutonomia() {
        double autonomia = this.consumo * this.bateriakWh;

        System.out.println("Autonomia: " + autonomia + " km");
    }


}
