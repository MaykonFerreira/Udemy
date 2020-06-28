package entities;

public class Encapsulamento {
	public int numero;
	private String nome = "Maykon";
	public double valor = 0;
	public double saldo = 0;
	public double taxaSaque = 5.00;
	public int getNumero() {
		return numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public double getSaldo() {
		return saldo;
	}

	// Melhora a forma de Programar e simplifica evitando erro na programa��o
	public Encapsulamento(String nome,int numero,  double valor) {
		this.numero = numero;
		this.nome = nome;
		//this.valor = valor;
		dep(valor);
		// this.saldo = valor;
	}

	public Encapsulamento( String nome,int numero) {
		this.numero = numero;
		this.nome = nome;

		// this.saldo = valor;
	}

	public void dep(double saldo) {
		/*
		 * this � usado para instaciar a variavel principar da Classe quando se usa o
		 * mesmo nome ( ex qtde )
		 */
		System.out.println("Update account data:");
		this.saldo += saldo;
	}

	public void saque(double saldo) {
		System.out.println("Update account data:");
		this.saldo = this.saldo - (saldo + taxaSaque);
	}

	public double SD() {

		return this.saldo;
	}

	public String toString() {
		return "Account " + this.numero + " , Holder " + this.nome + " , Balance R$ "
				+ String.format("%.2f", this.saldo) + "\n";
	}
}
