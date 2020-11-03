package com.example.simplebrowser

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class AmazonActivity : AppCompatActivity() {
    lateinit var mWebAmazon:WebView
    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_amazon)

        title="Amazon"


        // WebView for Instagram

        mWebAmazon=findViewById(R.id.webViewAmazon)
        mWebAmazon.loadUrl("https://www.amazon.in/")
        val webSetting=mWebAmazon.settings
        webSetting.javaScriptEnabled=true
        mWebAmazon.webViewClient= WebViewClient()
    }

    // backpress method
    override fun onBackPressed(){
        if(mWebAmazon.canGoBack()){
            mWebAmazon.goBack()

        }
        else{
            super.onBackPressed()
        }
    }
}