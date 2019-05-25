package com.tecnologico.test.jpa;

import com.google.gson.Gson;
import com.tecnologico.model.Usuario;
import com.tecnologico.test.BaseTest;
import org.junit.Test;
import java.io.IOException;
import static org.junit.Assert.*;
import java.lang.reflect.Type;
import com.google.gson.reflect.TypeToken;
import java.util.List;



/**
 *
 * @author rcuello
 */
public class ApplicationTest extends BaseTest{
    @Test
    public void loadXMLTest() throws IOException{
//        ClassLoader classLoader = getClass().getClassLoader();
//        File file = new File(classLoader.getResource("data.xml").getFile());"/xml/data.xml"
        
        String xml = this.getEmbeddedResourceAsString("/xml/data.xml");
        assertNotNull(xml);
        
    }
    
    @Test
    public void loadJsonTest() throws IOException {
        String json=this.getEmbeddedResourceAsString("/json/data.json");
        Usuario data = new Gson().fromJson(json, Usuario.class);
        System.out.println("Username:"+data.getUsername());
        assertNotNull(data);
    }
    
    @Test
    public void loadJsonArrayTest() throws IOException {
        String jsonArray=this.getEmbeddedResourceAsString("/json/users.json");
        Type listType = new TypeToken<List<Usuario>>(){}.getType();
        List<Usuario> users = new Gson().fromJson(jsonArray, listType);
        
        for(Usuario user : users){
            System.out.printf("Username (%s): %s ",user.getIdUsuario(),user.getUsername());
            System.out.println("");
        }
        
        assertNotNull(users);
    }
}
