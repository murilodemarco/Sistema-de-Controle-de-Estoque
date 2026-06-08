/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistema_controle_de_estoque_loja;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Murilo
 */
public class ValorEstoqueTotal {
    public static void valorEstoqueTotal() throws SQLException{
        
        double preco = 0;
        int qtd_estoque = 0;
        double total_produto = 0;
        double total_estoque = 0;
        Connection conn = Conexao.conectar();
        JOptionPane.showMessageDialog(null, "Valor Total do Estoque");
        String sqlSelect = "SELECT * FROM tb_produtos";

        PreparedStatement stmtSelect = conn.prepareStatement(sqlSelect);
        ResultSet rs = stmtSelect.executeQuery();
        
        String lista = "Valor Total de Mercadoria no estoque\n\n";
        while (rs.next()){
              preco = rs.getDouble("preco");
              qtd_estoque = rs.getInt("qtd_estoque");
              total_produto = preco * qtd_estoque;
              
              total_estoque = total_estoque+ total_produto;
              
              lista+=rs.getString("produto")
                     +"\nR$ "+total_produto
                     +"\n\n";
        }
        JOptionPane.showMessageDialog(null, lista + "Valor total do estoque: R$ "+total_estoque);
        conn.close();
        
    }
}
