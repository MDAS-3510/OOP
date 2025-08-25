package aula04;

public class BancoConta {
	
	// atributos
	
	public int numConta;
	protected String tipo;
	private String dono;
	private float saldo;
	private boolean status;
	
	
	
	
	// Getters e Setters 
	public int getNumConta() {
		return numConta;
	}
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getDono() {
		return dono;
	}
	public void setDono(String dono) {
		this.dono = dono;
	}
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	
	
	
	public BancoConta () {
		this.setSaldo(0);
		this.setStatus(false);
	}
	
	
	
	
	
	
	// metodos
	
	public void abrirConta(String t) {
		this.setTipo(t);
		this.setStatus(true);
		
		if (t == "CC") {
			this.setSaldo(50);
		} else if (t == "CP") {
			this.setSaldo(150);  
		}
		
		System.out.println("Conta aberta com sucesso");
		System.out.println("========================");
		 
	}
	
	public void fecharConta() {
		if (saldo > 0) {
			System.out.println("Conta com dinheiro");
		} else if (saldo < 0) {
			System.out.println("Conta em debito");
		} else {
			this.setStatus(false);
			System.out.println("Conta fechada com sucesso");
		}
	}
	
	public void depositar(float v) {
		if (status == true) {
			setSaldo(getSaldo() + v);		
		} else 
		System.out.println("Impossivel depositar");
	}
	
	public void sacar() {
		
	}
	
	public void pagarMensal() {
		
	}
	

}
