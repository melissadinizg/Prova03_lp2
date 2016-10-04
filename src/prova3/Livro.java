/**
 * 
 */
package prova3;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.TreeSet;

/**
 * @author Melissa
 *
 */
public class Livro {
	private String titulo;
	private String autor;
	private int anoLancamento;
	private String isbn;
	private ArrayList<Opniao> opnioes;
	
	/**
	 * @param titulo
	 * @param autor
	 * @param ano
	 * @param isbn
	 */
	public Livro(String titulo, String autor, int ano, String isbn) {
		this.opnioes = new ArrayList<>();
		this.titulo = titulo;
		this.autor = autor;
		this.anoLancamento = ano;
		this.isbn = isbn;
	}

	/**
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * @param titulo the titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	/**
	 * @return the autor
	 */
	public String getAutor() {
		return autor;
	}

	/**
	 * @param autor the autor to set
	 */
	public void setAutor(String autor) {
		this.autor = autor;
	}

	/**
	 * @return the ano
	 */
	public int getAnoLancamento() {
		return anoLancamento;
	}

	/**
	 * @param ano the ano to set
	 */
	public void setAnoLancamento(int ano) {
		this.anoLancamento = ano;
	}

	/**
	 * @return the isbn
	 */
	public String getISBN() {
		return isbn;
	}

	/**
	 * @return the isbn
	 */
	public String getIsbn() {
		return isbn;
	}

	/**
	 * @param isbn the isbn to set
	 */
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	/**
	 * @return the opnioes
	 */
	public ArrayList<Opniao> getOpnioes() {
		return opnioes;
	}

	/**
	 * @param opnioes the opnioes to set
	 */
	public void setOpnioes(ArrayList<Opniao> opnioes) {
		this.opnioes = opnioes;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((isbn == null) ? 0 : isbn.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Livro)) {
			return false;
		}
		Livro outro = (Livro) obj;
		
		if (getISBN().equalsIgnoreCase(outro.getISBN())) {
			return true;
		}
		
		return false;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return getTitulo() + " (ISBN " + getISBN() + ") , " + getAnoLancamento()	;
	}

	
	
}
