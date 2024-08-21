package ControleEstoque;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class TesteEstoque {

    public static void main(String[] args) {
        var estoque = new ArrayList<EstoqueControle>(); 

        while (true) {
            var op = Teclado.lerInteiro(
                "ESCOLHA A OPÇÃO DESEJADA:\n1-Cadastrar produto \n2-Consultar estoque \n3-Excluir \n4-Incluir \n5-Sair");

            switch (op) {
                case 1:
                    var codigo = Teclado.lerInteiro("Digite o código do produto:");
                    var descricaoProduto = Teclado.lerString("Digite a descrição do produto:");
                    var est = new EstoqueControle(codigo, descricaoProduto);
                    estoque.add(est); 
                    System.out.println("Produto cadastrado com sucesso!!");
                    break;
                case 2:
                    if (estoque.isEmpty()) {
                        System.out.println("Nenhum produto cadastrado.");
                    } else {
                        for (var produto : estoque) { 
                            System.out.println(produto.verInfor());
                        }
                    }
                    break;
                case 3:
                    var excluirCodigo = Teclado.lerInteiro("Digite o código do produto que deseja excluir:");
                    var iterador = estoque.iterator(); 
                    var encontrado = false;
                    while (iterador.hasNext()) {
                        var item = iterador.next();
                        if (item.getCodigo() == excluirCodigo) {
                            iterador.remove(); 
                            System.out.println("Produto excluído com sucesso!");
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("Produto não encontrado.");
                    }
                    break;
                case 4:
                    var incluirCodigo = Teclado.lerInteiro("Digite o código do produto que deseja incluir:");
                    var quantidade = Teclado.lerInteiro("Digite a quantidade que deseja incluir:");
                    var produtoEncontrado = false;
                    for (var item : estoque) {
                        if (item.getCodigo() == incluirCodigo) {
                            item.adicionar(quantidade); 
                            System.out.println("Quantidade incluída com sucesso!!");
                            produtoEncontrado = true;
                            break;
                        }
                    }
                    if (!produtoEncontrado) {
                        System.out.println("Produto não encontrado.");
                    }
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
