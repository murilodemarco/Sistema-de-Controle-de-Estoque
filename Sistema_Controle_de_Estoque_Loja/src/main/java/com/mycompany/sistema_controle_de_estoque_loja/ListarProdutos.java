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
public class ListarProdutos {
    public static void listarProdutos() throws SQLException
    {
        Connection conn = Conexao.conectar();
        JOptionPane.showMessageDialog(null, "Lista de produtos!");
        //SELECT DOS PRODUTOS
        String sqlSelect = "SELECT * FROM tb_produtos";

        PreparedStatement stmtSelect = conn.prepareStatement(sqlSelect);
        ResultSet rs = stmtSelect.executeQuery();

        String lista = "Produtos Cadastrados\n\n";
        while (rs.next()){ // Percorre todos os registros retornados pela consulta
              lista+="ID: "+rs.getInt("id_produto")
                     +"\nProduto: "+rs.getString("produto")
                     +"\nPreço: "+rs.getDouble("preco")
                     +"\nQuantidade estoque: "+rs.getInt("qtd_estoque")
                     +"\n\n";
        }
        JOptionPane.showMessageDialog(null, lista);
        conn.close();
        
    }
    
}
