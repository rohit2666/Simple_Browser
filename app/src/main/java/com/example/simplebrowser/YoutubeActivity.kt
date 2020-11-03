package com.example.simplebrowser

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class YoutubeActivity : AppCompatActivity() {
    lateinit var mWeb2:WebView
    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_youtube)

        title="Youtube"


        // WebView for google search
        mWeb2=findViewById(R.id.webView2)
        mWeb2.loadUrl("https://www.youtube.com/")
        val webSetting=mWeb2.settings
        webSetting.javaScriptEnabled=true
        mWeb2.webViewClient= WebViewClient()
    }
    // backpress method
    override fun onBackPressed(){
        if(mWeb2.canGoBack()){
            mWeb2.goBack()

        }
        else{
            super.onBackPressed()
        }
    }
}