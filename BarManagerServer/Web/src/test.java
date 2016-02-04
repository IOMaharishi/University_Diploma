import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.*;

/**
 * Created by Illia on 11/4/15.
 */
public class test {

    public static void main(String[] args) throws IOException, ParseException {

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


    public static  void parser_menu() throws IOException, ParseException {
        JSONParser parser = new JSONParser();
        File file = new File("C:\\Users\\wwwmu\\Desktop\\University_Diploma\\BarManagerServer\\Web\\web\\menu.json");
        Object obj = parser.parse(new InputStreamReader(new FileInputStream(file), "UTF8"));

        JSONObject jsonObject =  (JSONObject) obj;

        String name = (String) jsonObject.get("Алкоголь").toString();
        System.out.println(name);


/*
            JSONObject object1 = (JSONObject) jsonObject.get("core");
            System.out.println(object1.get("first"));

            JSONObject object2 = (JSONObject) object1.get("first");
            System.out.println(object2.get("borsh"));
       Object obj = parser.parse(object2.get("borsh").toString());

        System.out.println(obj);*/

/*

        JSONObject jsonObject = null;

        StringBuilder stringBuilder = new StringBuilder().append
                ("{\n" +
                        "  \n" +
                        "\n" +
                        "      \"??????????? ???????\":\n" +
                        "      {\n" +
                        "          \"????\": {\n" +
                        "            \"??????? ????????\": 250,\n" +
                        "            \"??????? ??????????\": 540,\n" +
                        "            \"?????? ?? ??????? ?????\": 270,\n" +
                        "            \"???????\": 1500\n" +
                        "          },\n" +
                        "          \"?????\": {\n" +
                        "            \"???????\": 50,\n" +
                        "            \"??????? ???????? ????\": 140,\n" +
                        "            \"??????? ???????? ???????\": 160,\n" +
                        "            \"???????\": 150\n" +
                        "          },\n" +
                        "          \"????\":{\n" +
                        "            \"?????? ??????????????\":150,\n" +
                        "            \"???????? ???????\":130,\n" +
                        "            \"???????\":120,\n" +
                        "            \"????????\":200\n" +
                        "          },\n" +
                        "          \"??????????\":{\n" +
                        "            \"?????????? ???????????\":120,\n" +
                        "            \" ????\":120,\n" +
                        "            \"????????????????? ????? ????\":120\n" +
                        "          }\n" +
                        "    },\n" +
                        "    \"?????????????? ???????\":\n" +
                        "    {\n" +
                        "      \"????\":\n" +
                        "          {\n" +
                        "            \"??????\":150,\n" +
                        "            \"????????\":150,\n" +
                        "            \"?????\":180,\n" +
                        "            \"????????\":100\n" +
                        "          },\n" +
                        "      \"???? ? ?????\":\n" +
                        "          {\n" +
                        "            \"???? ??????????\":70,\n" +
                        "            \"???? ??????????\":70,\n" +
                        "            \"????? ??????????\":70,\n" +
                        "            \"???? ????????\":70\n" +
                        "          },\n" +
                        "      \"???\":\n" +
                        "          {\n" +
                        "            \"???????\":750,\n" +
                        "            \"????? ?????????\":170,\n" +
                        "            \"??? ???????\":170,\n" +
                        "            \"??? ??????\":170\n" +
                        "          }\n" +
                        "    },\n" +
                        "\n" +
                        "    \"???????? ?????\":\n" +
                        "    {\n" +
                        "        \"????????\":390,\n" +
                        "        \"????????\":210,\n" +
                        "        \"????????? ???????\":330,\n" +
                        "        \"????? ?? ?????\":550,\n" +
                        "        \"????? ?? ????\":350,\n" +
                        "        \"????? ?????\":550,\n" +
                        "        \"???? ??????\":790,\n" +
                        "        \"?????? ?? ????????\":790,\n" +
                        "        \"?????? ?? ???????\":450\n" +
                        "    },\n" +
                        "    \"??????\":\n" +
                        "    {\n" +
                        "        \"????????\":240,\n" +
                        "        \"??????\":250,\n" +
                        "        \"????? ?? ??????\":250,\n" +
                        "        \"?????? ??? ?????\":250\n" +
                        "\n" +
                        "    },\n" +
                        "    \"????\":\n" +
                        "    {\n" +
                        "        \"???? ??????????\": 320,\n" +
                        "        \"????-??? ?? ????? ??????\": 350,\n" +
                        "        \"??????? ?????\": 250,\n" +
                        "        \"??????? ??????\": 350,\n" +
                        "        \"???\": 320\n" +
                        "    },\n" +
                        "    \"???????\":\n" +
                        "    {\n" +
                        "        \"????????? ?????????\":100,\n" +
                        "        \"????????? ?????????\":100,\n" +
                        "        \"????????? ??????????\":100,\n" +
                        "        \"????????? ????-?????\":100\n" +
                        "    }\n" +
                        "\n" +
                        "\n" +
                        "  }\n");


        jsonObject = new JSONObject(stringBuilder.toString().trim());

        System.out.println(jsonObject.keySet().toString());

        System.out.println(jsonObject.getJSONObject("??????????? ???????").getJSONObject
                ("????").toString());
        char []  str = jsonObject.getJSONObject("??????????? ???????").getJSONObject
                ("????").toString().toCharArray();

//        String [] str1 = str.split("\"");
        System.out.println(String.valueOf(str));

        /*JSONParser parser = new JSONParser();
        ContainerFactory containerFactory = new ContainerFactory(){
            public List creatArrayContainer() {
                return new LinkedList();
            }

            public Map createObjectContainer() {
                return new LinkedHashMap();
            }

        };

        try{
            Map json = (Map)parser.parse(stringBuilder.toString(), containerFactory);
            Iterator iter = json.entrySet().iterator();
            System.out.println("==iterate result==");
            while(iter.hasNext()){
                Map.Entry entry = (Map.Entry)iter.next();
                System.out.println(entry.getKey() + "=>" + entry.getValue()+ "\n");
            }

            System.out.println("==toJSONString()==");
            System.out.println(JSONValue.toJSONString(json));
        }
        catch(ParseException pe){
            System.out.println(pe);
        }*/

//            System.out.println(jsonObject.get("first").toString());//.getJSONObject("first").getJSONObject("borsh")
        // .getJSONObject
//                    ("price")



    }
}
