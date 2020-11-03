package com.example.simplebrowser

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class FacebookActivity : AppCompatActivity() {
    lateinit var mWeb1:WebView
    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_facebook)


        title="Facebook"

        mWeb1=findViewById(R.id.webView1)
        mWeb1.loadUrl("https://www.facebook.com/")
        val webSetting=mWeb1.settings
        webSetting.javaScriptEnabled=true
        mWeb1.webViewClient= WebViewClient()
    }
    override fun onBackPressed(){
        if(mWeb1.canGoBack()){
            mWeb1.goBack()

        }
        else{
            super.onBackPressed()
        }
    }
}