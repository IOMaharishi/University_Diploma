package sevices.authentication;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.*;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.HttpURLConnection;

/**
 * Created by wwwmu on 23.10.2015.
 */
public class LogIn extends HttpServlet implements AuthenticationInter {


//     final FileReader fileReader = new FileReader(new File("/passwords.json"));


    @Override
    public void processRequest(HttpServletRequest request, HttpServletResponse response) throws IOException {

        String data = request.getParameter("user_data"); // принимаем объект json
        JSONObject json;
        try {
            json = (JSONObject) new JSONParser().parse(data);//парсим его
            String password = (String)json.get("password");// вытягиваем из него данные

            // Здесь идет проверка с бд, если есть совпадение то значение true, и наоборот.


            String context_path = getServletContext().getRealPath("");

            json.remove("password");

            json.put("entered",check_data(password,context_path));




        // Если есть такое совпадение - значит пошел (true) иначе не вошел (false)
            printToUser(response,json.toJSONString());

        } catch (ParseException e) {
            printToUser(response, HttpURLConnection.HTTP_UNAVAILABLE);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processRequest(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processRequest(req,resp);
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processRequest(req,resp);
    }
}
