/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistema_controle_de_estoque_loja;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Murilo
 */
public class Conexao {
    public static Connection conectar(){
        try{
            Class.forName("com.mysql.jdbc.Driver"); // Verifica se o Java encontrou o driver JDBC do MySQL.
            //PRECISA IMPORTAR ESSE DRIVERS NO ARQUIVO pom.xml em Dependencies
            
            String url = "jdbc:mysql://localhost:3306/loja";
            String usuario = "root";
            String senha = "root";
            
            Connection conn = DriverManager.getConnection(url,usuario,senha); //Criando a conexão
            System.out.println("Conexao estabelecidade com o banco!");
            return conn;
            
            
        } catch (SQLException e){ //Tratamento caso não localize o banco
            System.out.println("Erro na conexao!");
            System.out.println(e);
            return null;
            
        } catch (ClassNotFoundException ex) { //Faz um tratamento caso os drives não forem localizados
            System.out.println("Drivers não instalados");
            return null;
        }
     
    }
}
