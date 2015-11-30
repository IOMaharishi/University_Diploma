package com.example.illia.auth_window;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.StrictMode;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.jsoup.Connection;
import org.jsoup.Jsoup;

import java.io.IOException;

public class StartActivity extends Activity{


    private ProgressDialog progressDialog;
    public EditText editT ;
    public Button one,two,three,four,five,six,seven,eight,nine,zero,ok;
    public ImageButton delete_b;

    static {
        // Enable network connections
        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build();
        StrictMode.setThreadPolicy(policy);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        progressDialog = new ProgressDialog(this);
        progressDialog.setMessage("Подключение к серверу");
        progressDialog.setCancelable(false);

        editT = (EditText)findViewById(R.id.editText);
        one= (Button) findViewById(R.id.One);
        two= (Button) findViewById(R.id.Two);
        three= (Button) findViewById(R.id.Three);
        four= (Button) findViewById(R.id.Four);
        five= (Button) findViewById(R.id.Five);
        six= (Button) findViewById(R.id.Six);
        seven= (Button) findViewById(R.id.Seven);
        eight= (Button) findViewById(R.id.Eight);
        nine= (Button) findViewById(R.id.Nine);
        zero= (Button) findViewById(R.id.Zero);
        delete_b= (ImageButton) findViewById(R.id.delete_btn);
        ok = (Button) findViewById(R.id.Ok);



        View.OnClickListener onClickListener = new View.OnClickListener() {



            @Override
            public void onClick(View v) {
                switch (v.getId()) {

                    case R.id.One: editT.append(one.getText());break;
                    case R.id.Two: editT.append(two.getText());break;
                    case R.id.Three: editT.append(three.getText());break;
                    case R.id.Four: editT.append(four.getText());break;
                    case R.id.Five: editT.append(five.getText());break;
                    case R.id.Six: editT.append(six.getText());break;
                    case R.id.Seven: editT.append(seven.getText());break;
                    case R.id.Eight: editT.append(eight.getText());break;
                    case R.id.Nine: editT.append(nine.getText());break;
                    case R.id.Zero: editT.append(zero.getText());break;
                    case R.id.delete_btn : delete_btn();break;
                    case R.id.Ok:new Login(editT.getText().toString()).execute();break;

                }


            }
        };



        one.setOnClickListener(onClickListener);
        two.setOnClickListener(onClickListener);
        three.setOnClickListener(onClickListener);
        four.setOnClickListener(onClickListener);
        five.setOnClickListener(onClickListener);
        six.setOnClickListener(onClickListener);
        seven.setOnClickListener(onClickListener);
        eight.setOnClickListener(onClickListener);
        nine.setOnClickListener(onClickListener);
        zero.setOnClickListener(onClickListener);
        delete_b.setOnClickListener(onClickListener);
        ok.setOnClickListener(onClickListener);


        editT.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                if (event.getAction() == KeyEvent.ACTION_DOWN &&
                        (keyCode == KeyEvent.KEYCODE_ENTER)) {
                    // сохраняем текст, введенный до нажатия Enter в переменную
                    String strCatName = editT.getText().toString();
                    return true;
                }
                return false;
            }
        });


    }

    public void delete_btn(){
    if(editT.getText().length()>0) {
        editT.getText().delete(editT.getText().length() - 1, editT.getText().length());
//        editT.getText().delete()
    }
    }

    private final class Login extends AsyncTask<Void, Void, Boolean> {
        private final String password;

        public Login(String password) {

            this.password = password;
        }

        @Override
        protected void onPreExecute() {
            progressDialog.show();
        }

        @Override
        protected Boolean doInBackground(Void... voids) {
            JSONObject json = new JSONObject();

            json.put("password", password);

            Connection connection = Jsoup.connect("http://localhost:8080/Server/Login")
                    .data("user_data", json.toJSONString()).timeout(10000);

            Connection.Response response = null;
            try {
                response = connection.execute();
            } catch (IOException e) {
            }
            if (response == null) return false;

            // Парсинг ответа от сервера (до этого мы перевели json в String на сервере)
            String str = response.body();
            try {
                json = (JSONObject) new JSONParser().parse(str);
            } catch (ParseException e) {
            }
            if (json == null) return false;

            return (Boolean) json.get("entered");
        }

        @Override
        protected void onPostExecute(Boolean done) {
            progressDialog.dismiss();
            if (done){
            Toast.makeText(getApplicationContext(),"Вошел",Toast.LENGTH_LONG).show();
                  Intent intent = new Intent(StartActivity.this, CoreActivity.class);

                startActivity(intent);
            }else {
                Toast.makeText(getApplicationContext(), "Не Вошел", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(StartActivity.this, CoreActivity.class);


                startActivity(intent);
            }
            }
    }




}
