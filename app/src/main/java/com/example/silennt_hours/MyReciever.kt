package com.example.silennt_hours

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.media.AudioManager
import android.provider.MediaStore
import android.widget.Toast
import androidx.core.content.ContextCompat.getSystemService

class MyReciever : BroadcastReceiver() {

    //lateinit var audio:AudioManager
    override fun onReceive(context: Context?, intent: Intent?) {
      // val audi = getSystemService(Context.) as AudioManager

        Toast.makeText(context,"MANISH THAKUR",Toast.LENGTH_LONG).show()



    }
}