package com.example.silennt_hours

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class splesh : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splesh)

        val handler = Handler(Looper.getMainLooper() )
        handler.postDelayed({
            val  intet = Intent(this ,MainActivity::class.java)
            startActivity(intet)
            finish()
        },4000)
    }
}