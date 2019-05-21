/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tecnologico.test.jpa;

import com.tecnologico.jpa.util.Constants;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
/**
 *
 * @author rcuello
 */
public class UsuarioJpaControllerTest {
    
    private static EntityManager em = null;
    
    public UsuarioJpaControllerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        if (em == null) {
            em = (EntityManager) Persistence.createEntityManagerFactory(Constants.UNIT_NAME).createEntityManager();
        }
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void findUser(){
        //EntityManagerFactory emf =JpaUtil.getEntityManagerFactory();
        
        Assert.assertNotNull(em);
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
