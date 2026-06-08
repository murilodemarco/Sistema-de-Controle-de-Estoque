/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sistema_controle_de_estoque_loja;

import static com.mycompany.sistema_controle_de_estoque_loja.CadastrarProduto.cadastrarProduto;
import static com.mycompany.sistema_controle_de_estoque_loja.ExcluirProduto.excluirProduto;
import static com.mycompany.sistema_controle_de_estoque_loja.ListarProdutos.listarProdutos;
import static com.mycompany.sistema_controle_de_estoque_loja.ValorEstoqueTotal.valorEstoqueTotal;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Murilo
 */
public class Sistema_Controle_de_Estoque_Loja {

    public static void main(String[] args) throws SQLException {
      int opcao = 0;
        Connection conn = Conexao.conectar();
   
        if (conn !=null)
        {
            JOptionPane.showMessageDialog(null, "Banco conectado com sucesso!");
            while (opcao != 5){
            String menu = """
                          * * SISTEMA DE CADASTRO * *
                          
                          1. Cadastrar Produto
                          2. Listar produtos
                          3. Mostrar valor total do estoque
                          4. Excluir produto
                          5. Sair
          
                          Digite uma opção: 
                          """;
            String entrada = JOptionPane.showInputDialog(menu);
            opcao = Integer.parseInt(entrada);
            switch (opcao){
                case 1:
                {
                    cadastrarProduto();
                    break;
                }
                case 2:
                {
                    listarProdutos();
                    break;
                }
                case 3:
                {
                    valorEstoqueTotal();
                    break;
                }
                case 4:
                {
                    excluirProduto();
                    break;
                }
                case 5:
                {
                    // JOptionPane.showMessageDialog(null, "Sair...!");
                    break;
                }
                default:
                {
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
                    break; 
               }
            }
        }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Erro ao conectar ao BD!");
        }
        
        JOptionPane.showMessageDialog(null, "Fim de Programa!");
        conn.close();
    }

}
