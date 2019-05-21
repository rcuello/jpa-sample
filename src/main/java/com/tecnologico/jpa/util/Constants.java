
package com.tecnologico.jpa.util;

/**
 Collected constants of general utility.

<P>All members of this class are immutable. 

 <P>(This is an example of 
 <a href='http://www.javapractices.com/Topic2.cjp'>class for constants</a>.)
*/
public class Constants {
    public static final String UNIT_NAME = "TodoApp.PU";
    /** System property - <tt>line.separator</tt>*/
    public static final String NEW_LINE = System.getProperty("line.separator");
    /** System property - <tt>file.separator</tt>*/
    public static final String FILE_SEPARATOR = System.getProperty("file.separator");
    /** System property - <tt>path.separator</tt>*/
    public static final String PATH_SEPARATOR = System.getProperty("path.separator");

    public static final String EMPTY_STRING = "";
    public static final String SPACE = " ";
    public static final String TAB = "\t";
    public static final String SINGLE_QUOTE = "'";
    public static final String PERIOD = ".";
    public static final String DOUBLE_QUOTE = "\"";

  /**
   The caller references the constants using <tt>Consts.EMPTY_STRING</tt>, 
   and so on. Thus, the caller should be prevented from constructing objects of 
   this class, by declaring this private constructor. 
  */
  private Constants(){
    //this prevents even the native class from 
    //calling this ctor as well :
    throw new AssertionError();
  }
}
