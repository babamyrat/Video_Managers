package com.example.video_manager;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
     WebView myWebView;
    WebSettings webSettings;
    String mUrl = "https://videomanager-test.garpix.com/";

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Uri uri = getIntent().getData();
//        if (uri != null) {
//            String path = uri.toString();
//            Toast.makeText(MainActivity.this, "Path =: " + path, Toast.LENGTH_SHORT).show();
//        }

        myWebView = findViewById(R.id.webView);
        myWebView.loadUrl(mUrl);
        webSettings = myWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setDomStorageEnabled(true);
        myWebView.setWebViewClient(new MyWebViewClient());
    }

    private class MyWebViewClient extends WebViewClient{
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {

         return false;
        }

    }

}