package desafios.POO.Carros;

import java.util.Scanner;

public class ModeloCarro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 	private String cor ;
			private String modelo;
			private String placa;
			private int ano;
			private String fabricante;
			private int velocidadeMaxima;
			private double potenciaMotor;
			private int tipoCombustivel;
			private double quilometragem;
			private String chassi;
		 */
		
		Scanner leitura = new Scanner(System.in);
		
		System.out.println("Qual a cor do carro? Digite abaixo: ");
		String cor = leitura.nextLine();
		
		System.out.println("Qual o modelo do carro? Digite abaixo: ");
		String modelo = leitura.nextLine();
		
		System.out.println("Qual a placa do carro? Digite abaixo: ");
		String placa = leitura.nextLine();
		
		System.out.println("Qual o ano do carro? Digite abaixo: ");
		int ano = leitura.nextInt();
		
		System.out.println("Qual a fabricante do carro? Digite abaixo: ");
		String fabricante = leitura.nextLine();
		leitura.nextLine();
		
		System.out.println("Qual a velocidade máxima do carro? Digite abaixo: ");
		int velocidadeMax = leitura.nextInt();
		
		System.out.println("Qual a potência do motor do carro? Digite abaixo: ");
		double potenciaMotor = leitura.nextDouble();
		
		System.out.println("Qual o tipo de combustível do carro?\n"
				+ "Selecione 1 para Gasolina\n"
				+ "Selecione 2 para Diesel\n"
				+ "Selecione 3 para Etanol\n"
				+ "Selecione 4 para Gás Natural Veicular (GNV)\n"
				+ "Selecione 5 para Elétrico");
		int combustivel = leitura.nextInt();
		leitura.nextLine();
		

		
		System.out.println("Qual a quilometragem do carro? Digite abaixo: ");
		double quilometragem = leitura.nextDouble();
		
		System.out.println("Qual a chassi do carro? Digite abaixo: ");
		String chassi = leitura.nextLine();
		leitura.nextLine();
		
		
		
		Carro carro1 = new Carro(cor, modelo, placa, ano, fabricante, velocidadeMax, potenciaMotor, combustivel, quilometragem, chassi);
		
		if (combustivel == 1) {
			System.out.println("Gasolina");
		} else if(combustivel == 2) {
			System.out.println("Gasolina");
		} else if(combustivel == 3) {
			System.out.println("Gasolina");
		} else if (combustivel == 4) {
			System.out.println("Gasolina");
		} else if(combustivel == 5) {
			System.out.println("Gasolina");
		}
		
		System.out.println(carro1.getCor() + " " + carro1.getModelo() + " " + carro1.getPlaca() + " " + carro1.getAno() + " " + carro1.getFabricante() + " " + carro1.getVelocidadeMaxima() + " " + carro1.getPotenciaMotor() + " " + carro1.getTipoCombustivel() + " " + carro1.getQuilometragem() + " " + carro1.getChassi());
		
		

	}

}
