package com.example.simplebrowser

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.webkit.WebView
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_google.*

class GoogleActivity : AppCompatActivity() {
    // variable declare
    lateinit var mWeb:WebView
    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_google)

        title="Google"


        // WebView for google search
        mWeb=findViewById(R.id.webView)
        mWeb.loadUrl("https://google.com/")
        val webSetting=mWeb.settings
        webSetting.javaScriptEnabled=true
        mWeb.webViewClient= WebViewClient()

    }

    // backpress method
    override fun onBackPressed(){
        if(mWeb.canGoBack()){
            mWeb.goBack()

        }
        else{
            super.onBackPressed()
        }
    }
}
