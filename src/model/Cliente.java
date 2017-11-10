package model;
import java.time.*;
public class Cliente {
//atributos
	private String nome;
	private String cpf;
	private LocalDate dataNascimento;
	private String numTel;
	private String cidade;
	private String uf;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public LocalDate getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getNumTel() {
		return numTel;
	}
	public void setNumTel(String numTel) {
		this.numTel = numTel;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	public Cliente(String nome, String cpf, LocalDate dataNascimento, String numTel, String cidade, String uf) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
		this.numTel = numTel;
		this.cidade = cidade;
		this.uf = uf;
	}
	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", cpf=" + cpf + ", dataNascimento=" + dataNascimento + ", numTel=" + numTel
				+ ", cidade=" + cidade + ", uf=" + uf + "]";
	}
	
	
}
