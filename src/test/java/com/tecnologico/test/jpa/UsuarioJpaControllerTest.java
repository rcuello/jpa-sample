/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tecnologico.test.jpa;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author rcuello
 */
public class UsuarioJpaControllerTest {
    
    //private static EntityManager em = null;
    
    public UsuarioJpaControllerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
//        if (em == null) {
//            em = (EntityManager) Persistence.createEntityManagerFactory(Constants.UNIT_NAME).createEntityManager();
//        }
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
        //FileUtils
        //EntityManagerFactory emf =JpaUtil.getEntityManagerFactory();
//        UsuarioJpaController dao=new UsuarioJpaController();
//        Usuario user = dao.findBy("admin", "123");
//        Assert.assertNotNull(user);
    }
    
}
