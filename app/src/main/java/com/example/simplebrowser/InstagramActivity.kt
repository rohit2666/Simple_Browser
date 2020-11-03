package com.example.simplebrowser

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class InstagramActivity : AppCompatActivity() {
    lateinit var mWeb3:WebView
    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_instagram)


        title="Instagram"


        // WebView for Instagram

        mWeb3=findViewById(R.id.webView3)
        mWeb3.loadUrl("https://www.instagram.com/?hl=en")
        val webSetting=mWeb3.settings
        webSetting.javaScriptEnabled=true
        mWeb3.webViewClient= WebViewClient()
    }

    // backpress method
    override fun onBackPressed(){
        if(mWeb3.canGoBack()){
            mWeb3.goBack()

        }
        else{
            super.onBackPressed()
        }
    }
}