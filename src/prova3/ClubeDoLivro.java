/**
 * 
 */
package prova3;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;

import excecao.BuscaLivroException;
import factory.FactoryLivro;

/**
 * @author Melissa
 *
 */
public class ClubeDoLivro {
	private HashMap<String, Livro> livros;
	private FactoryLivro factory;

	public ClubeDoLivro() {
		this.livros = new HashMap<>();
		this.factory = new FactoryLivro();
	}

	public void adicionaLivro(String titulo, String autor, int ano, String isbn) throws Exception {

		InputStream is = new FileInputStream("resources_p2.csv");
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);

		String s = br.readLine(); // primeira linha

		while (s != null) {

			String[] textoSeparado = s.split(",");
			titulo = textoSeparado[0];
			autor = textoSeparado[1];
			ano = Integer.parseInt(textoSeparado[2]);
			isbn = textoSeparado[3];

			Livro livro = factory.criaLivro(titulo, autor, ano, isbn);

			livros.put(isbn, livro);

			s = br.readLine();
		}

		br.close();

	}

	public void importaLivros(String filename) throws Exception {
	}

	public Livro buscaLivro(String isbn) throws Exception {
		if (!livros.containsKey(isbn)) {
			throw new Exception("O livro nao esta no nosso acervo.");
		}
		return livros.get(isbn);

	}

	public void adicionaOpiniao(String isbn, int nota, String autor, String comentario) throws Exception {
		if (nota < 1 || nota > 5) {
			throw new Exception("Nota fora do intervalo de 1 a 5.");
		}
		
		Livro livro = livros.get(isbn);
		Opniao op = new Opniao(nota, comentario, autor);

		livro.getOpnioes().add(op);
	}

	public double getNotaGeral(String isbn) throws Exception {
		double notaGeral = 0;
		Livro livro = livros.get(isbn);

		for (Opniao op : livro.getOpnioes()) {
			notaGeral += op.getNota();
		}
		return notaGeral;
	}

	public void listaOpinioes(String isbn) throws Exception {
	}

	public void ranking(int n) throws Exception {
	}

	public static void main(String[] args) throws IOException {

	}

}
