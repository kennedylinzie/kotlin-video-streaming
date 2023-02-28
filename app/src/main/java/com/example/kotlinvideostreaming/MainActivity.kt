package com.example.kotlinvideostreaming

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.net.Uri
import android.widget.MediaController
import android.widget.VideoView
import com.google.android.exoplayer2.MediaItem
import com.google.android.exoplayer2.SimpleExoPlayer
import com.google.android.exoplayer2.source.MediaSource
import com.google.android.exoplayer2.source.ProgressiveMediaSource
import com.google.android.exoplayer2.upstream.DataSource
import com.google.android.exoplayer2.upstream.DefaultDataSourceFactory
import com.google.android.exoplayer2.util.Util


class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

// Get the reference of VideoView
        val videoView = findViewById<VideoView>(R.id.videoView)

// Set the video URL
        val videoUrl = "http://10.0.2.2/stream_test/1.mp4"
        val uri = Uri.parse(videoUrl)
        videoView.setVideoURI(uri)

        // Create a MediaController object
        val controller = MediaController(this)

// Set the MediaController to control the VideoView
        controller.setMediaPlayer(videoView)

        videoView.setMediaController(controller)
       // videoView.


// Request focus and start the video
        videoView.requestFocus()
        videoView.start()

    }
}