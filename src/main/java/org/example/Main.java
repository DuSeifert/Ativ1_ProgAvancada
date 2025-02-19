package org.example;

import org.example.Tipos.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Carro carro = new Carro("Volkswagen", "Fox", 2015, 5, 0, TipoCarro.HATCH);
        CarroEletrico carroEletrico = new CarroEletrico("BYD", "Dolphin", 2024, 4, 0, TipoCarro.HATCH, 50);
        Caminhao caminhao = new Caminhao("Mercedez-Benz", "1310", 1990, 3, 0, 4);
        CaminhaoRefrierado caminhaoRefrierado = new CaminhaoRefrierado("Fiat", "Fiorino", 2005, 2, 0, 1, -10);
        Onibus onibus = new Onibus("Scannia", "verde", 2020, 40, 0, 6);



        Scanner sc = new Scanner(System.in);
        int opc;

        do{
            System.out.println("\n\tEscolha qual veículo gostaria de ver (Digite '0' para sair):");
            System.out.println("\n1 -- Carro\n2 -- Carro elétrico\n3 -- Caminhão\n4 -- Caminhão refrigerado\n5 -- Ônibus\n\n0 -- Sair");

            do{
                opc = sc.nextInt();
                sc.nextLine();
            }while(opc <0 || opc > 5);

            switch(opc){
                case 1:
                    System.out.println(carro.exibirDetalhes());
                    carro.calcularAutonomia();
                    break;
                case 2:
                    System.out.println(carroEletrico.exibirDetalhes());
                    carroEletrico.calcularAutonomia();
                    break;
                case 3:
                    System.out.println(caminhao.exibirDetalhes());
                    caminhao.calcularAutonomia();
                    break;
                case 4:
                    System.out.println(caminhaoRefrierado.exibirDetalhes());
                    caminhaoRefrierado.calcularAutonomia();
                    break;
                case 5:
                    System.out.println(onibus.exibirDetalhes());
                    onibus.calcularAutonomia();
                    break;
            }


            System.out.println("\n");
        }while(opc != 0);

        System.out.println("Bye bye :D");

    }
}