package com.example.simplebrowser

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class FlipkartActivity : AppCompatActivity() {
    lateinit var mWebF:WebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_flipkart)
        // to Hide or Remove Title Bar
       /* if (supportActionBar != null)
            supportActionBar?.hide()

        */
        title="Flipkart"


        // WebView for Instagram

        mWebF=findViewById(R.id.webViewFlipkart)
        mWebF.loadUrl("https://www.flipkart.com/")
        val webSetting=mWebF.settings
        webSetting.javaScriptEnabled=true
        mWebF.webViewClient= WebViewClient()
    }

    // backpress method
    override fun onBackPressed(){
        if(mWebF.canGoBack()){
            mWebF.goBack()

        }
        else{
            super.onBackPressed()
        }
    }
}