package modelo;

public class Estudante {

	private int id;
	private String nome;
	private String curso;
	private String tipoApresentacao;
	private String apresentacao;
	
	// Estudante NOVO: o id fica 0 porque quem gera o id e o banco.
	public Estudante(String nome, String curso, String tipoApresentacao, 
			String apresentacao) {
		this(0, nome, curso, tipoApresentacao, apresentacao );
		}
	
	// Estudante que VEIO do banco: o id ja existe.
	public Estudante(int id, String nome, String curso, String tipoApresentacao, 
			String apresentacao) {
		this.id = id;
		this.nome = nome;
		this.curso = curso;
		this.tipoApresentacao = tipoApresentacao;
		this.apresentacao = apresentacao;
		}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public String getTipoApresentacao() {
		return tipoApresentacao;
	}
	public void setTipoApresentacao(String tipoApresentacao) {
		this.tipoApresentacao = tipoApresentacao;
	}
	public String getApresentacao() {
		return apresentacao;
	}
	public void setApresentacao(String apresentacao) {
		this.apresentacao = apresentacao;
	}

	public String toString() {
		return String.format("Estudante[id=%d, nome=%s, curso=%s, tipo de apresentação=%s, apresentação: ",
		id, nome, curso, tipoApresentacao, apresentacao);
		}
	
}
