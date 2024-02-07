package ControleEstoque;

import java.util.Iterator;

public class TesteEstoque {

	public static void main(String[] args) {

		EstoqueControle[] estoque = new EstoqueControle[1];

		while (true) {
			int op = Teclado.lerInteiro(
					"ESCOLHA A OPÇÃO DESEJADA:\n1-Cadastrar produto \n2-Consultar estoque  \n3-Excluir \n4-Incluir \n5-Sair");
			switch (op) {
			case 1:
				int codigo = Teclado.lerInteiro("Digite o código do produto:");
				String descricaoProduto = Teclado.lerString("Digite a descrição do produto:");
				EstoqueControle est = new EstoqueControle(codigo, descricaoProduto);
				for (int i = 0; i < estoque.length; i++) {
					if (estoque[i] == null) {
						estoque[i] = est;
						break;
					}
				}
				System.out.println("Produto cadastrado com sucesso!!");
				break;
			case 2:
				for (int i = 0; i < estoque.length; i++) {
					if (estoque[i] != null) {
						System.out.println(estoque[i].verInfor());
					}
				}
				break;
			case 3:
				int excluir = Teclado.lerInteiro("Digite a quantidade que deseja excluir: ");
				for (int i = 0; i < estoque.length; i++) {
					if (excluir > 0) {
						estoque[i].excluir(excluir);
						break;
					}
				}
				System.out.println("Estoque retirado com sucesso!");
				break;
			case 4:
				int incluir = Teclado.lerInteiro("Digite a quantidade que deseja incluir: ");
				for (int i = 0; i < estoque.length; i++) {
					estoque[i].adicionar(incluir);
				}
				System.out.println("Quantidade incluída com sucesso!!");
				break;
			case 5:
				System.out.println("Saindo do sistema...");
				System.exit(0);
			default:
				System.out.println("Número inválido. Digite o número correspondente.");
			}
		}
	}
}
