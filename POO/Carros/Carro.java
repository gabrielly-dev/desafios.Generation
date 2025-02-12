package desafios.POO.Carros;

class Carro {
	private String cor ;
	private String modelo;
	private String placa;
	private int ano;
	private String fabricante;
	private int velocidadeMaxima;
	private double potenciaMotor;
	private int tipoCombustivel;
	private double quilometragem;
	private String chassi;
	
	public Carro(String cor, String modelo, String placa, int ano, String fabricante, int velocidadeMaxima,
			double potenciaMotor, int tipoCombustivel, double quilometragem, String chassi) {
		super();
		this.cor = cor;
		this.modelo = modelo;
		this.placa = placa;
		this.ano = ano;
		this.fabricante = fabricante;
		this.velocidadeMaxima = velocidadeMaxima;
		this.potenciaMotor = potenciaMotor;
		this.tipoCombustivel = tipoCombustivel;
		this.quilometragem = quilometragem;
		this.chassi = chassi;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public int getVelocidadeMaxima() {
		return velocidadeMaxima;
	}

	public void setVelocidadeMaxima(int velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}

	public double getPotenciaMotor() {
		return potenciaMotor;
	}

	public void setPotenciaMotor(double potenciaMotor) {
		this.potenciaMotor = potenciaMotor;
	}

	public int getTipoCombustivel() {
		return tipoCombustivel;
	}

	public double getQuilometragem() {
		return quilometragem;
	}

	public void setQuilometragem(double quilometragem) {
		this.quilometragem = quilometragem;
	}

	public String getChassi() {
		return chassi;
	}

	public void setChassi(String chassi) {
		this.chassi = chassi;
	}

	public void setTipoCombustivel(int tipoCombustivel) {
		this.tipoCombustivel = tipoCombustivel;
	}
	
	
	
}
