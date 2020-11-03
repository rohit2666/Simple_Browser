package com.example.simplebrowser

import android.annotation.SuppressLint
import android.content.Intent
import android.net.sip.SipSession
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Button
import android.widget.SearchView

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Title
        title="AP Browser"
       var searchBtn=findViewById<SearchView>(R.id.search)
        
    






        val button=findViewById<Button>(R.id.google)
        button.setOnClickListener() {
            intent = Intent(this, GoogleActivity::class.java)
            startActivity(intent)
        }
        val fbutton=findViewById<Button>(R.id.facebook)
        fbutton.setOnClickListener() {
            intent = Intent(this, FacebookActivity::class.java)
            startActivity(intent)
        }
        val ytbutton=findViewById<Button>(R.id.youtube)
        ytbutton.setOnClickListener() {
            intent = Intent(this, YoutubeActivity::class.java)
            startActivity(intent)
        }
        val button1=findViewById<Button>(R.id.amazon)
        button1.setOnClickListener() {
            intent = Intent(this, AmazonActivity::class.java)
            startActivity(intent)
        }
        val button2=findViewById<Button>(R.id.twitter)
        button2.setOnClickListener() {
            intent = Intent(this, TwitterActivity::class.java)
            startActivity(intent)
        }
        val inbutton2=findViewById<Button>(R.id.flipkart)
        inbutton2.setOnClickListener() {
            intent = Intent(this, FlipkartActivity::class.java)
            startActivity(intent)
        }
        val inbutton3=findViewById<Button>(R.id.cric)
        inbutton3.setOnClickListener() {
            intent = Intent(this, CricbuzzActivity::class.java)
            startActivity(intent)
        }
        val inbutton4=findViewById<Button>(R.id.instagram)
        inbutton4.setOnClickListener() {
            intent = Intent(this, InstagramActivity::class.java)
            startActivity(intent)
        }
    }
}