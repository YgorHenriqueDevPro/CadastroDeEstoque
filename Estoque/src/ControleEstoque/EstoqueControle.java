package ControleEstoque;

public class EstoqueControle {

	private int codigo;
	private int quantidadeEstoque = 0;
	private String descricaoProduto;

	public EstoqueControle(int codigo, String descricaoProduto) {

		this.codigo = codigo;
		this.quantidadeEstoque = 0;
		this.descricaoProduto = descricaoProduto;
	}

	public String verInfor() {
		return "Código: " + codigo + " || Quantidade no estoque: " + quantidadeEstoque + " || Descrição do produto: "
				+ descricaoProduto;
	}
	
	public int adicionar (int estoque) {
		return this.quantidadeEstoque += estoque;
	}
	
	public boolean excluir (int remover) {
		 if(this.quantidadeEstoque >= remover) {
				quantidadeEstoque -= remover;
				return true;
		} return false;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public void setQuantidadeEstoque(int quantidadeEstoque) {
		this.quantidadeEstoque = quantidadeEstoque;
	}

	public String getDescricaoProduto() {
		return descricaoProduto;
	}

	public void setDescricaoProduto(String descricaoProduto) {
		this.descricaoProduto = descricaoProduto;
	}

}
