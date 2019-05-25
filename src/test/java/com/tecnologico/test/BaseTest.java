/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tecnologico.test;

import java.io.IOException;
import org.apache.commons.io.IOUtils;

/**
 *
 * @author Ronald
 */
public class BaseTest {
    public String getEmbeddedResourceAsString(String path) throws IOException{
        String xml = IOUtils.toString(this.getClass().getResourceAsStream(path),"UTF-8" );
        
        return xml;
    }
}
