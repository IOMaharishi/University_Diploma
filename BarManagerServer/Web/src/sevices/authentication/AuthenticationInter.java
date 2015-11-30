package sevices.authentication;

import org.json.simple.parser.ParseException;
import sevices.json_pars.Parser;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
/**
 * Created by wwwmu on 23.10.2015.
 */
public interface AuthenticationInter extends Parser {

    void processRequest(HttpServletRequest request, HttpServletResponse response) throws IOException, ParseException;

    default void printToUser(HttpServletResponse response, Object obj) throws IOException {
        try (PrintWriter out = response.getWriter()) {
            out.print(obj);
        }
    }

    default boolean check_data(String password, String context_path){

        boolean flag = true;
        String [] pass = get_all_passwords(context_path).toString()
                .replace("[", "")
                .replace("]", "")
                .replace("\"", "")
                .split(",");


        for (String x : pass){
            if (x.equals(password)){
                flag = true;
                break;
            }
           else{
                flag = false;
            }
        }
       return flag;
    }
}
