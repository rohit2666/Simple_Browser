package com.example.simplebrowser

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class CricbuzzActivity : AppCompatActivity() {
    lateinit var mWebCri:WebView
    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cricbuzz)
        // to Hide or Remove Title Bar
        //if (supportActionBar != null)
          //  supportActionBar?.hide()

            title="Cricbuzz"

        mWebCri=findViewById(R.id.webViewCric)
        mWebCri.loadUrl("https://www.cricbuzz.com/")
        val webSetting=mWebCri.settings
        webSetting.javaScriptEnabled=true
        mWebCri.webViewClient= WebViewClient()
    }

    // backpress method
    override fun onBackPressed(){
        if(mWebCri.canGoBack()){
            mWebCri.goBack()

        }
        else{
            super.onBackPressed()
        }
    }
}