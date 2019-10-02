package ru.startandroid.lesson32simplebrowser;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //находим view по id и присаваиваем ей слушатель
        (findViewById(R.id.btnWeb)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { //при нажатии открывается ссылка и передаёт интент
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com")));
            }
        });
    }
}