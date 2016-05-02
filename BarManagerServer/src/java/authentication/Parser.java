/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package authentication;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.File;
import java.io.FileReader;

/**
 * Created by Illia on 11/3/15.
 */
public interface Parser {


    default JSONArray get_all_passwords(String path)
        {
            JSONParser parser = new JSONParser();


            Object object = null;

            JSONObject jsonObject = null;

            JSONArray user_list = null;

            try {
                object = parser.parse(new FileReader(new File(path,"passwords.json")));

                 jsonObject = (JSONObject) object;

                 user_list = (JSONArray) jsonObject.get("User list");

            } catch (Exception e) {
                e.printStackTrace();
            }

            return user_list;
        }

}
