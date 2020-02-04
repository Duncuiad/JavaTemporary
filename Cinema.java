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

}
/**
 *
 */
