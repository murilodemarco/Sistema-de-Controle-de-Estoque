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
public class ExcluirProduto {
    public static void excluirProduto() throws SQLException{
        
        Connection conn = Conexao.conectar();
        JOptionPane.showMessageDialog(null, "Excluir produtos!");
        int id = 0;
        int verificacaoDelete = 0;
        
        try {
            String sql = "DELETE FROM tb_produtos WHERE id_produto = ?";

            String idTexto = JOptionPane.showInputDialog("Digite o ID do produto que deseja excluir:");
            id = Integer.parseInt (idTexto);
            
            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setInt(1, id);           
            verificacaoDelete = stmt.executeUpdate();
            

            if (verificacaoDelete > 0) {
                JOptionPane.showMessageDialog(null, "Produto excluído com sucesso!");
            } else {
                JOptionPane.showMessageDialog(null, "Produto não encontrado!");
            }
            
        }catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Digite um ID válido!");
        }
        conn.close();
    }
}
