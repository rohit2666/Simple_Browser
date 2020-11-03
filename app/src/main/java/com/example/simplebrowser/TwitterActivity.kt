package com.example.simplebrowser

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class TwitterActivity : AppCompatActivity() {
    lateinit var mWebT:WebView
    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_twitter)
        title="Twitter"


        // WebView for Instagram

        mWebT=findViewById(R.id.webViewTwit)
        mWebT.loadUrl("https://twitter.com/search-home")
        val webSetting=mWebT.settings
        webSetting.javaScriptEnabled=true
        mWebT.webViewClient= WebViewClient()
    }

    // backpress method
    override fun onBackPressed(){
        if(mWebT.canGoBack()){
            mWebT.goBack()

        }
        else{
            super.onBackPressed()
        }
    }
}