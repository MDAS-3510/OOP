package aula01;

public class aula1 {
	public static void main(String[] args) {
		
		Caneta c1 = new Caneta();
		c1.cor = "Azul";
		c1.ponta = 0.5f;
		c1.tampar();
		c1.rabiscar();
		c1.status();
		
		System.out.println("             ");
		System.out.println("=============");
		System.out.println("=============");
		System.out.println("             ");
		
		Caneta c2 = new Caneta();
		
		c2.modelo = "Hostnet";
		c2.cor = "vermelho";
		c2.destampar();
		c2.rabiscar();
		c2.status();
	}
	
}
