package control;
import view.*;
import model.*;
public class ControlePesquisaCliente {
//atributo
	private BDSimulado bds;

public ControlePesquisaCliente(BDSimulado bds) {
	super();
	this.bds = bds;
}
	
public void pesquisarCliente(){
	ViewPesquisaCliente vpc = new ViewPesquisaCliente();
	String nome = vpc.exibirPesquisaCliente();
	
	String dadosCliente = this.bds.getInfoCliente(nome);
	
	ViewExibeCliente vec = new ViewExibeCliente();
	vec.exibirCliente(dadosCliente);
}

}
