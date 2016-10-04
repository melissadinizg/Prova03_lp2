/**
 * 
 */
package factory;

import prova3.Livro;

/**
 * @author Melissa
 *
 */
public class FactoryLivro {
	private String titulo;
	private String autor;
	private int anoLancamento;
	private String isbn;
	
	public Livro criaLivro(String titulo, String autor, int ano, String isbn){
		return new Livro(titulo, autor, ano, isbn);
	}

	
}
