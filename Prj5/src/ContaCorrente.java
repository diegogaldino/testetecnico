
public class ContaCorrente {

	private String numConta;
	private String nomeCorren;
	private double saldo;

	public ContaCorrente(String numConta, String nomeCorren ){
		this.numConta=numConta;
		this.nomeCorren=nomeCorren;
		this.saldo=0;
	}

	public void alterarNome(String nome){
		this.nomeCorren = nome;
	}
	
	public void deposito(double valor){
		this.saldo+=valor;
	}
	
	public void saque(double valor){
		this.saldo-=valor;		
	}
	

}
