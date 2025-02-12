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
		leitura.nextLine();
		String fabricante = leitura.nextLine();

		
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
		leitura.nextLine();
		int combustivel = leitura.nextInt();
		

		
		System.out.println("Qual a quilometragem do carro? Digite abaixo: ");
		double quilometragem = leitura.nextDouble();
		
		System.out.println("Qual a chassi do carro? Digite abaixo: ");
		leitura.nextLine();
		String chassi = leitura.nextLine();

		
		
		
		Carro carro1 = new Carro(cor, modelo, placa, ano, fabricante, velocidadeMax, potenciaMotor, combustivel, quilometragem, chassi);
		
		String saidaCombustivel = "";
		
		switch(combustivel) {
		case 1:
			saidaCombustivel = "Gasolina";
			break;
		case 2: 
			saidaCombustivel = "Diesel";
			break;
		case 3:
			saidaCombustivel = "Etanol";
			break;
		case 4:
			saidaCombustivel = "Gás Natural Veicular (GNV)";
			break;
		case 5:
			saidaCombustivel = "Elétrico";
			break;
		}
		
		System.out.println(
						"Modelo: " + carro1.getModelo() + "\n" + 
						"Fabricante: " + carro1.getFabricante() + "\n" +
						"Cor: " + carro1.getCor() + "\n" +
						"Ano: " + carro1.getAno() + "\n"  +
						"Velocidade Máxima: " + carro1.getVelocidadeMaxima() + "\n" +
						"Potência do Motor: " +  carro1.getPotenciaMotor() + "\n" +
						"Tipo de Combustível: " + saidaCombustivel + "\n" +
						"Quilometragem: " + carro1.getQuilometragem() + "\n" +
						"Chassi: " + carro1.getChassi() + "\n" +
						"Placa: " + carro1.getPlaca()
						);

	}

}
