/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tecnologico.model.dao;

/**
 *
 * @author rcuello
 * @param <E>
 * @param <K>
 */
public interface Dao<E, K> {
    void persist(E entity);
    void remove(E entity);
    E findById(K id);
}
