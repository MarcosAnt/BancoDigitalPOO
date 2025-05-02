package main;
import clientes.Cliente;
import contas.Conta;
import contas.ContaCorrente;
import contas.ContaPoupanca;

public class Main {

	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		cliente.setNome("João das Neves");
		
		Conta cc = new ContaCorrente(cliente);
		Conta poupanca = new ContaPoupanca(cliente);

		cc.depositar(1000);
		cc.transferir(800, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
