package com.example.restapione;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {

    String JSON_STRING  = "{\"employee\":{\"name\":\"Master Android App\",\"downloads\":9000}}";
    String name, downloads;
    TextView appName,downloadsTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        appName = findViewById(R.id.name);
        downloadsTextView = findViewById(R.id.salary);

        try{
            JSONObject obj = new JSONObject(JSON_STRING);
            JSONObject employee = obj.getJSONObject("employee");

            name = employee.getString("name");
            downloads = employee.getString("downloads");

            // set the name and salary
            appName.setText("Name:" + name);
            downloadsTextView.setText("Downloads:" + downloads);

        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}