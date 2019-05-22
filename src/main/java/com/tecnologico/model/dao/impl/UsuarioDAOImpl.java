/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tecnologico.model.dao.impl;

import com.tecnologico.model.Usuario;
import com.tecnologico.model.dao.JpaDao;
import com.tecnologico.model.dao.UsuarioDAO;
import javax.transaction.Transactional;
import org.springframework.stereotype.Repository;


/**
 *
 * @author rcuello
 */
@Repository
@Transactional
public class UsuarioDAOImpl extends JpaDao<Integer, Usuario> implements UsuarioDAO{

    @Override
    public Usuario findBy(String username, String password) {
        return (Usuario)entityManager.createQuery("Select u From Usuario u Where u.username=:username and u.password=:password")
                .setParameter("username", username)
                .setParameter("password",password).getSingleResult();
    }

    
}
