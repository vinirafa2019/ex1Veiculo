import java.util.Scanner;

public class main {

	public static void main(String[] args) {
	
		Veiculo Prisma = new Veiculo("Chevrolet","Prisma","DQN8723","Preto",32000,true,50,30,32000.); 
		
		System.out.println("Marca "+Prisma.getMarca());
		System.out.println("Modelo "+Prisma.getModelo());
		System.out.println("Placa "+Prisma.getPlaca());
		System.out.println("Cor "+Prisma.getCor());
		System.out.println("O carro tem "+Prisma.getKM()+"km Rodado");
		System.out.println("O veiculo vale "+Prisma.getPreco());
		
		Prisma.ligar();
		Prisma.Acelerar();
		Prisma.frear();		
		Prisma.Abastecer();
		Prisma.desligar();
		Prisma.Pintar();
		}

}
