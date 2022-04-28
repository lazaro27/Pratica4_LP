package Questao03;

import javax.swing.JOptionPane;

public class Cadastro extends Pedido{


	public static void main(String[] args) {
		
		Pedido[] p1 = new Pedido[10];
		//p1[1].setItem("Teste");
		
		String busca;
		int op = Integer.parseInt(JOptionPane.showInputDialog("Digite a Opção desejada:\n(1)Cadastrar Pedido\n(2)Buscar Item\n(3)Sair"));
		
		for(int i = 0; i<10; i++) {
		p1[i] = new Pedido();
		p1[i].setItem("Teste");
		p1[i].setAutor("teste");
		p1[i].setData("teste");
		p1[i].setDescricao("teste");
		p1[i].setLocal("teste");
		p1[i].setTotalDeItens(0);
		
		}
		
		for(int i = 0; i<10; i++) {
	
		switch(op) {
		case 1:
			
			p1[i].setItem(JOptionPane.showInputDialog("Digite o nome do Item: "));
			p1[i].setAutor(JOptionPane.showInputDialog("Digite o nome do Autor: ")); 
			p1[i].setLocal(JOptionPane.showInputDialog("Digite o Local: "));
			p1[i].setData(JOptionPane.showInputDialog("Digite a Data: "));
			p1[i].setDescricao(JOptionPane.showInputDialog("Digite a descrição: "));
			op = Integer.parseInt(JOptionPane.showInputDialog("Digite a Opção desejada:\n(1)Cadastrar Pedido\n(2)Buscar Item\n(3)Sair"));
			break;
		case 2:
			busca = JOptionPane.showInputDialog("Digite o item que deseja Buscar: ");
			JOptionPane.showMessageDialog(null, buscar(busca, p1));			
			break;
		case 3:
			break;
		}

		}
	}
	
	

}
