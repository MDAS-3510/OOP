package aula01;

public class Caneta {
	String modelo;
	String cor;
	float ponta;
	int carga;
	Boolean tampada; 

	void status() {
		System.out.println("Uma caneta " + this.cor);
		System.out.println("Esta Tampada " + this.tampada);
		System.out.println("Modelo " + this.modelo);
		System.out.println("Carga " + this.carga);
		System.out.println("Ponta "  + this.ponta);
		
	}
	
	
	void rabiscar() {
		if (this.tampada == true) {
			System.out.println("Erro não posso rabisar");
		} else {
			System.out.println("estou rabiscando");
		}
	}
	
	void tampar() {
		this.tampada = true;
	}
	
	void destampar() {
		this.tampada = false;
	}


}
