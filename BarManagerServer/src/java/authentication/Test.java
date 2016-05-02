/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package authentication;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.util.logging.Level;
import order.GetOrder;
import org.apache.log4j.Logger;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author wwwmu
 */
public class Test {
    
   static final Logger log = Logger.getLogger(Test.class.getName()); 
    public static void main(String[] args) {
       try {
           log.info("Some");
           Reader out = null;
           File file = new File("C:\\Users\\wwwmu\\Documents\\NetBeansProjects\\BarManagerServer\\web\\menu.json");
           JSONParser parser = new JSONParser();
           out = new BufferedReader(new InputStreamReader(
                   new FileInputStream(file), "UTF-8"));
           
           
           Object obj = parser.parse(out);
           
           JSONObject jsonObject = (JSONObject) obj;
           
           System.out.println(Integer.parseInt((String) jsonObject.get("some")));
           
           
       } catch (UnsupportedEncodingException ex) {
           java.util.logging.Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
       } catch (FileNotFoundException ex) {
           java.util.logging.Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
       } catch (IOException ex) {
           java.util.logging.Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
       } catch (ParseException ex) {
           java.util.logging.Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
       }
    }
    
}
