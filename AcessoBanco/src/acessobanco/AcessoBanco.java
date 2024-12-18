/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package acessobanco;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AcessoBanco {

    public static void main(String[] args) {
        //primeiro teste
        //testa a conexao com o banco de dados
        Conexao conn = new Conexao();
        
        ContatosDAO cadDAO = new ContatosDAO();  //Criar o DAO

        try {
            conn.getConexao();
        } catch (ClassNotFoundException ex) { //quando não encontra o driver
            ex.getStackTrace();
        }

        //========segundo teste
        //========Criar o objeto de transacao
        Contatos contato = new Contatos(); //criar o DTO
        contato.setNomeContato("Joao");        //Configurar os dados

        

        try {
            cadDAO.adicionar(contato);         //Chamar o metodo para add no banco
        } catch (SQLException e) {
            e.getSQLState();
        }
        
//        try {
//            Contatos contato = cadDAO.listarPorId(0);
//        } catch (SQLException ex) {
//            Logger.getLogger(AcessoBanco.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        
        System.out.println();
    }
}
