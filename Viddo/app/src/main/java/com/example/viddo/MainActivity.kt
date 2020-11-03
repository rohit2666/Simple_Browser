package com.example.viddo

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mediaController= MediaController(this)
        mediaController.setAnchorView(videoView)
        val offLineUri= Uri.parse("android.resource://$packageName/${R.raw.videoplayback}")

        videoView.setMediaController(mediaController)
        videoView.setVideoURI(offLineUri)
        videoView.requestFocus()
        videoView.start()
    }
}