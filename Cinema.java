public class Cinema {

	private static int contaCinema = 0;
	private String name;

	/** Costruttore di cinema
	 *	costruisce l'istanza
	 * @param nome Il nome del cinema
	 * @param prezzoBiglietto Il prezzo del biglietto
	 */

	public Cinema(String nome, double prezzoBiglietto) {
		this.nome = nome;
	}

	public Cinema(double prezzoBiglietto) {
		contaCinema++;
		this("Cinema_" + contaCinema, prezzoBiglietto);
	}
<<<<<<< HEAD
	
	public Cinema() {
		contaCinema++;
		this(0.0);
	}
=======

	public int lunghezza() {
		return this.nome.lentgh();
	}


>>>>>>> 786d1b8618c3e30fbaafcfbd37c072303e29d858
}
/**
 *
 */
