/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tecnologico.model.dao;

import java.lang.reflect.ParameterizedType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author rcuello
 */
public abstract class JpaDao <E, K> implements Dao<E, K>{
    protected Class<E> entityClass;
    
    @PersistenceContext
    protected EntityManager entityManager;
    
    public JpaDao() {
        ParameterizedType genericSuperclass = (ParameterizedType) getClass().getGenericSuperclass();
        this.entityClass = (Class<E>) genericSuperclass.getActualTypeArguments()[1];
    }
    
    public void persist(E entity) { entityManager.persist(entity); }

    public void remove(E entity) { entityManager.remove(entity); }

    public E findById(K id) { return entityManager.find(entityClass, id); }
}
