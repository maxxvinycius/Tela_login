/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

/**
 *
 * @author maxvi
 */
import DTO.UsuarioDTO;

public class UsuarioDAO {

    public boolean autenticarUsuario(UsuarioDTO objUsuarioDTO) {
        
        // LOGIN FIXO (simples)
        return objUsuarioDTO.getUsuario().equals("admin") &&
               objUsuarioDTO.getSenha().equals("1234");
    }
}
