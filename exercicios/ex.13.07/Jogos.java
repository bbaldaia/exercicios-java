package ex;

public class Jogos {

	private String jogoAdicionado;
	private String tipoConsole;
	
	public String getJogoAdicionado() {
		return jogoAdicionado;
	}
	public void setJogoAdicionado(String jogoAdicionado) {
		this.jogoAdicionado = jogoAdicionado;
	}
	public Jogos(String jogoAdicionado, String tipoConsole) {
		super();
		this.jogoAdicionado = jogoAdicionado;
		this.tipoConsole = tipoConsole;
	}
	public String getTipoConsole() {
		return tipoConsole;
	}
	public void setTipoConsole(String tipoConsole) {
		this.tipoConsole = tipoConsole;
	}
	
	public String toString() {
		return "Jogo: " + this.jogoAdicionado + ", no console: " + this.tipoConsole;
	}
	
}
