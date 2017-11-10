package model;
import java.time.*;
public class Ligacao {
//atributos
	private int codigo;
	private String numTelDest;
	private LocalDateTime dataHoraInicio;
	private LocalDateTime dataHoraFim;
	private String cidadeDestino;
	private String ufDestino;
	private Cliente cliente;
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNumTelDest() {
		return numTelDest;
	}
	public void setNumTelDest(String numTelDest) {
		this.numTelDest = numTelDest;
	}
	public LocalDateTime getDataHoraInicio() {
		return dataHoraInicio;
	}
	public void setDataHoraInicio(LocalDateTime dataHoraInicio) {
		this.dataHoraInicio = dataHoraInicio;
	}
	public LocalDateTime getDataHoraFim() {
		return dataHoraFim;
	}
	public void setDataHoraFim(LocalDateTime dataHoraFim) {
		this.dataHoraFim = dataHoraFim;
	}
	public String getCidadeDestino() {
		return cidadeDestino;
	}
	public void setCidadeDestino(String cidadeDestino) {
		this.cidadeDestino = cidadeDestino;
	}
	public String getUfDestino() {
		return ufDestino;
	}
	public void setUfDestino(String ufDestino) {
		this.ufDestino = ufDestino;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Ligacao(int codigo, String numTelDest, LocalDateTime dataHoraInicio, LocalDateTime dataHoraFim,
			String cidadeDestino, String ufDestino, Cliente cliente) {
		super();
		this.codigo = codigo;
		this.numTelDest = numTelDest;
		this.dataHoraInicio = dataHoraInicio;
		this.dataHoraFim = dataHoraFim;
		this.cidadeDestino = cidadeDestino;
		this.ufDestino = ufDestino;
		this.cliente = cliente;
	}
	
	
	
}
