package entities;

public class Product_GS {
	private String nome;
	private double price;
	private int qtde;
	
	
// Melhora a forma de Programar e simplifica evitando erro na programa��o
	public Product_GS(String nome, double price, int qtde) {
		this.nome = nome ;
		this.price = price;
		this.qtde = qtde;
	}
	public Product_GS() {

	}
	// Melhora a forma de Programar e simplifica evitando erro na programa��o
		public Product_GS(String nome, double price) {
			this.nome = nome ;
			this.price = price;
			this.qtde = 0; // n�o precisa informar valor padr�o
		}	
		public void setName (String nome) {
			this.nome = nome;
		}
		public String getName () {
			return nome;
		}
		
		public void setPrice (double price) {
			this.price = price;
		}
		public double getPrice () {
			return price;
		}		
		public int getQtde () {
			return qtde;
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
