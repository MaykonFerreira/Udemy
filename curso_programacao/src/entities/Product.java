package entities;

public class Product {
	public String nome;
	public double price;
	public int qtde;
	
	
// Melhora a forma de Programar e simplifica evitando erro na programa��o
	public Product(String nome, double price, int qtde) {
		this.nome = nome ;
		this.price = price;
		this.qtde = qtde;
	}
	public Product() {

	}
	// Melhora a forma de Programar e simplifica evitando erro na programa��o
		public Product(String nome, double price) {
			this.nome = nome ;
			this.price = price;
			this.qtde = 0; // n�o precisa informar valor padr�o
		}	
	public void add(int qtde) {
		/* this � usado para instaciar a variavel principar da Classe
		 * quando se usa o mesmo nome ( ex qtde ) 
		 */
		this.qtde += qtde;
	}
	public void ret (int qtde) {
		this.qtde -= qtde;
	}
	public double valorestoque() {
		return price * this.qtde;
	}
	public String toString() {
		return nome + " , R$ "
	           + String.format("%.2f", price) + " , " +
				qtde + " unit , total R$ " + String.format("%.2f",valorestoque());
	}

}
