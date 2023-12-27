package projeto_biblioteca;

public class Usuario implements acoesUsuarios {
	private String nome;
	private int idade;
	private String sexo;

	public Usuario(String nome, int idade, String sexo) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	@Override
	public boolean alugarLivro(Livro livro, Usuario usuario) {
		if (livro.isDisponivel()) {
			livro.setDisponivel(false);
			return true;
		}else {
			return false;
		}
	}

	@Override
	public boolean realizarDevolucao(Livro livro, Usuario usuario) {
		if (livro.isDisponivel() == false) {
			livro.setDisponivel(true);
			return true;
		}
		else {
			return false;
		}
	}
	
	
}
