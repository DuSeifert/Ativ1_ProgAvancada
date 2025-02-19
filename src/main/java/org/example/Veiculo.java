package org.example;

public abstract class Veiculo {

    protected String marca;
    protected String modelo;
    protected int ano;
    protected int capacidadePassageiro;
    protected double combustivel;

    public Veiculo(String marca, String modelo, int ano, int capacidadePassageiro, double combustivel) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.capacidadePassageiro = capacidadePassageiro;
        this.combustivel = combustivel;
    }


    public abstract void calcularAutonomia();

    public String exibirDetalhes(){
        return  "{" +
                "\n\tMarca: " + this.marca +
                "\n\tModelo: " + this.modelo +
                "\n\tAno: " + this.ano +
                "\n\tCapacidade de passageiros: " + this.capacidadePassageiro +
                "\n\tTanque: " + this.combustivel +
                "L\n}";
    }


}
