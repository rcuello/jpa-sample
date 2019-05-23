
package com.tecnologico.test.jpa;

import com.tecnologico.model.Usuario;
import com.tecnologico.model.dao.UsuarioDAO;
import javax.inject.Inject;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 *
 * @author rcuello
 * https://www.logicbig.com/tutorials/spring-framework/spring-data/stored-procedure.html
 * https://github.com/eugenp/tutorials/blob/master/persistence-modules/spring-persistence-simple/pom.xml
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "/application-context.xml")
public class SpringJPATest {
    
    @Inject
    UsuarioDAO usuarioDAO;
    
    public SpringJPATest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
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
    public void hello() 
    {
        Usuario user = usuarioDAO.findBy("admin", "123");
        Assert.assertNotNull(user);
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
