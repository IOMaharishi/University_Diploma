
import org.json.JSONObject;

import java.io.IOException;

/**
 * Created by Illia on 11/4/15.
 */
public class test {

    public static void main(String[] args) throws IOException {

    parser_menu();
    }

//    public void parser_password(){
//        JSONParser parser = new JSONParser();
//
//
//        Object object = null;
//
//        JSONObject jsonObject = null;
//
//        JSONArray user_list = null;
//
//        try {
//            object = parser.parse(new FileReader("passwords.json"));
//
//            jsonObject = (JSONObject) object;
//
//            user_list = (JSONArray) jsonObject.get("User list");
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//
//        String [] pass = user_list.toString().replace("[","").replace("]","").replace("\"","").split(",");;
//        boolean flag = false;
//        for (String x : pass){
//
//            if (x.equals("12345")){
//                flag = true;
//                break;
//            }
//            else{
//                flag = false;
//            }
//        }
//        System.out.println(flag);
//
//    }


    public static  void parser_menu() throws IOException{
       /* JSONParser parser = new JSONParser();


        Object object = null;

        JSONObject jsonObject = null;

        JSONArray user_list = null;

        parser = new JSONParser();

            object = parser.parse(new FileReader("/Users/Illia/Desktop/Diploma/BarManagerServer/Web/web/menu.json"));

            jsonObject = (JSONObject) object;
            System.out.println(jsonObject.get("core"));

            JSONObject object1 = (JSONObject) jsonObject.get("core");
            System.out.println(object1.get("first"));

            JSONObject object2 = (JSONObject) object1.get("first");
            System.out.println(object2.get("borsh"));
       Object obj = parser.parse(object2.get("borsh").toString());

        System.out.println(obj);*/



        JSONObject jsonObject = null;

        StringBuilder stringBuilder = new StringBuilder().append
                ("{\n" +
                        "  \"Основное\": {\n" +
                        "\n" +
                        "      \"Алкогольные напитки\": {\n" +
                        "          \"Вино\": {\n" +
                        "            \"Каберне Совиньон\": \"20\",\n" +
                        "            \"weight\": \"250\"\n" +
                        "          },\n" +
                        "          \"Водка\": {\n" +
                        "            \"price\": \"15\",\n" +
                        "            \"weight\": \"250\"\n" +
                        "          },\n" +
                        "          \"Пиво\":{\n" +
                        "\n" +
                        "          },\n" +
                        "          \"Шампанское\":{\n" +
                        "\n" +
                        "          }\n" +
                        "    }\n" +
                        "  }\n" +
                        "}");


        jsonObject = new JSONObject(stringBuilder.toString().trim());

        System.out.println(jsonObject.keySet().toString());

        System.out.println(jsonObject.getJSONObject("Основное").getJSONObject("Алкогольные напитки").getJSONObject
                ("Вино").get("Каберне Совиньон").toString());

//            System.out.println(jsonObject.get("first").toString());//.getJSONObject("first").getJSONObject("borsh")
        // .getJSONObject
//                    ("price")



    }
}
