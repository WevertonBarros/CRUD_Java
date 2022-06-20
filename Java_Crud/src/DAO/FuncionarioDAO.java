/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.FuncionarioDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author weverton
 */
public class FuncionarioDAO {

    Connection conn;
    PreparedStatement pstm;

    public void cadastrarFuncionario(FuncionarioDTO objFuncionarioDTO) {

        String sql = "insert into funcionario (nome_funcionario, endereco_funcionario) values (?,?)";

        conn = new ConnectionDAO().connectDB();

        try {

            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objFuncionarioDTO.getNome_funcionario());
            pstm.setString(2, objFuncionarioDTO.getEndereco_funcionario());

            pstm.execute();
            pstm.close();
            
        } catch (Exception erro) {

            JOptionPane.showMessageDialog(null, "FuncionarioDAO" + erro);

        }

    }

}
