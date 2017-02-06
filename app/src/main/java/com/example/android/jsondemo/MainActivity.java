package com.example.android.jsondemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DownloadContent task = new DownloadContent();
        task.execute("http://api.openweathermap.org/data/2.5/weather?id=7778677&APPID=7a1469650d4fe9c9be266b51614171aa");
    }
}
