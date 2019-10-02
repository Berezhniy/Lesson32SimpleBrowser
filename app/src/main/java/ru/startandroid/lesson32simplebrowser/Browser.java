package ru.startandroid.lesson32simplebrowser;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Browser extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_browser);
        //находим view по id
        WebView webView = (WebView) findViewById(R.id.webView);
        //добавляем в найденную view WebClient
        webView.setWebViewClient(new WebViewClient());
        //достаём данные data из intent
        Uri data = getIntent().getData();
        //сетим ссылку из data в webView
        webView.loadUrl(data.toString());
    }
}
