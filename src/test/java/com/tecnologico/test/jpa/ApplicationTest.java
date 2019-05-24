package com.tecnologico.test.jpa;

import org.junit.Test;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.IOUtils;


/**
 *
 * @author rcuello
 */
public class ApplicationTest {
    @Test
    public void loadXMLTest() throws IOException{
//        ClassLoader classLoader = getClass().getClassLoader();
//        File file = new File(classLoader.getResource("data.xml").getFile());
        
        String xml = IOUtils.toString(this.getClass().getResourceAsStream("resources/xml/data.xml"),"UTF-8" );
    }
}
