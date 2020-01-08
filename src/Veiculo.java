import java.util.Scanner;

public class Veiculo {

	private String Marca;
	private String Modelo;
	private String Placa;
	private String Cor;
	private float KM;
	boolean Ligado;
	private int litrosCombustivel;
	private int Velocidade;
	private Double Preco;

	public Veiculo(String Marca, String Modelo, String Placa, String Cor, float KM, boolean Ligado,
			int litrosCombustivel, int Velocidade, Double Preco) {
		this.Marca = Marca;
		this.Modelo = Modelo;
		this.Placa = Placa;
		this.Cor = Cor;
		this.KM = KM;
		this.Ligado = Ligado;
		this.litrosCombustivel = litrosCombustivel;
		this.Velocidade = Velocidade;
		this.Preco = Preco;
	}

	public String getMarca() {
		return Marca;
	}

	public void setMarca(String Marca) {
		this.Marca = Marca;
	}

	public String getModelo() {
		return Modelo;
	}

	public void setModelo(String Modelo) {
		this.Modelo = Modelo;
	}

	public String getPlaca() {
		return Placa;
	}

	public void setPlaca(String Placa) {
		this.Placa = Placa;
	}

	public String getCor() {
		return Cor;
	}

	public void setCor(String Cor) {
		this.Cor = Cor;
	}

	public float getKM() {
		return KM;
	}

	public void setKM(float KM) {
		this.KM = KM;
	}

	public boolean getLigado() {
		return Ligado;
	}

	public void setLigado(boolean Ligado) {
		this.Ligado = Ligado;
	}

	public int getlitrosCombustivel() {
		return litrosCombustivel;
	}

	public void setlitrosCombustivel(int litrosCombustivel) {
		this.litrosCombustivel = litrosCombustivel;
	}

	public int getVelocidade() {
		return Velocidade;
	}

	public void setVelocidade(int Velocidade) {
		this.Velocidade = Velocidade;
	}

	public Double getPreco() {
		return Preco;
	}

	public void setPreco(Double preco) {
		Preco = preco;
	}

	public void ligar() {
		if (this.Ligado == true) {
			int veloini = 0;
			System.out.println("Veiculo acabou de ser ligado");
			veloini = Velocidade;
		} else {
			System.out.println("Veiculo desligado!!");
		}

	}

	public void desligar() {
		if (this.Ligado == true) {
			Velocidade = 0;
			System.out.println("Veiculo acabou de ser desligado");
		} else {
			System.out.println("Veiculo ja esta desligado");
		}

	}

	public void Acelerar() {

		if (Ligado == true && litrosCombustivel > 1 && Velocidade !=0) {
			
			while(Velocidade<230 ) {
			this.Velocidade=Velocidade + 20;
			this.litrosCombustivel = litrosCombustivel - 1;
			System.out.println("Sua velocidade é: " + Velocidade);
			System.out.println("Quantidade de Combustivel: " + litrosCombustivel);
		} 
			
		}else {
			System.out.println("Impossivel acelerar o Veiculo,se encotra esta desligado");
		}
	}
	public void Abastecer() {
		if(Ligado== false) {
		while(litrosCombustivel<=40) {			
			}
		}else {System.out.println("Desligue o veiculo para abastecer");
		this.Ligado =true;
		System.out.println("Veiculo foi desligado");
		this.litrosCombustivel= litrosCombustivel + 20;
		System.out.println("Abasteceu 20");
		System.out.println("Total de combustivel "+litrosCombustivel+"Litros");
		}
	}
	public void frear() {
		if(Ligado==true) {
			while(Velocidade>0 ) {
				this.Velocidade= Velocidade-10;
				System.out.println("Freiou,Velocidade Atual esta em "+ Velocidade);
			}
		}
	}
	public void Pintar() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Selecione qual a cor que deseja pintar");
		Cor=sc.next();
		System.out.println("O veiculo foi pintado para cor: "+Cor);
	}
}
	
	
	
	
	
	

