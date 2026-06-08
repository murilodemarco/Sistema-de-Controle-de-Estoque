/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistema_controle_de_estoque_loja;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Murilo
 */
public class CadastrarProduto {
    public static void cadastrarProduto() throws SQLException{
        
       Connection conn = Conexao.conectar();
       
       JOptionPane.showMessageDialog(null, "Cadastrar produto!");
       String produto = JOptionPane.showInputDialog("Nome do produto: ");
       Double preco = Double.parseDouble(JOptionPane.showInputDialog("Preço do produto: "));
       Double estoque = Double.parseDouble(JOptionPane.showInputDialog("Quantidade em estoque: "));
       String sql = "INSERT INTO tb_produtos (produto, preco, qtd_estoque) VALUES (?,?,?)";
            
       PreparedStatement stmt = conn.prepareStatement(sql);
       stmt.setString(1, produto);
       stmt.setDouble(2, preco);
       stmt.setDouble(3, estoque);
       
            
       stmt.execute();
       JOptionPane.showMessageDialog(null, "Produto cadastrado com sucesso ");
       conn.close();
    }
}
