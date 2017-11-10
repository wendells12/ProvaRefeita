package main;
import model.*;
import control.*;


public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
BDSimulado bds = new BDSimulado();
ControlePesquisaCliente cpc = new ControlePesquisaCliente(bds);
cpc.pesquisarCliente();
	}

}
