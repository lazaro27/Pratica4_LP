package Questao03;

import javax.swing.JOptionPane;

public class Pedido {
	private String item, autor, local, data,descricao;
	private int totalDeItens;
	
	public Pedido(String item, String autor, String local, String data, String descricao, int totalDeItens) {
		super();
		this.item = item;
		this.autor = autor;
		this.local = local;
		this.data = data;
		this.descricao = descricao;
		this.totalDeItens = totalDeItens;
	}
	
	  public Pedido() {
		  
	  }
	  
	  

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getTotalDeItens() {
		return totalDeItens;
	}

	public void setTotalDeItens(int totalDeItens) {
		this.totalDeItens = totalDeItens;
	}
	
	public static String buscar(String item, Pedido[] p1) {
		boolean status = false;
		int pos = 0;
		
		for(int i=0; i< p1.length; i++ ) {
			//JOptionPane.showMessageDialog(null, p1[i].getItem().equals(item));
			if(p1[i].getItem().equals(item) == true) {
				
				status = true;
				pos = i;
			}		
		}
		
		if(status==true) {
			return "Item emcontrado\nLocal: " + p1[pos].getLocal() + "\nData: " + p1[pos].getData() ;
		}
		return "Item não encontrado!";
	}

}
