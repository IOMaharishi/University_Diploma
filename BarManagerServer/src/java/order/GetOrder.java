/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package order;

import authentication.AuthenticationInter;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import order.entity.OrderEntity;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author wwwmu
 */
public class GetOrder extends HttpServlet {
    static final Logger log = Logger.getLogger(GetOrder.class.getName()); 
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        log.info("Сумма - ");
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        int sum = 0, pre_sum = 0;
        
       String data = request.getParameter("order"); // принимаем объект json
        JSONObject json;
        try {
            json = (JSONObject) new JSONParser().parse(data);//парсим его
            String time = (String)json.get("Time");// вытягиваем из него данные
            Map<String,Long> map = (Map<String,Long>) json.get("Map");
            // Здесь идет проверка с бд, если есть совпадение то значение true, и наоборот.


            String context_path = getServletContext().getRealPath("");

            json.remove("order");

           json.put("result",get_Sum(map));
           
        try (PrintWriter out = response.getWriter()) {
            out.print(json.toJSONString());
        }
         } catch (ParseException e) {
            e.printStackTrace();

        } 
    
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    
    public int get_Sum(Map<String, Long> map){
        
        int sum = 0;
        int name=0;
        long count =0 ;
        long pre_sum = 0;
        if(!map.isEmpty()){
      
            
            Reader out = null;
            try {
                File file = new File("/Users/Illia/Desktop/University_Diploma/BarManagerServer/web/menu.json");
                JSONParser parser = new JSONParser();
                out = new BufferedReader(new InputStreamReader(
                        new FileInputStream(file), "UTF-8"));
                Object obj = parser.parse(out);
                JSONObject jsonObject = (JSONObject) obj;
                for(Map.Entry<String,Long> entry : map.entrySet()){
                    
                    // Берем цену из меню по названию блюда
                    
                    name = (int) (Integer.parseInt(jsonObject.get(entry.getKey()).toString()));
                    count = entry.getValue();
//                    value = 3;
//                    log.info("Сумма - "+ value);
                    //Умножае цену на количество и прибавляем результат к общей сумме
                    pre_sum =name * count; 
                   
                    
                    sum += pre_sum;
                    
            }  
            } catch (UnsupportedEncodingException ex) {
                java.util.logging.Logger.getLogger(GetOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (FileNotFoundException ex) {
                java.util.logging.Logger.getLogger(GetOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (IOException ex) {
                java.util.logging.Logger.getLogger(GetOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (ParseException ex) {
                java.util.logging.Logger.getLogger(GetOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } finally {
                try {
                    out.close();
                } catch (IOException ex) {
                    java.util.logging.Logger.getLogger(GetOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                }
            }
        }
        log.info("Сумма - "+ sum);
         return sum;
    }
}
 
    

