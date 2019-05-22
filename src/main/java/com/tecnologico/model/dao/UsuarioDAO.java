/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tecnologico.model.dao;

import com.tecnologico.model.Usuario;

/**
 *
 * @author rcuello
 */
public interface UsuarioDAO extends Dao<Integer, Usuario>{
    Usuario findBy(String username,String password);
}
