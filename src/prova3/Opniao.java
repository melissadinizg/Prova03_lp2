/**
 * 
 */
package prova3;

/**
 * @author Melissa
 *
 */
public class Opniao {
	int nota;
	String comentario;
	String autor;
	
	/**
	 * @param nota
	 * @param comentario
	 * @param autor
	 */
	public Opniao(int nota, String comentario, String autor) {
		this.nota = nota;
		this.comentario = comentario;
		this.autor = autor;
	}

	/**
	 * @return the nota
	 */
	public int getNota() {
		return nota;
	}

	/**
	 * @param nota the nota to set
	 */
	public void setNota(int nota) {
		this.nota = nota;
	}

	/**
	 * @return the comentario
	 */
	public String getComentario() {
		return comentario;
	}

	/**
	 * @param comentario the comentario to set
	 */
	public void setComentario(String comentario) {
		this.comentario = comentario;
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

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return getAutor() + " recomendou este livro\n"+ "Nota: " + getNota() + "\n" + getComentario();
	}
	

}
